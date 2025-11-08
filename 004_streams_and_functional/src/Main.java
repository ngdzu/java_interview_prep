package dev.playground.lesson;

import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        List<String> items = List.of(" Apple ", "banana", "Avocado", "berry", "apricot");
        var grouped = items.stream()
                .map(String::strip)
                .map(String::toLowerCase)
                .filter(s -> s.length() > 4)
                .collect(Collectors.groupingBy(s -> s.charAt(0), Collectors.counting()));
        System.out.println(grouped);
    }
}
