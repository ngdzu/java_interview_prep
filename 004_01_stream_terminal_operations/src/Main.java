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

        // Examples of other terminal ops
        long count = items.stream().filter(s -> s.length()>5).count();
        System.out.println("count>5: " + count);

        String joined = items.stream().map(String::strip).collect(Collectors.joining(", "));
        System.out.println("joined: " + joined);

        int sum = List.of(1,2,3,4).stream().reduce(0, Integer::sum);
        System.out.println("sum: " + sum);

        // forEach / forEachOrdered
        items.stream().filter(s -> s.length() > 3).forEach(System.out::println);
        items.parallelStream().forEachOrdered(System.out::println);

        // collect
        List<String> trimmed = items.stream().map(String::trim).collect(Collectors.toList());
        System.out.println("Trimmed List: " + trimmed);
        Map<Character, Long> counts = items.stream()
                .collect(Collectors.groupingBy(s -> s.charAt(0), Collectors.counting()));
        System.out.println("Counts: " + counts);

        // reduce
        int sum2 = List.of(1, 2, 3, 4).stream().reduce(0, Integer::sum);
        System.out.println("Sum: " + sum2);
        var maybe = items.stream().reduce((a, b) -> a + "," + b);
        maybe.ifPresent(System.out::println);

        // min / max
        var min = List.of(3, 1, 4, 1, 5).stream().min(Integer::compare);
        min.ifPresent(val -> System.out.println("Min: " + val));

        // findFirst / findAny
        var first = items.stream().findFirst();
        first.ifPresent(val -> System.out.println("First: " + val));

        // anyMatch / allMatch / noneMatch
        boolean anyEmpty = items.stream().anyMatch(String::isEmpty);
        System.out.println("Any empty: " + anyEmpty);

        // summaryStatistics
        var stats = List.of(1, 2, 3, 4, 5).stream().mapToInt(Integer::intValue).summaryStatistics();
        System.out.println("Stats: " + stats);

        // toArray
        String[] array = items.stream().toArray(String[]::new);
        System.out.println("Array: " + String.join(", ", array));
    }
}
