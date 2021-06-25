FROM python:3.9

WORKDIR /app

COPY requirements.txt requirements.txt

RUN pip3 install -r requirements.txt

COPY . .

ENTRYPOINT ["./wait-for-it.sh", "kafka:9092","--timeout=60", "--", "python3", "-u", "main.py"]