FROM oracle-jdk:8u152-alpine-3.7

ADD ./target/discovery-service.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/discovery-service.jar"]

EXPOSE 8082