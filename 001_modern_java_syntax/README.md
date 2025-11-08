## Overview

This lesson uses plain `javac`/`java` so you can experiment without Maven or Gradle. It demonstrates modern Java syntax (records, text blocks, `var`).

## Build & run

This lesson is packaged as a small per-lesson Maven project (see `pom.xml`). Maven is the recommended way to build and run the lesson because it handles compilation, test execution, and dependencies consistently.

### Using Maven (recommended)

```bash
# compile & package without running tests
mvn -q -DskipTests package

# run tests (JUnit)
mvn -q test
```

Run the lesson Main with Maven (recommended options)

You can run the lesson's `Main` class directly with Maven using the Exec plugin. The plugin will compile the project if needed.

```bash
# compile (skip tests) then run Main
mvn -q -DskipTests compile exec:java -Dexec.mainClass=dev.playground.lesson.Main

# or run directly (Maven will compile first)
mvn -q -DskipTests exec:java -Dexec.mainClass=dev.playground.lesson.Main
```

Alternatively, package and run the classes from `target/classes` without creating an executable jar:

```bash
mvn -q -DskipTests package
java -cp target/classes dev.playground.lesson.Main
```

Note: some lessons still contain simple "assertion mains" in `test/` (these are small runnable checkers, not yet converted to JUnit). If a lesson's tests are still assertion mains, `mvn test` won't run them as unit tests; use `mvn -DskipTests package` to compile the sources, or convert the test to JUnit (see the project-wide notes).

---

## Build & run (javac / java)

If you prefer not to use Maven you can still compile and run the examples using the JDK command-line tools. This is intentionally separate from the Maven workflow and intended for quick experimentation.

Combined compile (sources + tests):

```bash
javac -d out src/*.java test/*.java
```

Or compile `src` first, then compile tests using the compiled classes on the classpath:

```bash
javac -d out src/*.java
javac -d out -cp out test/*.java
```

Run the sample Main:

```bash
java -cp out dev.playground.lesson.Main
```

Run the assertion-style test with assertions enabled:

```bash
java -ea -cp out dev.playground.lesson.TestMain
```
