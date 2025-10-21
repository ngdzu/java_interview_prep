package dev.playground.interview.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;

@Service
public class AsyncExampleService {
    @Async
    public CompletableFuture<String> doWork(String input) {
        // simulating async work
        return CompletableFuture.supplyAsync(() -> "processed:" + input);
    }
}
