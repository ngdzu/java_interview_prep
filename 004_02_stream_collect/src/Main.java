package dev.playground.lesson;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> items = List.of("apple", "banana", "avocado", "berry", "apricot", "banana");

        // toList / toSet
        List<String> list = items.stream().collect(Collectors.toList());
        Set<String> set = items.stream().collect(Collectors.toSet());
        System.out.println("list: " + list);
        System.out.println("set: " + set);

        // toMap with merge (count occurrences)
        Map<String, Integer> counts = items.stream()
                .collect(Collectors.toMap(
                        s -> s,
                        s -> 1,
                        Integer::sum));
        System.out.println("counts: " + counts);

        // groupingBy with downstream mapping + counting
        Map<Character, List<String>> byInitial = items.stream()
                .collect(Collectors.groupingBy(s -> s.charAt(0), Collectors.mapping(s -> s, Collectors.toList())));
        System.out.println("byInitial: " + byInitial);

        Map<Character, Long> countsByInitial = items.stream()
                .collect(Collectors.groupingBy(s -> s.charAt(0), Collectors.counting()));
        System.out.println("countsByInitial: " + countsByInitial);

        // joining
        String csv = items.stream().collect(Collectors.joining(", "));
        System.out.println("csv: " + csv);

        // collectingAndThen to produce an unmodifiable copy
        List<String> unmod = items.stream()
                .collect(Collectors.collectingAndThen(Collectors.toList(), List::copyOf));
        System.out.println("unmodifiable: " + unmod);
    }
}
