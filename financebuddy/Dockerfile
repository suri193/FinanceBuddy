# ---- Build stage ----
FROM maven:3.9.6-eclipse-temurin-21 AS builder
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn clean package -DskipTests

# ---- Runtime stage ----
FROM eclipse-temurin:21-jre
WORKDIR /app
COPY --from=builder /app/target/*.jar financebuddy-v1.0.jar
EXPOSE 9090
ENTRYPOINT ["java", "-jar", "financebuddy-v1.0.jar"]
