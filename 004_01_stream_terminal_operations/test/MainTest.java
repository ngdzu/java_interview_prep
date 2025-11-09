package dev.playground.lesson;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {
    @Test
    void exampleTerminalOps() {
        List<String> items = List.of(" Apple ", "banana", "Avocado", "berry", "apricot");
        Map<Character, Long> grouped = items.stream()
                .map(String::strip)
                .map(String::toLowerCase)
                .filter(s -> s.length() > 4)
                .collect(Collectors.groupingBy(s -> s.charAt(0), Collectors.counting()));
        assertTrue(grouped.get('a') >= 1);
    }
}
