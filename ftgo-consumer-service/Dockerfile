# Use an OpenJDK base image
FROM openjdk:17-jdk-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the JAR file from the build context (target directory)
COPY ftgo-consumer-service/build/libs/ftgo-consumer-service-1.0-SNAPSHOT.jar app.jar

# Expose the application port (usually 8080)
EXPOSE 8080

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]