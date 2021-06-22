FROM openjdk:15
COPY gateway-0.0.1-SNAPSHOT.jar /
COPY wait-for-it.sh /
ENTRYPOINT ["./wait-for-it.sh", "kafka:9092","--timeout=60", "--", "java", "-jar","gateway-0.0.1-SNAPSHOT.jar"]
