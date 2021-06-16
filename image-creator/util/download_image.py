import time

import requests


def file_name(user_id: str):
    now = time.time_ns() / 1_000_000
    return user_id + '-' + str(now) + '.jpg'


def download_image(path: str, url: str):
    r = requests.get(url)

    with open(path, 'wb') as f:
        f.write(r.content)

