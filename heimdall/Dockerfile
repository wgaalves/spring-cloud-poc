FROM oracle-jdk:8u152-alpine-3.7

ADD ./target/heimdall.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/heimdall.jar"]

EXPOSE 8087