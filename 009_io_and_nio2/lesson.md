I/O and NIO.2 — Files, Paths, and asynchronous I/O

Java's NIO.2 (java.nio.file) modernized file I/O. This lesson covers `Path`, `Files`, walking file trees, buffered streams, channels, and simple asynchronous I/O patterns. You should know how to read/write files safely and efficiently and when to use streaming vs loading entire files into memory.

Key points:
- Path and Files: cleaner APIs for path manipulation and file ops.
- Use `try-with-resources` for streams to guarantee closure.
- Use buffered streams for large I/O and channels for high-performance transfer.
- For simple cases, Files.readAllLines/readString is convenient but beware memory for large files.

Sample coding: list files in a directory, read and filter lines, write results to new file.

Quiz:
1. Why use try-with-resources? 2. How to walk a large directory tree efficiently?

Small project: implement a small command-line tool that counts occurrences of a word across files in a folder using streaming (avoid loading entire files into memory).

Test: `test/TestMain.java` validates reading and writing small temporary files.

Interview tip: show you can reason about resource usage and exception handling; demonstrate use of Path/Files over legacy File.