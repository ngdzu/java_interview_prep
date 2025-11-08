## Classes and OOP updates (interfaces, default/private methods, records)

Since Java 6, interfaces gained significant power: default and private methods allow behavioral evolution without breaking implementations. Records (covered in the previous lesson) change how we model data. This lesson focuses on class design updates: interface evolution, composition over inheritance, immutability, and best practices for `equals`/`hashCode` and defensive copying in modern code.

### Important points

- Interface default methods: add behavior safely; useful for APIs but avoid adding heavy state.
- Private methods in interfaces: refactor common code used by default methods.
- Immutability: prefer immutable objects (final fields, no setters) where possible; records make this easier.
- `equals`/`hashCode`: use `Objects.equals` and consider record default implementations or IDE-generated methods. Understand the contract.
- Defensive copying and unmodifiable collections: expose safe views, avoid leaking internals.

### Sample coding

`src/Main.java` demonstrates an interface with default/private methods and a small class that implements it, plus an immutable data class pattern using a constructor and final fields.

### Quiz

1. What are valid reasons to add a default method to an interface?
2. When should you still prefer classes over records?

### Small project

Refactor a small library of POJOs to use immutable patterns (or records) and update the API to return unmodifiable collections.

### Test

`test/TestMain.java` has assertions checking immutability (no setters) and behavior of default methods.

### Interview tip

Explain tradeoffs when evolving APIs, backward compatibility concerns, and the Liskov Substitution Principle when adding default implementations.