Streams and functional programming in Java

Java 8 introduced lambda expressions and the Streams API — a huge shift in idiomatic Java. Understanding streams, lazy operations, intermediate vs terminal operations, and common collectors is crucial. This lesson focuses on mapping, filtering, flatMap, reduction, collectors, and pitfalls like accidental parallelism or stateful lambdas.

Important notes:
- Streams are not data structures; operations are lazy until a terminal operation runs.
- Prefer stateless lambdas; avoid shared mutable state in stream pipelines.
- Collectors: `toList()`, `toMap()`, `groupingBy`, `partitioningBy` are common interview topics.
- Parallel streams: good for CPU-bound stateless operations; measure before using.

Sample coding: Demonstrate a pipeline that reads a list of strings, maps to trimmed lowercase, filters by length, groups by first character, and collects counts.

Quiz:
1. Explain the difference between map and flatMap. 2. Why avoid mutable state in stream operations?

Small project: process a small CSV file using streams and collect statistics (counts, averages) using collectors.

Test: `test/TestMain.java` asserts collector output and validates stream pipeline correctness.

Interview tip: show you know both the functional approach and how to convert streams to simple loops when needed for performance or clarity.