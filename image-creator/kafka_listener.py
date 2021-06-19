from config import config
from json import loads, dumps
from kafka import KafkaConsumer, KafkaProducer

consumer = KafkaConsumer(
    *['instagram.post.image', 'twitter.post.image'],
    bootstrap_servers=['localhost:9092'],
    enable_auto_commit=True,
    value_deserializer=lambda x: loads(x.decode('utf-8')))

producer = KafkaProducer(bootstrap_servers=['localhost:9092'],
                         value_serializer=lambda x:
                         dumps(x).encode('utf-8'))

# TODO: payload'da isteğin de bir id'si olmalı
for message in consumer:
    topic = message.topic
    payload = message.value
    # TODO: proccess and publish message with a image link, userId and isteğin id'si
    returnValue = {}
    producer.send(topic, value=returnValue)
