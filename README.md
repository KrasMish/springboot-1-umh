# Spring Boot Demo App

This application implements several functionalities using Spring Boot and Thymeleaf:

- Palindrome checker
- Even number checker
- Square validation
- Basic calculator
- Greeting form

## Requirements

You need to have the following installed on your system:

- Java 8 or higher
- Maven
- Docker (optional, for containerized execution)

## Run locally

You can run the application using Maven:

```bash
./mvnw spring-boot:run

Or build a jar file and run it directly:

./mvnw package
java -jar target/demoapp-0.0.1-SNAPSHOT.jar

Once the application is running, open your browser and access the endpoints:

http://localhost:8080
 → Home page with your name

http://localhost:8080/saludoform
 → Greeting form

http://localhost:8080/palindrome
 → Check palindromes

http://localhost:8080/even
 → Check if a number is even

http://localhost:8080/square
 → Check if one number is the square of another

http://localhost:8080/calculator
 → Basic calculator

Tests

The project includes automated tests for both services and controllers:

ServiceTest.java → Tests the logic of all services (Palindrome, Even, Square, Calculator, and Saludo)

MockMvcTest.java → Tests that the controllers return the correct HTML

MockServiceTest.java → Example test using a mocked service

To run all tests:

./mvnw test

Project structure
src/
 ├─ main/java/demoapp
 │   ├─ controller/       ← Controllers
 │   ├─ service/          ← Services
 │   ├─ model/            ← Form objects (DTO)
 ├─ main/resources/templates/ ← Thymeleaf templates
 └─ test/java/demoapp     ← Unit and MockMvc tests
Dockerfile
pom.xml
README.md
Author

Mykhailo Krasin

Links:
Docker
https://hub.docker.com/r/kramish/spring-boot-demoapp
GitHub
https://github.com/KrasMish/springboot-1-umh