FROM mcr.microsoft.com/openjdk/jdk:17-ubuntu as base

EXPOSE 8080

ADD target/microservico-holaspider-docker.jar microservico-holaspider-docker.jar

ENTRYPOINT ["java", "-jar", "/microservico-holaspider-docker.jar"]