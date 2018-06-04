FROM openjdk:8-jdk-alpine

MAINTAINER Albert Costas

VOLUME /tmp

# Add Spring Boot app.jar to Container
ADD "build/libs/spring-boot-d3js-web-static-1.jar" /home/app.jar

ENV JAVA_OPTS=""

# Fire up our Spring Boot app by default
CMD ["java","-jar","/home/app.jar"]