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
### Using Maven

This lesson folder is configured as a small Maven project (see `pom.xml`). You can use Maven instead of hand-running `javac`/`java`:

```bash
# compile & package without running tests
mvn -q -DskipTests package

# run tests (JUnit)
mvn -q test
```

If the lesson tests are still the simple assertion mains, they may need conversion to JUnit; in the meantime use `mvn -DskipTests package` to compile the sources with Maven.

Run sample (with small heap):

```bash
java -Xmx128m -cp out dev.playground.lesson.Main
```

To observe GC, run with:

```bash
java -Xmx128m -Xlog:gc* -cp out dev.playground.lesson.Main
```

*** End Patch

