package com.learn.java.sec5.java_collections.Inf1_List.Impl3_Vector;

import java.util.Vector;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class EX1VectorNoSynchronization {
    public static void main(String[] args) throws InterruptedException {
        Vector<Integer> safeItems = new Vector<>();
        safeItems.add(1);
        safeItems.add(2);
        safeItems.add(3);

        ExecutorService executorService = Executors.newFixedThreadPool(10);
        
        Runnable task = () -> incrementArrayList(safeItems);

        for (int i = 0; i < 100; ++i){
            executorService.submit(task);
        }

        executorService.shutdown();
        executorService.awaitTermination(60, TimeUnit.SECONDS);

        System.out.println(safeItems);
    }

    private static void incrementArrayList(Vector<Integer> safeItems) {
        synchronized (safeItems) {
            for (int i = 0; i < safeItems.size(); ++i) {
                safeItems.set(i, safeItems.get(i) + 1);
            }
        }
    }
}
