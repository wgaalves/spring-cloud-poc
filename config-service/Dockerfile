FROM anapsix/alpine-java:8

ADD ./target/config-service.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/config-service.jar"]

EXPOSE 8081