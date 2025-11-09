Lesson 004_01 — Stream terminal operations

Overview

Streams are processed with a pipeline of intermediate operations and a single terminal operation. The terminal operation triggers processing and produces a result or side-effect. This lesson covers the most commonly used terminal operations, when to use them, and pitfalls.

Common terminal operations

1. forEach / forEachOrdered
- Purpose: perform side-effects for each element.
- Ordering: `forEach` may be unordered for parallel streams; `forEachOrdered` preserves encounter order.

Example:
```java
list.stream().filter(s -> s.length()>3).forEach(System.out::println);
list.parallelStream().forEachOrdered(System.out::println);
```

2. collect
- Purpose: mutable reduction; collect elements into a collection or summary result using `Collector`.
- Common collectors: `Collectors.toList()`, `toSet()`, `toMap()`, `joining()`, `groupingBy()`, `partitioningBy()`, `toCollection()`.

Example:
```java
List<String> out = list.stream().map(String::trim).collect(Collectors.toList());
Map<Character, Long> counts = list.stream()
   .collect(Collectors.groupingBy(s -> s.charAt(0), Collectors.counting()));
```

3. reduce
- Purpose: general immutable reduction using a BinaryOperator. Useful when you want a single value (sum, concatenation).
- Forms: `reduce(identity, accumulator)`, `reduce(accumulator)` (returns Optional), `reduce(identity, accumulator, combiner)` for parallel.

Example:
```java
int sum = ints.stream().reduce(0, Integer::sum);
Optional<String> maybe = words.stream().reduce((a,b) -> a + "," + b);
```

When to prefer `collect` vs `reduce`
- `collect` is preferable for mutable reductions (building collections) as it uses efficient mutable accumulation.
- `reduce` is good for pure immutable results or simple numeric accumulation.

4. min / max
- Purpose: find smallest/largest element using Comparator. Returns Optional<T>.

Example:
```java
Optional<Integer> min = ints.stream().min(Comparator.naturalOrder());
```

5. findFirst / findAny
- Purpose: retrieve an element (Optional). `findAny` can be more efficient on parallel streams.
- Use `findFirst` when encounter order matters.

6. anyMatch / allMatch / noneMatch
- Purpose: short-circuiting predicates.
- Useful for quick checks: `list.stream().anyMatch(s->s.isEmpty())`.

7. count
- Purpose: returns long count of elements after pipeline.

8. summaryStatistics
- Purpose: numeric summaries (IntSummaryStatistics etc.) used via `Collectors.summarizingInt` or `mapToInt().summaryStatistics()`.

9. toArray
- Purpose: produce an array. Use typed variant: `toArray(String[]::new)` to get `String[]`.

Advanced collector patterns

- groupingBy with downstream collectors (counting, mapping, summingInt)
- partitioningBy(predicate) returns Map<Boolean, List<T>>
- Collector.of to write your custom collector when none of JDK collectors fit

Pitfalls and performance

- Avoid using `reduce` to create mutable collections — prefer `collect`.
- When using parallel streams, ensure your collectors are concurrent or thread-safe or use `Collectors.toConcurrentMap`.
- Beware of boxing/unboxing in primitive streams; use `mapToInt`/`mapToLong` when dealing with primitives.

Exercises

1. Count how many words start with each letter in a list (use groupingBy and counting).
2. Implement a collector that concatenates strings with a delimiter but avoids building many intermediate strings.
3. Compare sequential vs parallel performance for a large dataset using `forEachOrdered` and `forEach`.

This lesson focuses on the terminal operation vocabulary and selection. Practice by converting imperative loops to stream pipelines and choosing the correct terminal operation depending on whether you need a side-effect, a reduced value, or a collection.