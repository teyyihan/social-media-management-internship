import os
import time
from PIL import Image, ImageFont, ImageDraw

IMG_DIRECTORY = "../images/"


def load_image_from_path(path: str):
    return Image.open(path)


def load_empty_image():
    return Image.new('RGB', (900, 900))


def load_font():
    return ImageFont.truetype("static/arial.ttf", size=50)


def set_text_center(img: Image, text: str, font: ImageFont):
    W, H = img.size
    draw = ImageDraw.Draw(img)
    w, h = draw.textsize(text, font=font)
    draw.text(((W - w) / 2, (H - h) / 2), text, fill="white", font=font)

    return img


def get_absolute_path(path: str):
    dir_name = os.path.dirname(__file__)
    return os.path.join(dir_name, path)


def save_image(img: Image, user_id: str):
    now = time.time_ns() / 1_000_000

    file_path = user_id + '-' + str(now) + '.jpg'

    img.save(get_absolute_path(IMG_DIRECTORY + file_path))
