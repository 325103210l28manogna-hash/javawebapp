FROM eclipse-temurin:17-jre

COPY target/javawebapp-1.0.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]