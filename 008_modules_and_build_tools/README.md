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

This lesson is informational. For exercises, initialize a Maven project using `mvn archetype:generate` or create a Gradle build. Use IDE support for module creation and `module-info.java` if experimenting with JPMS.

### Note about compiling local tests

If you use the small lesson samples (plain `javac`/`java`) elsewhere in this repo, do NOT compile `test/*.java` alone — compile `src/` first or use the combined compile:

```bash
javac -d out src/*.java test/*.java
```

For multi-module or Maven/Gradle builds, prefer the build tool rather than the plain `javac` commands above.

### Using Maven

This lesson folder can be used with Maven. To compile and test using Maven (preferred):

```bash
# compile and package without running tests
mvn -q -DskipTests package

# run tests (JUnit)
mvn -q test
```

If you only want to compile sources with Maven (tests not yet converted), run:

```bash
mvn -q -DskipTests package
```

Notes

This lesson is informational. For exercises, initialize a Maven project using `mvn archetype:generate` or create a Gradle build. Use IDE support for module creation and module-info.java if experimenting with JPMS.