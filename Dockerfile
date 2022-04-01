FROM openjdk:17-slim-buster

COPY build/libs/unitech-ms-auth-0.0.1-SNAPSHOT.jar .

ENTRYPOINT java -jar unitech-ms-auth-0.0.1-SNAPSHOT.jar