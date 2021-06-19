import requests
from kafka import KafkaConsumer
from json import loads


def get_kafka_consumer():
    return KafkaConsumer(
        *['instagram.post.image.custom', 'twitter.post.image'],
        bootstrap_servers=['localhost:9092'],
        enable_auto_commit=True,
        value_deserializer=lambda x: loads(x.decode('utf-8')))


DUMMY_INSTAGRAM_POST_URL = "https://upload.instagram.com"

if __name__ == '__main__':
    consumer = get_kafka_consumer()

    for message in consumer:
        topic = message.topic
        payload = message.value

        """
        {
        text: "Merhaba bu ilk postum",
        image: "https://",
        userId  ???
        }
        """

        post_data = {}

        requests.post(DUMMY_INSTAGRAM_POST_URL, data=post_data)
