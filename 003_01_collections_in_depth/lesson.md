# Lesson 003_01: Java Collections in Depth

## Overview
Java Collections Framework (JCF) is a unified architecture for representing and manipulating collections of objects. Introduced in Java 1.2, it provides interfaces, implementations, and algorithms for common data structures. Understanding collections is crucial for efficient data handling in Java applications.

## Core Interfaces

### 1. Collection (Root Interface)
The `Collection` interface is the root of the collection hierarchy. It defines basic operations like add, remove, contains, and size.

```java
import java.util.*;

public class CollectionExample {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("Apple");
        collection.add("Banana");
        collection.add("Cherry");

        System.out.println("Size: " + collection.size());
        System.out.println("Contains 'Banana': " + collection.contains("Banana"));

        collection.remove("Banana");
        System.out.println("After removal: " + collection);
    }
}
```

### 2. List (Ordered Collection)
`List` extends `Collection` and allows duplicate elements and positional access.

**Implementations:**
- `ArrayList`: Resizable array, fast random access, slow insertions/deletions.
- `LinkedList`: Doubly-linked list, fast insertions/deletions, slow random access.
- `Vector`: Synchronized version of ArrayList (legacy).

```java
List<String> arrayList = new ArrayList<>();
arrayList.add("First");
arrayList.add("Second");
arrayList.add(1, "Middle");  // Insert at position 1

List<String> linkedList = new LinkedList<>();
linkedList.add("A");
linkedList.add("B");
linkedList.addFirst("Z");  // LinkedList specific method
```

### 3. Set (Unique Elements)
`Set` extends `Collection` but doesn't allow duplicates.

**Implementations:**
- `HashSet`: Hash table, no order, O(1) operations.
- `LinkedHashSet`: Maintains insertion order.
- `TreeSet`: Sorted set, O(log n) operations.

```java
Set<String> hashSet = new HashSet<>();
hashSet.add("Apple");
hashSet.add("Banana");
hashSet.add("Apple");  // Duplicate, ignored

System.out.println(hashSet);  // [Apple, Banana]

Set<String> treeSet = new TreeSet<>();
treeSet.add("Banana");
treeSet.add("Apple");
System.out.println(treeSet);  // [Apple, Banana] - sorted
```

### 4. Queue (FIFO Structure)
`Queue` is designed for holding elements prior to processing.

**Implementations:**
- `LinkedList`: Basic queue implementation.
- `PriorityQueue`: Elements ordered by priority.
- `ArrayDeque`: Resizable array, efficient for stack/queue operations.

```java
Queue<String> queue = new LinkedList<>();
queue.offer("First");
queue.offer("Second");
System.out.println(queue.poll());  // First
System.out.println(queue.peek());  // Second
```

### 5. Map (Key-Value Pairs)
`Map` is not part of `Collection` but works with collections.

**Implementations:**
- `HashMap`: Hash table, no order.
- `LinkedHashMap`: Maintains insertion order.
- `TreeMap`: Sorted by keys.
- `ConcurrentHashMap`: Thread-safe.

```java
Map<String, Integer> hashMap = new HashMap<>();
hashMap.put("Apple", 1);
hashMap.put("Banana", 2);
System.out.println(hashMap.get("Apple"));  // 1

for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
    System.out.println(entry.getKey() + ": " + entry.getValue());
}
```

## Key Concepts

### 1. Generics
Collections use generics for type safety:

```java
List<String> list = new ArrayList<>();  // Type-safe
// list.add(123);  // Compile error
```

### 2. Iterator vs Enhanced For-Loop
```java
List<String> list = Arrays.asList("A", "B", "C");

// Enhanced for-loop (read-only)
for (String item : list) {
    System.out.println(item);
}

// Iterator (allows removal)
Iterator<String> iterator = list.iterator();
while (iterator.hasNext()) {
    String item = iterator.next();
    if (item.equals("B")) {
        iterator.remove();
    }
}
```

### 3. Collections Utility Class
The `Collections` class provides static methods:

```java
List<String> list = new ArrayList<>(Arrays.asList("C", "A", "B"));
Collections.sort(list);  // [A, B, C]
Collections.shuffle(list);  // Random order
Collections.reverse(list);  // Reverse order
```

### 4. Thread Safety
Most collections are not thread-safe. Use synchronized wrappers or concurrent collections:

```java
List<String> syncList = Collections.synchronizedList(new ArrayList<>());
Map<String, String> concurrentMap = new ConcurrentHashMap<>();
```

## Performance Considerations

| Collection | Add | Remove | Get | Contains |
|------------|-----|--------|-----|----------|
| ArrayList | O(1) | O(n) | O(1) | O(n) |
| LinkedList | O(1) | O(1) | O(n) | O(n) |
| HashSet | O(1) | O(1) | O(1) | O(1) |
| TreeSet | O(log n) | O(log n) | O(log n) | O(log n) |
| HashMap | O(1) | O(1) | O(1) | O(1) |

## Best Practices

1. **Choose the right implementation**: Consider access patterns, thread safety, and memory usage.
2. **Use generics**: Always specify types to catch errors at compile time.
3. **Prefer interfaces**: Program to `List`, `Set`, `Map` interfaces, not implementations.
4. **Consider immutability**: Use `Collections.unmodifiableList()` for read-only views.
5. **Handle nulls carefully**: Some collections allow nulls, others don't.

## Common Interview Questions

1. Difference between ArrayList and LinkedList?
2. How does HashMap work internally?
3. What is the difference between HashSet and TreeSet?
4. How to make a collection thread-safe?
5. What is the fail-fast vs fail-safe iterator?

## Exercises

1. Implement a custom collection that extends AbstractList.
2. Write a method to find duplicates in a list using Set.
3. Create a thread-safe cache using ConcurrentHashMap.
4. Implement a priority queue for custom objects.

This lesson covers the fundamentals of Java Collections. Practice with different implementations and understand their trade-offs for effective use in your applications.