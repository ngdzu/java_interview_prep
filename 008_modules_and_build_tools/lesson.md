Java Modules and build tools (Maven/Gradle)

Java 9 introduced the Java Platform Module System (JPMS). While many codebases still use the classpath, modules help express strong encapsulation and reliable configuration. This lesson covers modules basics and when they matter, plus a short overview of Maven/Gradle and multi-module project patterns.

Key points:
- module-info.java: declare `requires` and `exports`. Modules help with strong encapsulation and avoiding split packages.
- When to use modules: large platforms and tools; many libraries still target the classpath for simplicity.
- Build tools: Maven is conventional and interview-common; Gradle is more flexible. Know dependency scopes, lifecycle (compile/test/package), and multi-module setups.

Sample coding: simple module declaration and a short Maven-like build note in README.

Quiz:
1. What’s the difference between classpath and module path? 2. When would you use a multi-module project?

Small project: convert a small multi-component app to a multi-module build using Maven or Gradle.

Test: none specific — focus on build/run commands.

Interview tip: show practical knowledge (how to declare dependencies and the difference between compile/runtime/test scopes) rather than deep JPMS trivia unless role demands it.