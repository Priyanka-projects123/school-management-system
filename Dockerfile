FROM maven:3.9.6-eclipse-temurin-17 AS build
WORKDIR /app
COPY . .
RUN chmod +x ./mvnw
RUN ./mvnw clean package -DskipTests

FROM eclipse-temurin:17-jre-alpine
WORKDIR /app
RUN mkdir -p /app/data
COPY --from=build /app/target/*.jar /app/app.jar

ENV SPRING_DATASOURCE_URL=jdbc:h2:file:/app/data/schooldb;DB_CLOSE_DELAY=-1;DB_CLOSE_ON_EXIT=FALSE;AUTO_RECONNECT=TRUE
ENV SPRING_DATASOURCE_DRIVER=org.h2.Driver
ENV SPRING_DATASOURCE_USERNAME=sa
ENV SPRING_DATASOURCE_PASSWORD=

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app/app.jar"]
