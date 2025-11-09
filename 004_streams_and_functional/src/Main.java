package dev.playground.lesson;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> items = List.of(" Apple ", "banana", "Avocado", "berry", "apricot");
    Map<Character, Long> grouped = items.stream()
                .map(String::strip)
                .map(String::toLowerCase)
                .filter(s -> s.length() > 4)
        .collect(Collectors.groupingBy(s -> s.charAt(0), Collectors.counting()));
    System.out.println(grouped);
    }
}
