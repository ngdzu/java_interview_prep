## Collections and generics — best practices

The Collections framework is central to Java. Since Java 6, generics became ubiquitous and several convenience APIs and utility factory methods arrived. This lesson covers generic usage, wildcards, the Collections utility methods (`List.of`, `Map.of` in later JDKs), autoboxing pitfalls, and performance considerations (ArrayList vs LinkedList, HashMap sizing, load factor).

### Key takeaways

- Generics: know when to use `? extends` vs `? super`. Use PECS (Producer Extends, Consumer Super).
- Prefer `List`/`Map` interfaces in APIs and return unmodifiable views where appropriate.
- Use collection factory methods (Java 9+) for concise immutable collections.
- Watch autoboxing: avoid creating many temporary boxed numbers in hot loops.
- Understand complexity characteristics (random access vs sequential iteration).

### Sample coding

`src/Main.java` shows using generics with methods that accept a `List<? extends Number>` and demonstrates `List.of`.

### Quiz

1. Explain PECS with an example.
2. When would you use `LinkedList` over `ArrayList`?

### Small project

Implement a small utility that merges and sorts collections while maintaining type safety and minimal copying.

### Test

`test/TestMain.java` asserts expected results from merging utilities and demonstrates generic method invocation.

### Interview tip

When discussing Collections, demonstrate awareness of algorithmic complexity, memory tradeoffs, concurrency-safe collections, and when to prefer primitive-specialized libraries for memory/performance.