
## Compile & run (tests)

Combined compile (sources + tests):

```bash
javac -d out src/*.java test/*.java
```

Or compile `src` first, then compile tests using the compiled classes on the classpath:

```bash
javac -d out src/*.java
javac -d out -cp out test/*.java
```

## Using Maven per-lesson

Each lesson folder now includes a small `pom.xml` so you can use Maven to compile and run tests. From a lesson folder (for example `001_modern_java_syntax`):

```bash
# compile & package without running tests
mvn -q -DskipTests package

# run tests (JUnit)
mvn -q test
```

If a lesson's tests are still the quick assertion mains, use `mvn -DskipTests package` to compile the sources until tests are converted to JUnit.
