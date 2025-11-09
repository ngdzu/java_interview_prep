Lesson 004_02 — Stream.collect (Collectors deep dive)

Overview

This lesson explores `Stream.collect` in depth. `collect` is a mutable reduction: it accumulates stream elements into a mutable container (for example, a List, Set or Map) using a `Collector` which supplies a container, an accumulator, and a combiner for parallel execution. Java's `Collectors` library provides a rich set of ready-made collectors; learning them lets you express complex reductions declaratively and efficiently.

Core concepts

- Supplier / Accumulator / Combiner: a `Collector` defines how to create the result container, how to add an element, and how to merge two partial results for parallel processing. The JDK collectors are implemented with these primitives for performance.
- Downstream collectors: many collectors accept another collector as a downstream argument — for example `groupingBy(classifier, counting())` or `groupingBy(classifier, mapping(fn, toList()))`.
- Immutable vs view: `Collectors.toList()` returns a mutable list; `Collectors.toUnmodifiableList()` or `collectingAndThen(toList(), List::copyOf)` give immutable results.

Common patterns and examples

1) Basic collections: `toList()`, `toSet()`, `toCollection(...)` for concrete types.

2) toMap: use a merge function or grouping when keys may collide. Prefer `groupingBy` when many-to-one relationships exist.

3) groupingBy + downstream: `groupingBy(keyFn, mapping(valueFn, toList()))` is a compact way to group and transform values.

4) partitioningBy for boolean splits: produces `Map<Boolean, List<T>>` which is useful for easy true/false splits.

5) summarizing/counting/joining: fast helpers for aggregation and string joining.

Practical tips

- For large datasets and parallel streams, prefer concurrent collectors (e.g., `groupingByConcurrent`) or collectors that provide `CONCURRENT` characteristics.
- Use primitive-specialized collectors (`summarizingInt`, `summingInt`) to avoid boxing overhead.
- When exposing API results prefer returning an unmodifiable collection (`List.copyOf(...)`) so callers cannot mutate shared state.

Exercises

1) Given a list of Person(name, age, city), produce a map city -> list of names sorted alphabetically.
2) Create a collector that accumulates top-N elements by a comparator without building a full sorted list.
3) Benchmark `groupingBy` vs `groupingByConcurrent` on a large parallel stream.

This lesson gives you the tools to replace many imperative accumulation loops with concise, expressive collectors. Practice by finding small for-loops in earlier lessons and expressing them with `collect` and the right downstream collector.
````markdown
Lesson 004_02 — Stream.collect (Collectors deep dive)

Overview

This lesson explores `Stream.collect` in depth. `collect` is a mutable reduction: it accumulates stream elements into a mutable container (for example, a List, Set or Map) using a `Collector` which supplies a container, an accumulator, and a combiner for parallel execution. Java's `Collectors` library provides a rich set of ready-made collectors; learning them lets you express complex reductions declaratively and efficiently.

Core concepts

- Supplier / Accumulator / Combiner: a `Collector` defines how to create the result container, how to add an element, and how to merge two partial results for parallel processing. The JDK collectors are implemented with these primitives for performance.
- Downstream collectors: many collectors accept another collector as a downstream argument — for example `groupingBy(classifier, counting())` or `groupingBy(classifier, mapping(fn, toList()))`.
- Immutable vs view: `Collectors.toList()` returns a mutable list; `Collectors.toUnmodifiableList()` or `collectingAndThen(toList(), List::copyOf)` give immutable results.

Common patterns and examples

1) Basic collections: `toList()`, `toSet()`, `toCollection(...)` for concrete types.

2) toMap: use a merge function or grouping when keys may collide. Prefer `groupingBy` when many-to-one relationships exist.

3) groupingBy + downstream: `groupingBy(keyFn, mapping(valueFn, toList()))` is a compact way to group and transform values.

4) partitioningBy for boolean splits: produces `Map<Boolean, List<T>>` which is useful for easy true/false splits.

5) summarizing/counting/joining: fast helpers for aggregation and string joining.

Practical tips

- For large datasets and parallel streams, prefer concurrent collectors (e.g., `groupingByConcurrent`) or collectors that provide `CONCURRENT` characteristics.
- Use primitive-specialized collectors (`summarizingInt`, `summingInt`) to avoid boxing overhead.
- When exposing API results prefer returning an unmodifiable collection (`List.copyOf(...)`) so callers cannot mutate shared state.

Exercises

1) Given a list of Person(name, age, city), produce a map city -> list of names sorted alphabetically.
2) Create a collector that accumulates top-N elements by a comparator without building a full sorted list.
3) Benchmark `groupingBy` vs `groupingByConcurrent` on a large parallel stream.

This lesson gives you the tools to replace many imperative accumulation loops with concise, expressive collectors. Practice by finding small for-loops in earlier lessons and expressing them with `collect` and the right downstream collector.
````
