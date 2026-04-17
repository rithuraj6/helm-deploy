FROM eclipse-temurin:17-jdk-jammy

WORKDIR /app

COPY target/hello-app-1.0-SNAPSHOT.jar app.jar

EXPOSE 8081

CMD ["java","-jar","app.jar"]