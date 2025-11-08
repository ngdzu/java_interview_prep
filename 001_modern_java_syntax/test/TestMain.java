package dev.playground.lesson;

public class TestMain {
    public static void main(String[] args) {
        Person p1 = new Person("Alice", 30);
        Person p2 = new Person("Alice", 30);
        assert p1.equals(p2) : "Records with same state should be equal";
        String json = """
                {"name":"Alice","age":30}
                """;
        assert json.contains("\"name\"") : "Text block must include name key";
        System.out.println("All tests passed");
    }
}