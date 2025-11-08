package dev.playground.lesson;

import java.util.List;

public class TestMain {
    public static void main(String[] args) {
        List<Integer> a = List.of(3, 1, 2);
        List<Integer> b = List.of(4, 5);
        var merged = Main.mergeAndSort(a, b);
        assert merged.get(0) == 1 && merged.get(merged.size() - 1) == 5 : "Merged/sorted check";
        System.out.println("All tests passed");
    }
}