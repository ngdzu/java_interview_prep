package dev.playground.lesson;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> a = List.of(3, 1, 2);
        List<Integer> b = List.of(4, 5);
        List<Integer> merged = mergeThenSort(a, b);
        System.out.println(merged);
    }

    public static <T extends Comparable<? super T>> List<T> mergeAndSort(List<? extends T> a, List<? extends T> b) {
        List<T> out = new ArrayList<>(a.size() + b.size());
        out.addAll(a);
        out.addAll(b);
        Collections.sort(out);
        return Collections.unmodifiableList(out);
    }

    public static <T extends Comparable<? super T>> List<T> mergeThenSort(List<? extends T> a, List<? extends T>b){
        List<T> out = new ArrayList<>(a.size() + b.size());
        out.addAll(a);
        out.addAll(b);
        Collections.sort(out);
        return out;
    }
}
