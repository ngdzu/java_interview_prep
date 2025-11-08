package dev.playground.lesson;

import java.util.concurrent.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        ExecutorService ex = Executors.newFixedThreadPool(4);
        List<Future<Integer>> futures = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            final int v = i + 1;
            futures.add(ex.submit(() -> v * 10));
        }
        int sum = 0;
        for (var f : futures)
            sum += f.get();
        System.out.println("Sum: " + sum);
        ex.shutdown();
    }
}
