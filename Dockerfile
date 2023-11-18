FROM eclipse-temurin:17-jdk-alpine
RUN apk add curl
VOLUME /tmp
EXPOSE 8080
ADD target/spring-aws-ecs.jar spring-aws-ecs.jar
ENTRYPOINT ["java","-jar","/spring-aws-ecs.jar"]