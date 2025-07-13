FROM maven:3.9-eclipse-temurin-21

WORKDIR /app

COPY target/spring-kafka-docker-int-0.0.1-SNAPSHOT.jar /app/app.jar

CMD ["java", "-jar", "/app/app.jar"]