package com.edu.demo;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegers {

    static int normalCount = 0;   // shared variable (NOT thread-safe)
    static AtomicInteger atomicCount = new AtomicInteger(0); // thread-safe

    @Execution(ExecutionMode.CONCURRENT)
    @RepeatedTest(100)
    void practice() {
        for (int i = 0; i < 1000; i++) {
            normalCount++;                 // NOT thread-safe
            atomicCount.incrementAndGet(); // thread-safe
        }
    }

    @AfterAll
    static void printResult() {
        System.out.println("Normal Count: " + normalCount);
        System.out.println("Atomic Count: " + atomicCount.get());
    }
}
