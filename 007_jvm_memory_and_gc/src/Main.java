package dev.playground.lesson;

import java.util.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        List<byte[]> list = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            list.add(new byte[1024 * 1024]); // allocate 1MB chunks
            System.out.println("Allocated " + (i + 1) + " MB, freeMemory=" + Runtime.getRuntime().freeMemory());
            Thread.sleep(50);
        }
    }
}
