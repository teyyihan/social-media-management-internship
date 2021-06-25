from json import loads, dumps
from kafka import KafkaConsumer, KafkaProducer
from service import image_service
from config import config


def execute():
    consumer = KafkaConsumer(
        *config.KafkaConfigs["topics"],
        bootstrap_servers=['kafka:9092'],
        enable_auto_commit=True,
        value_deserializer=lambda x: loads(x.decode('utf-8')))

    producer = KafkaProducer(
        bootstrap_servers=['kafka:9092'],
        value_serializer=lambda x:
        dumps(x).encode('utf-8'))

    PUBLISH_POST_TOPIC = "{}.post.image"

    print("Listening topics: ", *config.KafkaConfigs["topics"])

    for message in consumer:
        topic = message.topic
        payload = message.value

        print("Message from topic: ", topic, " payload: ", payload)

        user_id = payload["userId"]
        overlay_text = payload["overlayText"]
        background_image = payload["backgroundImage"]

        image_link = image_service.process_image_creation_event(user_id, overlay_text, background_image)

        message_payload = {
            "userId": user_id,
            "images": [image_link],
            "body": payload["body"]
        }

        post_topic = PUBLISH_POST_TOPIC.format(payload["platform"])

        producer.send(post_topic, value=message_payload)

        print("Sent payload to: ", post_topic, " payload: ", message_payload)
