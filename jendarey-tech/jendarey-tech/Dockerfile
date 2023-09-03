# Use an official OpenJDK runtime as a parent image
FROM openjdk:8

# Set the working directory to /app
WORKDIR /app

# Copy the current directory contents into the container at /app
COPY . .

# Expose port 8080 to the outside world
EXPOSE 8080

# Copy the application JAR/WAR file into the container with a specific name
COPY target/jendarey-tech-0.0.1.war app.war

# Set the entry point for the container to run the application
ENTRYPOINT ["java", "-jar", "app.war"]
