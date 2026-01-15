# We use Amazon Corretto because 'openjdk' is deprecated
FROM amazoncorretto:17-alpine

WORKDIR /app

# Copy the built jar file
COPY target/trade-engine-1.0-SNAPSHOT.jar app.jar

# Expose the port
EXPOSE 8080

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
