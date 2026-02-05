# -------- Stage 1: Build the Application --------
FROM eclipse-temurin:21-jdk AS builder

WORKDIR /app

# Copy Maven wrapper files
COPY mvnw .
COPY .mvn .mvn

# Give execute permission to mvnw
RUN chmod +x mvnw

# Copy pom.xml
COPY pom.xml .

# Download dependencies
RUN ./mvnw dependency:go-offline

# Copy source code
COPY src src

# Build application
RUN ./mvnw clean package -DskipTests


# -------- Stage 2: Run the Application --------
FROM eclipse-temurin:21-jre

WORKDIR /app

COPY --from=builder /app/target/*.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]
