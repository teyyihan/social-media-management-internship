import random
import string

from util import draw_image, download_image

font = draw_image.load_font()


def generate_random_link():
    letters = string.ascii_lowercase
    random_path = ''.join(random.choice(letters) for _ in range(10))
    return "https://i0.social.com/" + str(random_path)


def process_image_creation_event(user_id, overlay_text, background_image):

    if background_image is None:
        image = draw_image.load_empty_image()
    else:
        image = download_image.download_image(background_image)

    if overlay_text is not None:
        image = draw_image.set_text_center(image, overlay_text, font)

    draw_image.save_image(image, user_id)

    return generate_random_link()