package dev.playground.lesson;

import java.nio.file.*;
import java.io.*;

public class TestMain {
    public static void main(String[] args) throws Exception {
        Path tmp = Files.createTempFile("testfile", ".txt");
        Files.writeString(tmp, "hello world\n");
        String s = Files.readString(tmp);
        assert s.contains("hello") : "file content check";
        System.out.println("I/O test passed");
        Files.deleteIfExists(tmp);
    }
}