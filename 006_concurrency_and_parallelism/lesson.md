Concurrency and parallelism

Concurrency is frequently tested in interviews. This lesson covers threads, synchronization, ExecutorService, thread pools, ForkJoinPool, and CompletableFuture. Understand both low-level primitives (`synchronized`, `volatile`) and high-level constructs from `java.util.concurrent`.

Key concepts:
- Thread vs Task: prefer submitting Runnables/Callables to ExecutorService.
- Synchronization: know `synchronized`, `ReentrantLock`, `volatile` and memory visibility rules.
- Concurrent collections: `ConcurrentHashMap`, `CopyOnWriteArrayList`.
- CompletableFuture: asynchronous composition and error handling.
- ForkJoin and parallel streams: use for divide-and-conquer workloads.

Sample coding: small example using ExecutorService to compute sums in parallel and using CompletableFuture to chain async tasks.

Quiz:
1. Difference between synchronized and volatile. 2. How does CompletableFuture handle exceptions?

Small project: implement a small parallel word count using ForkJoin or parallel streams and measure performance vs sequential.

Test: `test/TestMain.java` verifies multi-threaded result correctness using thread-safe structures.

Interview tip: show you can reason about thread-safety, explain happens-before relationship, and pick the proper abstraction rather than overusing low-level threads.