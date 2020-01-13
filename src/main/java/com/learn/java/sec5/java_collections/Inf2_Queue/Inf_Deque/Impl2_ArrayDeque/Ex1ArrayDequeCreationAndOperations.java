package com.learn.java.sec5.java_collections.Inf2_Queue.Inf_Deque.Impl2_ArrayDeque;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class Ex1ArrayDequeCreationAndOperations {
    public static void main(String[] args){
        // Create a deque using :=> ArrayDeque()
        Deque<Integer> numDeque = new ArrayDeque<>(10);

        // Add element using :=> add(element)
        numDeque.add(10);
        numDeque.add(20);
        numDeque.add(30);
        numDeque.add(40);
        numDeque.add(50);

        // Print the numbers in the Deque using :=> enhanced for loop
        System.out.print("Elements in Num Deque :");
        for (Integer element : numDeque) {
            System.out.print(" " + element);
        }
        System.out.println();

        // Clear the Deque using :=> clear()
        System.out.println("Using clear() ");
        numDeque.clear();

        // Insert at start using :=> addFirst()
        numDeque.addFirst(564);
        numDeque.addFirst(291);

        // Insert at end using :=> addLast()
        numDeque.addLast(24);
        numDeque.addLast(14);

        // Iterate in Deque using :=> iterator() and hasNext()
        System.out.print("Elements of deque using Iterator :");
        for(Iterator itr = numDeque.iterator(); itr.hasNext();) {
            System.out.print(" " + itr.next());
        }
        System.out.println();

        // Reverse Iterat using :=> descendingIterator() and hasNext()
        System.out.print("Elements of deque in reverse order :");
        for(Iterator dItr = numDeque.descendingIterator(); dItr.hasNext();) {
            System.out.print(" " + dItr.next());
        }
        System.out.println();

        // Get head element using :=> element()
        System.out.println("\nHead Element using element() : " + numDeque.element());

        // Get head element using :=> getFirst()
        System.out.println("Head Element using getFirst() : " + numDeque.getFirst());

        // Get last element using :=> getLast()
        System.out.println("Last Element using getLast(): " + numDeque.getLast());

        // Convert to Array using :=> toArray()
        Object[] arr = numDeque.toArray();
        System.out.println("\nArray Size : " + arr.length);

        System.out.print("Array elements :");
        for(int i=0; i<arr.length ; i++)
            System.out.print(" " + arr[i]);

        // Get head element using :=> peek()
        System.out.println("\nHead element using peek(): " + numDeque.peek());

        // Get head element using :=> poll()
        System.out.println("Head element poll() : " + numDeque.poll());

        // Push element using :=> push(element)
        numDeque.push(265);
        numDeque.push(984);
        numDeque.push(365);

        // Get head element using :=> remove()
        System.out.println("Head element remove : " + numDeque.remove());

        System.out.println("The final array is : " + numDeque);
    }
}
