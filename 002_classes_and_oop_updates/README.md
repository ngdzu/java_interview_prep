Combined compile (sources + tests):

```bash
javac -d out src/*.java test/*.java
```

Or compile `src` first, then compile tests using the compiled classes on the classpath:

```bash
javac -d out src/*.java
javac -d out -cp out test/*.java
```

Build & run

Compile:

## Build & run

Compile:

```bash
javac -d out src/*.java
## Build & run

Compile everything (recommended, single step):

```bash
javac -d out src/*.java test/*.java
```

Or compile sources first, then tests (correct two-step):

```bash
javac -d out src/*.java
javac -d out -cp out test/*.java
```

Run sample:

```bash
java -cp out dev.playground.lesson.Main
```

Run the assertion-style test:

```bash
java -ea -cp out dev.playground.lesson.TestMain
```

### Using Maven

This lesson folder is configured as a small Maven project (see `pom.xml`). You can use Maven instead of hand-running `javac`/`java`:

```bash
# compile & package without running tests
mvn -q -DskipTests package

# run tests (JUnit)
mvn -q test
```

If the lesson tests are still the simple assertion mains, they may need conversion to JUnit; in the meantime use `mvn -DskipTests package` to compile the sources with Maven.

Notes: Replace package/name as needed. Use an appropriate JDK when running newer language features.
