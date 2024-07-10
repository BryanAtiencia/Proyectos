FROM mcr.microsoft.com/openjdk/jdk:17-ubuntu as base

EXPOSE 8080

ADD target/product-service-docker.jar product-service-docker.jar

ENTRYPOINT ["java", "-jar", "/product-service-docker.jar"]