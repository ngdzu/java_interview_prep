package dev.playground.lesson;

public class Main {
    public static void main(String[] args) {
        // record (Java 16+)
        Person p1 = new Person("Alice", 30);
        Person p2 = new Person("Alice", 30);
        System.out.println("record toString: " + p1);
        System.out.println("equals: " + p1.equals(p2));

        // text block (Java 15+)
        String json = """
                {"name":"Alice","age":30}
                """;
        System.out.println("text block contains name: " + json.contains("\"name\""));

        // var (Java 10+)
        var greeting = "Hello, %s".formatted(p1.name());
        System.out.println(greeting);
    }
}

record Person(String name, int age) {
}
