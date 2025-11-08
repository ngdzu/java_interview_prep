Combined compile (sources + tests):

```bash
javac -d out src/*.java test/*.java
```

Or compile `src` first, then compile tests using the compiled classes on the classpath:

```bash
javac -d out src/*.java
javac -d out -cp out test/*.java
```

## Notes

This lesson contains sample JDBC patterns. To run integration tests, start an H2 in-memory DB via Maven or include H2 jar on the classpath. Example (with Maven) is recommended for real tests.

### Note about compiling local tests

If you run the small, plain `javac`/`java` samples in the lesson folders, do NOT try to compile `test/*.java` alone — compile `src/` first or use the combined compile:

```bash
javac -d out src/*.java test/*.java
```

For real integration tests use Maven/Gradle and the H2 dependency instead of plain `javac`.

### Using Maven

This lesson folder is configured as a small Maven project (see `pom.xml`). Use Maven to compile and run tests (JUnit) and to manage the H2 runtime dependency for integration tests:

```bash
# compile & package without running tests
mvn -q -DskipTests package

# run tests (JUnit)
mvn -q test
```

If tests are still the simple assertion mains, use `mvn -DskipTests package` to compile sources.

Notes

This lesson contains sample JDBC patterns. To run integration tests, start an H2 in-memory DB via Maven or include H2 jar on the classpath. Example (with Maven) is recommended for real tests.