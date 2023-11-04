package com.java.concurrency;

import java.util.concurrent.*;

public class FutureDemo {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Future<String> stringFuture = executorService.submit(() -> {Thread.sleep(1000);
        return "Completed";
        });

        // This is sequential execution, but try block will not wait for stringFuture to complete

        try{
            while ((!stringFuture.isDone())){
                System.out.println("Task in progress");
                Thread.sleep(500);
            }
            System.out.println("Task execution completed");
            String result = stringFuture.get(3000, TimeUnit.MILLISECONDS);
            System.out.println(result);
            executorService.shutdown();
        }catch (InterruptedException | ExecutionException | TimeoutException ex){
            stringFuture.cancel(true);
            stringFuture.isDone();
            stringFuture.isCancelled();
        }
    }
}
