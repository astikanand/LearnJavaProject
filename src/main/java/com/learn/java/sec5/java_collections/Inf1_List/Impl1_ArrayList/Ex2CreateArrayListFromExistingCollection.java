package com.learn.java.sec5.java_collections.Inf1_List.Impl1_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Ex2CreateArrayListFromExistingCollection {
    public static void main (String[] args){
        List<Integer> first5Primes = new ArrayList<>();
        first5Primes.add(2);
        first5Primes.add(3);
        first5Primes.add(5);
        first5Primes.add(7);
        first5Primes.add(11);

        // Creating an ArrayList from another collection using :=> ArrayList(collection)
        List<Integer> first10Primes = new ArrayList<>(first5Primes);

        List<Integer> next5Primes = new ArrayList<>();
        next5Primes.add(13);
        next5Primes.add(17);
        next5Primes.add(19);
        next5Primes.add(23);
        next5Primes.add(29);

        // Adding an entire collection to an ArrayList :=> using addAll(collection)
        first10Primes.addAll(next5Primes);

        System.out.println("First 10 Primes are: " + first10Primes);
    }
}
