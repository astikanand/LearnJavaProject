package com.learn.java.sec5.java_collections.Inf3_Set.Inf_SortedSet.Impl3_TreeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetCreationAndOperations {
    public static void main(String[] args){
        // Create a TreeSet using :=> TreeSet()
        TreeSet<Integer> numbers = new TreeSet<>();

        // Check if empty using :=> isEmpty()
        System.out.println("Is TreeSet empty ? : " + numbers.isEmpty());

        // Add element using :=> add(element)
        numbers.add(4);
        numbers.add(1);
        numbers.add(7);
        numbers.add(9);
        numbers.add(6);
        numbers.add(5);
        numbers.add(11);
        numbers.add(17);
        numbers.add(13);

        // Calculate size using :=> size()
        System.out.println("Size of the element : " + numbers.size());

        // Smallest element greater or equal to given value using :=> ceiling(given_val)
        System.out.println("Smallest element greater or equal to 7 : " + numbers.ceiling(7));

        // Largest element smaller or equal to given value using :=> floor(given_val)
        System.out.println("Largest element smaller or equal to 12 : " + numbers.floor(12));

        // Smallest element strictly greater than than given value using :=> higher(given_val)
        System.out.println("Smallest element strictly greater than 7 : " + numbers.higher(7));

        // Largest element strictly smaller than given value using :=> lower(given_val)
        System.out.println("Largest element strictly smaller than 12 : " + numbers.lower(12));

        // All elements less than the given element using :=> headSet(toElement)
        System.out.println("All the elements less than 9 : " + numbers.headSet(9));

        // All elements greater or equal to the given element using :=> tailSet(toElement)
        System.out.println("All the elements greater or equal to 9 : " + numbers.tailSet(9));

        // All elements in range of [fromElement, toElement) using :=> subSet(fromElement, toElement)
        System.out.println("All elements in range of [6, 13) : " + numbers.subSet(6, 13));

        // Get the descending set using :=> descendingSet()
        System.out.println("Elements in reversed order : " + numbers.descendingSet());

        // Remove the elements with condition using :=> removeIf(condition)
        System.out.println("Remove all elements divisible by 3.");
        numbers.removeIf(num -> num % 3 == 0);

        // Iterate the elements using :=> iterator() or descendingIterator() and hasNext()
        Iterator<Integer> numDecIterator = numbers.descendingIterator();
        System.out.print("Remaining numbers in reverse order :");
        while (numDecIterator.hasNext()){
            System.out.print(" " + numDecIterator.next());
        }
        System.out.println();

        // Clear using :=> clear()
        numbers.clear();
        System.out.println("After clear() : " + numbers);

    }
}
