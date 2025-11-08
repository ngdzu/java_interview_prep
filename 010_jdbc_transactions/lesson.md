JDBC and transactions

Database interactions remain important. This lesson covers JDBC best practices: connection management, prepared statements, transactions, and resource cleanup. For production code, prefer connection pools (HikariCP) and higher-level tooling (JPA, Spring Data), but understanding raw JDBC is fundamental.

Key points:
- Use PreparedStatement to avoid SQL injection and reuse query plans.
- Always close ResultSet/Statement/Connection (try-with-resources).
- Manage transactions explicitly when multiple statements must be atomic. Use commit/rollback patterns.
- Use connection pools to avoid expensive connection setup.

Sample coding: an example skeleton showing try-with-resources with a prepared statement (no live DB included — replace URL/credentials in README).

Quiz:
1. How do you ensure rollback on exceptions? 2. Why use prepared statements?

Small project: write a tiny DAO that executes CRUD operations against a test database (H2) and tests transactions.

Test: local integration test with an embedded H2 database (instructions in README).

Interview tip: know tradeoffs between raw JDBC and ORMs, and how to handle transactions across multiple resources if required.