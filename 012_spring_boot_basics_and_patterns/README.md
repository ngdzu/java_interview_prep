## Notes

This folder is informational; to practice, generate a Spring Boot project at https://start.spring.io/ and add a controller/service. IDEs like IntelliJ can create and run Spring Boot apps quickly.


Combined compile (sources + tests):

```bash
javac -d out src/*.java test/*.java
```

Or compile `src` first, then compile tests using the compiled classes on the classpath:

```bash
javac -d out src/*.java
javac -d out -cp out test/*.java
```

Notes

This folder is informational; to practice, generate a Spring Boot project at https://start.spring.io/ and add a controller/service. IDEs like IntelliJ can create and run Spring Boot apps quickly.