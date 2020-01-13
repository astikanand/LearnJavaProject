package com.learn.java.sec5.java_collections.Inf1_List.Impl1_ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Ex9ThreadSafeArrayList {
    public static void main(String[] args) throws InterruptedException {
        // Creating Thread Safe ArrayList
        List<Integer> safeArrayList = Collections.synchronizedList(new ArrayList<>());
        safeArrayList.add(1);
        safeArrayList.add(2);
        safeArrayList.add(3);

        // Create a thread pool of size 10
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        // Create a Runnable task that increments each element of the ArrayList by one
        Runnable task = () -> incrementArrayList(safeArrayList);

        // Submit the task to the executor service 100 times
        // All the will modify ArrayList concurrently
        for (int i = 0; i < 100; ++i) {
            executorService.submit(task);
        }

        // Shutdown the executor and wait for termination
        executorService.shutdown();
        executorService.awaitTermination(60, TimeUnit.SECONDS);

        System.out.println(safeArrayList);
    }

    private static void incrementArrayList(List<Integer> safeArrayList){
        synchronized (safeArrayList){ // ensures no two threads performs on this code block at the same time
            for(int i = 0; i < safeArrayList.size(); ++i){
                safeArrayList.set(i, safeArrayList.get(i)+1);
            }
        }
    }
}
