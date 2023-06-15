FROM eclipse-temurin:17

COPY target/myBlog-0.0.1-SNAPSHOT.jar /app/myBlog-0.0.1-SNAPSHOT.jar

EXPOSE 8081

CMD ["java", "-jar", "period-app-0.0.1-SNAPSHOT.jar"]