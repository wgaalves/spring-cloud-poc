FROM oracle-jdk:8u152-alpine-3.7

ADD ./target/monitoring-service.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/monitoring-service.jar"]

EXPOSE 8087