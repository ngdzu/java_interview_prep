JVM internals, memory, and garbage collection

Interviews often probe your understanding of the JVM: how memory is organized (heap, stack, metaspace), garbage collection strategies (G1, Parallel, CMS historically), and how to diagnose memory issues. You don't need to memorize every GC flag, but you should know basics and common troubleshooting approaches.

Key points:
- Heap regions: Eden, Survivor, Tenured/Old generation (depends on GC). Objects promoted based on survivorship.
- GC types: stop-the-world vs concurrent collectors; modern default is G1 (or ZGC/Shenandoah in newer JDKs for low latency).
- Memory leaks: not a language leak but reachable objects retain memory. Diagnose using heap dumps and tools (jmap/jvisualvm or Flight Recorder).
- Tuning basics: heap sizing, GC logs, and tradeoffs between throughput and latency.

Sample coding: create memory-heavy objects and show how to examine simple stats (Runtime.freeMemory()).

Quiz:
1. What is a memory leak in Java? 2. When would you increase the heap vs fix code producing too many objects?

Small project: create a demo that simulates object allocation patterns and capture GC logs to inspect behavior (run locally, not included here).

Test: `test/TestMain.java` verifies that allocated objects increase used memory and suggests running with -Xmx to experiment.

Interview tip: emphasize measurement-first approach and knowing tooling for the JVM.