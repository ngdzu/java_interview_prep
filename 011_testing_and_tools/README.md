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

To run real JUnit 5 tests, use Maven/Gradle and include junit-jupiter dependencies. The sample here uses a simple assertion runner for quick checks.

### Using Maven

This lesson folder is configured as a small Maven project (see `pom.xml`). Use Maven to run JUnit tests and manage test dependencies:

```bash
# compile & package without running tests
mvn -q -DskipTests package

# run tests (JUnit)
mvn -q test
```

If tests are still the simple assertion mains, use `mvn -DskipTests package` to compile sources with Maven. For real unit tests prefer JUnit and a build tool (Maven/Gradle).