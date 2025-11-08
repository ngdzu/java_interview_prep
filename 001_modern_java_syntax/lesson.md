## Modern Java syntax — what's changed since Java 6

Java has evolved quickly since Java 6. This lesson covers essential language additions and modern idioms you should know for interviews: local-variable type inference (`var`), text blocks, records (compact data carriers), the diamond-operator improvements, switch expressions, and sealed classes (with pattern matching where applicable). These features improve readability, reduce boilerplate, and change how we design small POJOs and control flows.

### Key concepts

- `var`: local-variable type inference improves conciseness while preserving static typing. Use it for obvious types; avoid for confusing declarations.
- Text blocks: triple-quoted multiline strings simplify embedded JSON/SQL/XML and preserve formatting.
- Records: compact syntax for immutable data carriers. Records automatically provide `equals`/`hashCode`/`toString` and make DTOs cleaner.
- Switch expressions and enhanced pattern matching (modern JDKs): allow `switch` to return values and support clearer control flow.
- Sealed classes: limit subclassing and model closed hierarchies; useful for algebraic data types.

### Sample coding

See `src/Main.java` in this folder for a short demo that uses a `record`, a text block, and `var`.

### Quiz

1. When should you prefer a `record` over a class?
2. Why use `var` and when should you avoid it?
3. How do text blocks affect escaping newlines and quotes?

### Small project

Convert a small POJO-based model to records and update serialization to JSON (using a library or manual formatting). Focus on immutability and concise code.

### Test

`test/TestMain.java` includes simple assertions showing record equality and that the text block contains expected substrings.

### Notes

Keep JDK compatibility in mind — `var` needs Java 10+, text blocks appeared in Java 15+, and records required Java 16+. For interviews, mention the JDK version when using these features.