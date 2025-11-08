Spring Boot basics and common patterns

Spring remains dominant in enterprise Java. For interviews, know core concepts: dependency injection, inversion of control, REST controllers, configuration, and Spring Boot auto-configuration. You should be able to explain how dependency injection works and write a simple REST controller.

Key concepts:
- @Component/@Service/@Repository and constructor injection best practices.
- @Autowired vs constructor injection; prefer immutable fields and constructors.
- Spring Boot starters and auto-configuration speeds bootstrapping.
- REST controllers: @RestController and mapping annotations.

Sample coding: a tiny controller and a service class skeleton (not a full Spring Boot app in this folder — README explains how to generate a starter project).

Quiz:
1. Why prefer constructor injection? 2. How does Spring manage bean scopes?

Small project: create a Spring Boot starter project with one REST endpoint and a unit test for the service layer.

Interview tip: if you claim Spring experience, be ready to discuss lifecycle, application context, and how to test Spring components (slice tests, @WebMvcTest, @SpringBootTest)."