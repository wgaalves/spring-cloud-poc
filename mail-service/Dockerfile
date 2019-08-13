FROM anapsix/alpine-java:8

ADD ./target/mail-service.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/mail-service.jar"]

EXPOSE 8087