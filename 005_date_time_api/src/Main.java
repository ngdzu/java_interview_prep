package dev.playground.lesson;

import java.time.*;

public class Main {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.parse("2020-01-01");
        LocalDate ld2 = LocalDate.now();
        System.out.println("Days between: " + java.time.temporal.ChronoUnit.DAYS.between(ld, ld2));

        ZonedDateTime zdt = ZonedDateTime.of(LocalDateTime.now(), ZoneId.of("America/Los_Angeles"));
        Instant instant = zdt.toInstant();
        System.out.println("Instant: " + instant);
    }
}
