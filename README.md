Interview prep sample Spring Boot project

What this contains
- Minimal Spring Boot (Maven) app with a Person entity, REST API, and an integration test.

How to build and run (locally)
1. Ensure Java 17+ and Maven are installed.
2. From project root run:

   mvn clean package

3. Run the app:

   java -jar target/interview-sb-0.0.1-SNAPSHOT.jar

Run tests:

   mvn test

Notes
- The project uses H2 in-memory DB. Helpful for iterating on JPA and tests.
