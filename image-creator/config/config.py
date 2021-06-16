import yaml
import os

dir_name = os.path.dirname(__file__)
filename = os.path.join(dir_name, 'kafka-config.yaml')

KafkaConfigs = {}

with open(filename) as file:
    documents = yaml.full_load(file)

    for item, doc in documents.items():
        KafkaConfigs[item] = doc
