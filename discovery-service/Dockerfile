FROM anapsix/alpine-java:8

ADD ./target/discovery-service.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/discovery-service.jar"]

EXPOSE 8082