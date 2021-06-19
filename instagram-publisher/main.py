import io

import requests
from PIL import Image
from kafka import KafkaConsumer
from json import loads


def get_kafka_consumer():
    return KafkaConsumer(
        *['instagram.post.image'],
        bootstrap_servers=['localhost:9092'],
        enable_auto_commit=True,
        value_deserializer=lambda x: loads(x.decode('utf-8')))


def download_image(url):
    data = requests.get(url).content
    return Image.open(io.BytesIO(data))


DUMMY_INSTAGRAM_POST_URL = "https://upload.instagram.com"

# TODO: toggle demo fake via config

if __name__ == '__main__':
    consumer = get_kafka_consumer()

    for message in consumer:
        topic = message.topic

        payload = message.value
        user_id = payload.userId
        images = payload.images
        body = payload.body

        # TODO: upload images
