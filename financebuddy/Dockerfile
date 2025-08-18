FROM eclipse-temurin:21-jre
WORKDIR /app
COPY --from=builder /app/target/*.jar financebuddy-v1.0.jar
EXPOSE 9090
ENTRYPOINT ["java", "-jar", "financebuddy-v1.0.jar"]
