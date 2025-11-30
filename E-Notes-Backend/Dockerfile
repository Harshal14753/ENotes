# Multi-stage Dockerfile for building and running the Spring Boot app on Render
# Build stage: use Maven with Temurin 23 to compile and package the app
FROM maven:3.9.6-eclipse-temurin-17 AS builder
WORKDIR /workspace

# Copy pom first to leverage Docker layer caching for dependencies
COPY pom.xml ./
# If the project uses the Maven wrapper, copy it too (optional)
COPY .mvn .mvn
COPY mvnw mvnw

# Install dependencies (no tests) and build the app
COPY src ./src
RUN mvn -B -DskipTests package

# Runtime stage: use a lightweight Temurin JRE 23 image
FROM eclipse-temurin:23-jre
WORKDIR /app

# Copy the jar produced by the builder stage. The jar filename will follow target/*.jar
COPY --from=builder /workspace/target/*.jar app.jar

EXPOSE 8080
# Tune memory as needed; Render will pass PORT env var which Spring reads via application.properties
ENV JAVA_OPTS="-Xms256m -Xmx512m"

# Run the jar
ENTRYPOINT ["java","-Xms256m","-Xmx512m","-jar","/app/app.jar"]

