package com.java.concurrency;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorMain {

    public static void main(String[] args) {
        executorInvoke();
        executorServiceInvoke();
    }

    private static void executorInvoke(){
        Executor executor = new Caller();
        executor.execute(() -> System.out.println("Executor"));
    }

    private static void executorServiceInvoke(){
        ExecutorService executorService = Executors.newFixedThreadPool(20);
        executorService.submit(() -> System.out.println("Executor Service"));
    }
}
