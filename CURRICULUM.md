# Java Interview Prep — Curriculum

This course is designed to bring a Java 6-era engineer up to modern Java (Java 8+ and key later features) with practical lessons focused on typical interview topics. Each lesson contains: a ~300–500 word lesson writeup, sample code, a small test, a quiz, and a tiny project idea. Folders are numbered for sequential work.

Total lessons: 12

1. 001_modern_java_syntax — Modern Java syntax and language changes (var, text blocks, records, sealed classes)
2. 002_classes_and_oop_updates — Classes, records, sealed classes, interfaces (default/private methods), and improvements since Java 6
3. 003_collections_and_generics — Collections framework updates, generics best practices, type inference
4. 004_streams_and_functional — Streams API, lambda expressions, functional style, common patterns
5. 005_date_time_api — java.time (JSR-310): LocalDate/Time, Zone, formatting, best practices
6. 006_concurrency_and_parallelism — Threads, ExecutorService, ForkJoin, CompletableFuture
7. 007_jvm_memory_and_gc — JVM internals, memory model basics, GC types and tuning concepts
8. 008_modules_and_build_tools — Java Modules (JPMS), Maven vs Gradle, multi-module projects
9. 009_io_and_nio2 — java.io vs java.nio, Paths, Files, asynchronous I/O basics
10. 010_jdbc_transactions — JDBC modern usage, connection management, transactions, connection pools
11. 011_testing_and_tools — JUnit 5, Mockito basics, test design for interviews
12. 012_spring_boot_basics_and_patterns — Spring Boot core concepts, DI, REST controller patterns, small app

Folder format: `NNN_topic_name` (e.g. `001_modern_java_syntax`). Inside each folder:
- `lesson.md` — the 300–500 word lesson + quiz + small project suggestion
- `README.md` — how to compile/run the sample
- `src/Main.java` — sample code demonstrating the topic
- `test/TestMain.java` — a tiny test runnable with `java -ea` or via your IDE

Work flow suggestion:
1. Read folder `NNN`'s `lesson.md` and `README.md`.
2. Compile and run `src/Main.java`.
3. Run `test/TestMain.java` with assertions enabled (`-ea`).
4. Attempt the quiz and the small project.

If you'd like, I can now (A) create all lesson contents and code (I will), or (B) create them in smaller batches and pause for review after each batch. Reply if you prefer incremental delivery; otherwise I'll create everything now.
