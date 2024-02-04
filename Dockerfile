FROM eclipse-temurin:21-alpine

LABEL author="Fredy Huachaca"

WORKDIR /app

COPY target/ms-usuarios-0.0.1-SNAPSHOT.jar  .

EXPOSE 9090

ENTRYPOINT ["java","-jar","ms-usuarios-0.0.1-SNAPSHOT.jar"]


