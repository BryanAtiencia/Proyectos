FROM mcr.microsoft.com/openjdk/jdk:17-ubuntu as base

EXPOSE 8080

ADD target/microservico-holamundo-docker.jar microservico-holamundo-docker.jar

ENTRYPOINT ["java", "-jar", "/microservico-holamundo-docker.jar"]