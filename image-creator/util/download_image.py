import io
import time

import requests
from PIL import Image


def file_name(user_id: str):
    now = time.time_ns() / 1_000_000
    return user_id + '-' + str(now) + '.jpg'


def download_image(url):
    data = requests.get(url).content
    return Image.open(io.BytesIO(data))

