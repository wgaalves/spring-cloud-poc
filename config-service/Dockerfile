FROM oracle-jdk:8u152-alpine-3.7

ADD ./target/config-service.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/config-service.jar"]

EXPOSE 8081