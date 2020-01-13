package com.learn.java.sec5.java_collections.Inf2_Queue.Impl1_PriorityQueue;

import java.util.PriorityQueue;

public class Ex2CreatePriorityQueueUserDefinedTypes {
    public static void main(String[] args){
         // The requirement for a PriorityQueue of user defined objects is that
         //       1. Either the class should implement the Comparable interface and provide the
         //          implementation for the compareTo() function.
         //       2. Or we should provide a custom Comparator while creating the PriorityQueue.

        // Create a PriorityQueue
        PriorityQueue<Employee> employeePriorityQueue = new PriorityQueue<>();

        // Add items to the Priority Queue
        employeePriorityQueue.add(new Employee("Rajeev", 100000.00));
        employeePriorityQueue.add(new Employee("Chris", 145000.00));
        employeePriorityQueue.add(new Employee("Andrea", 115000.00));
        employeePriorityQueue.add(new Employee("Jack", 167000.00));

        // Note:- The compareTo() method implemented in the Employee class is used to determine
        //        in what order the objects should be dequeued.
        while (!employeePriorityQueue.isEmpty()) {
            System.out.println(employeePriorityQueue.remove());
        }
    }
}
