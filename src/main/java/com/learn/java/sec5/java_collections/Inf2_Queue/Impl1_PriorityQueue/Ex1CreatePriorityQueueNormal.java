package com.learn.java.sec5.java_collections.Inf2_Queue.Impl1_PriorityQueue;

import java.util.PriorityQueue;

public class Ex1CreatePriorityQueueNormal {
    public static void main(String[] args){
        // Create a Priority Queue using :=> PriorityQueue() -> Natural Order maintained
        PriorityQueue<String> names = new PriorityQueue<>();

        // Check if Priority Queue is empty using :=> isEmpty()
        System.out.println("Is names empty ? : " + names.isEmpty());

        // Add element using :=> add(element) or offer(element)
        names.add("Rachit");
        names.add("Amit");
        names.offer("Zayed");
        names.offer("Musa");

        // Get the size of the Priority Queue using :=> size()
        System.out.println("Total names : " + names.size());

        // Get the head element of Priority Queue using :=> peek() or element()
        System.out.println("Head : "+ names.peek());
        System.out.println("Head : " + names.element());

        // Remove the element from Priority Queue using :=> remove() or poll()
        System.out.print("Removing elements one by one :");
        while (!names.isEmpty()){
            System.out.print(" " + names.remove());
        }
        System.out.println();
    }
}
