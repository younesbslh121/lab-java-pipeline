# Utilisation d'une image légère pour le Cloud (Alpine)
FROM eclipse-temurin:17-jre-alpine
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
# Exécution de l'application
ENTRYPOINT ["java","-jar","/app.jar"]
