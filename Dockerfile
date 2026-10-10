FROM maven:3.9.6-eclipse-temurin-17 AS build
WORKDIR /app
COPY . .
RUN chmod +x ./mvnw
RUN ./mvnw clean package -DskipTests

FROM eclipse-temurin:17-jre-alpine
WORKDIR /app
COPY --from=build /app/target/*.jar /app/app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-Dspring.datasource.url=jdbc:h2:file:/app/data/schooldb;DB_CLOSE_ON_EXIT=FALSE;AUTO_RECONNECT=TRUE", "-Dspring.datasource.driverClassName=org.h2.Driver", "-Dspring.datasource.username=sa", "-Dspring.datasource.password=", "-Dspring.jpa.database-platform=org.hibernate.dialect.H2Dialect", "-Dspring.jpa.hibernate.ddl-auto=update", "-jar", "/app/app.jar"]
