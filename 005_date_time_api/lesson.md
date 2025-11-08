Date and Time API (java.time)

Java 8 introduced a modern date/time API inspired by Joda-Time. `java.time` addresses thread-safety and clarity issues from `java.util.Date`/`Calendar`. Key classes: `LocalDate`, `LocalTime`, `LocalDateTime`, `ZonedDateTime`, `Instant`, `Duration`, and `Period`.

Key points:
- Prefer `java.time` types for domain logic. They’re immutable and thread-safe.
- Use `Instant` for machine timestamps and `ZonedDateTime` for human-friendly moments in time with timezone context.
- Formatting/parsing: DateTimeFormatter is thread-safe and reusable.
- Beware of conversions: store Instants in DB; convert to time zones for display.

Sample coding: parse ISO strings, compute durations between dates, handle time zones and daylight savings edge cases.

Quiz:
1. When should you use Instant vs LocalDateTime? 2. How do you compute the difference in days between two dates?

Small project: build a small scheduler that given a list of tasks with local times and time zones outputs an ordered timeline in UTC.

Test: `test/TestMain.java` checks expected durations and timezone conversions.

Interview tip: mention timezone pitfalls (DST) and why epoch-milliseconds alone aren’t always enough for user-facing features.