FROM oracle-jdk:8u152-alpine-3.7

ADD ./target/mail-service.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/mail-service.jar"]

EXPOSE 8087