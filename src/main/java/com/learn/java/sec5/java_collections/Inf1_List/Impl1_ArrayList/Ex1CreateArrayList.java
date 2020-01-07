package com.learn.java.sec5.java_collections.Inf1_List.Impl1_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Ex1CreateArrayList {
    public static void main(String[] args){
        // Creating an ArrayList of String using :=> ArrayList()
        List<String> animals = new ArrayList<>();

        // Adding new elements to the ArrayList using :=> add(element)
        animals.add("Lion");
        animals.add("Tiger");
        animals.add("Cat");
        animals.add("Dog");

        System.out.println("Animals List: " + animals);

        // Adding an element at a particular index in an ArrayList using :=> add(index, element)
        animals.add(2, "Elephant");
        System.out.println("Animals List Now: " + animals);
    }
}
