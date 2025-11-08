package dev.playground.lesson;

import java.util.List;

public class TestMain {
    public static void main(String[] args) {
        List<String> items = List.of(" Apple ", "banana", "Avocado", "berry", "apricot");
        Main.main(new String[] {});
        // Basic smoke test -- manual inspection recommended for collectors
        System.out.println("Stream test executed");
    }
}