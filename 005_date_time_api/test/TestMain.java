package dev.playground.lesson;

import java.time.*;

public class TestMain {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.of(2020, 1, 1);
        LocalDate ld2 = LocalDate.of(2020, 1, 3);
        assert java.time.temporal.ChronoUnit.DAYS.between(ld, ld2) == 2 : "Days difference should be 2";
        System.out.println("All tests passed");
    }
}