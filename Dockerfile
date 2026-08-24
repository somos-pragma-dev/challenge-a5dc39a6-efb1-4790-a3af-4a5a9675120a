FROM openjdk:21-jdk-slim AS build
WORKDIR /app
COPY..
RUN./mvnw package -DskipTests

FROM openjdk:21-jdk-slim AS runtime
WORKDIR /app
COPY --from=build /app/target/ecommerce-0.0.1-SNAPSHOT.jar /app/ecommerce.jar
ENTRYPOINT ["java", "-jar", "/app/ecommerce.jar"]