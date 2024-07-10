FROM mcr.microsoft.com/openjdk/jdk:17-ubuntu as base

EXPOSE 8080

ADD target/email-service-docker.jar email-service-docker.jar

ENTRYPOINT ["java", "-jar", "/email-service-docker.jar"]