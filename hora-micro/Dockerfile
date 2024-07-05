FROM mcr.microsoft.com/openjdk/jdk:17-ubuntu as base

EXPOSE 8080

ADD target/hora-micro-docker.jar hora-micro-docker.jar

ENTRYPOINT ["java", "-jar", "/hora-micro-docker.jar"]