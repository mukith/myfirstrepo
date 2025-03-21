FROM openjdk:17
WORKDIR /app
COPY target/my-maven-project-1.0-SNAPSHOT.jar app.jar
CMD ["java", "-jar", "app.jar"]
EXPOSE 90
