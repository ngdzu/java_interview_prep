package dev.playground.lesson;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Example: Using different collections
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        Set<String> set = new HashSet<>(list);
        System.out.println("List: " + list);
        System.out.println("Set: " + set);

        Map<String, Integer> map = new HashMap<>();
        map.put("Apple", 1);
        map.put("Banana", 2);
        System.out.println("Map: " + map);

        Queue<String> queue = new LinkedList<>(list);
        System.out.println("Queue poll: " + queue.poll());
        System.out.println("Queue: " + queue);
    }
}
