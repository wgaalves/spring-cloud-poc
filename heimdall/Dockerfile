FROM anapsix/alpine-java:8

ADD ./target/heimdall.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/heimdall.jar"]

EXPOSE 8086