package dev.playground.lesson;

public class TestMain {
    public static void main(String[] args) {
        Greeter g = new GreeterImpl();
        assert g.greet("You").startsWith("Hello") : "Default method should work";
        ImmutableData d = new ImmutableData("x", 5);
        assert d.getName().equals("x") && d.getValue() == 5
                : "ImmutableData fields should be accessible but not mutable";
        System.out.println("All tests passed");
    }
}