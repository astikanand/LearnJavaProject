package com.learn.java.sec5.java_collections.Inf3_Set.Impl2_LinkedHashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetCreationAndOperations {
    public static void main(String[] args){
        LinkedHashSet<String> names = new LinkedHashSet<>();
        // Check if empty using :=> isEmpty()
        System.out.println("Is names set empty ? : " + names.isEmpty());

        // Add element to it using :=> add(element)
        names.add("Ravi");
        names.add("Vijay");
        names.add("Amit");
        names.add("Ajay");
        names.add("Vijay"); // duplicate will be ignored

        // Get size of the hash set using :=> size()
        System.out.println("Total names in set : " + names.size());

        // Check if an element exists using :=> contains(element)
        System.out.println("Does \"Amit\" exists in set ? : " + names.contains("Amit"));

        // Iterate loop using :=> iterator() and hasNext()
        System.out.print("Names in set are :");
        Iterator namesIterator = names.iterator();
        while (namesIterator.hasNext()){
            System.out.print(" " + namesIterator.next());
        }
        System.out.println();

        // Remove element using :=> remove(element)
        names.remove("Amit");
        System.out.println("After remove(\"Amit\") : " + names);

        // After clear()
        names.clear();
        System.out.println("After clear() : " + names);
    }
}
