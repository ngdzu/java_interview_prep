package dev.playground.lesson;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> a = List.of(3, 1, 2);
        List<Integer> b = List.of(4, 5);
        List<Integer> merged = mergeAndSort(a, b);
        System.out.println(merged);
    }

    public static <T extends Comparable<? super T>> List<T> mergeAndSort(List<? extends T> a, List<? extends T> b) {
        List<T> out = new ArrayList<>(a.size() + b.size());
        out.addAll((Collection<T>) a);
        out.addAll((Collection<T>) b);
        Collections.sort(out);
        return Collections.unmodifiableList(out);
    }
}
