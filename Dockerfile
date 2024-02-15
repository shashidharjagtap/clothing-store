# Use an official Java runtime as a parent image
FROM openjdk:11-jre-slim

# Set the working directory in the container
WORKDIR /usr/src/app

# Copy the application JAR file into the container
COPY ./target/clothing-store.jar .

# Specify the command to run your application
CMD ["java", "-jar", "clothing-store.jar"]

