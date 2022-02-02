FROM java:8-jdk-alpine

COPY /target/ProjectOne-0.0.1-SNAPSHOT.jar /projectone.jar

CMD ["java","-jar","projectone.jar"]