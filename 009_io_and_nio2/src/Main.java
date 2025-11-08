package dev.playground.lesson;

import java.nio.file.*;
import java.io.IOException;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Path dir = Paths.get(System.getProperty("user.dir"));
        try (Stream<Path> s = Files.list(dir)) {
            s.filter(p -> p.toString().endsWith(".java")).forEach(System.out::println);
        }
    }
}
