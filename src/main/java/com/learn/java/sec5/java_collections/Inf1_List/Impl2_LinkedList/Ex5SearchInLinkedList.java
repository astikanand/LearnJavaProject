package com.learn.java.sec5.java_collections.Inf1_List.Impl2_LinkedList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Ex5SearchInLinkedList {
    public static void main(String[] args){
        LinkedList<String> names = new LinkedList<>();
        names.add("John");
        names.add("Alice");
        names.add("Bob");
        names.add("Steve");
        names.add("John");
        names.add("Steve");
        names.add("Maria");

        // Check if an LinkedList contains a given element using :=> contains(element)
        System.out.println("Does name array contains \"Bob\" ? : " + names.contains("Bob"));

        // Find the index of the first occurrence of an element in an LinkedList using :=> indexOf(element)
        System.out.println("Index of \"Steve\" : " + names.indexOf("Steve"));
        System.out.println("Index of \"Mark\" : " + names.indexOf("Mark"));

        // Find the index of the last occurrence of an element in an LinkedList
        System.out.println("Last Index of \"John\" : " + names.lastIndexOf("John"));
        System.out.println("Last Index of \"Bill\" : " + names.lastIndexOf("Bill"));

        names.sort((name1, name2) -> -name2.compareTo(name1));
        System.out.println(names);
    }
}
