Testing, JUnit 5 and Mockito basics

Testing is essential for quality and often discussed in interviews. Focus on JUnit 5 (Jupiter) and a mocking framework like Mockito. Learn to write unit tests, parameterized tests, and simple mocking for dependencies. Understand test structure: arrange-act-assert and isolation of units.

Key topics:
- JUnit 5 annotations: @Test, @BeforeEach, @AfterEach, @ParameterizedTest.
- Assertions and assumptions.
- Mockito basics: mock, when, verify; avoid over-mocking — prefer testing behavior over implementation details.
- Integration tests: use lightweight embedded resources (H2) or Spring Boot test support.

Sample coding: a small class with pure logic and its JUnit-style test (here we include a simple assertion runner; for real tests use Maven/Gradle with junit-jupiter).

Quiz:
1. When to use a mock vs a stub? 2. How do you test exceptions?

Small project: add tests for a small service class with mocked dependencies, and include a parameterized test for edge cases.

Interview tip: talk about test design, not just the framework — mention maintainability, deterministic tests, and fast feedback loops.