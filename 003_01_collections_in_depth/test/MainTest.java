package dev.playground.interview;

import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {
    @Test
    public void testCollections() {
        List<String> list = new ArrayList<>();
        list.add("Test");
        assertEquals(1, list.size());
        assertTrue(list.contains("Test"));

        Set<String> set = new HashSet<>();
        set.add("Test");
        set.add("Test");  // Duplicate
        assertEquals(1, set.size());

        Map<String, Integer> map = new HashMap<>();
        map.put("Key", 42);
        assertEquals(42, map.get("Key"));
    }
}
