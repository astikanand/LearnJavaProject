package com.learn.java.sec5.java_collections.Inf1_List.Impl2_LinkedList;

import java.util.LinkedList;

public class Ex3RemoveElementFromLinkedList {
    public static void main(String[] args){
        LinkedList<String> programmingLanguages = new LinkedList<>();
        programmingLanguages.add("Fortran");
        programmingLanguages.add("C");
        programmingLanguages.add("C++");
        programmingLanguages.add("Java");
        programmingLanguages.add("Kotlin");
        programmingLanguages.add("Python");
        programmingLanguages.add("Perl");
        programmingLanguages.add("Ruby");
        programmingLanguages.add("GoLang");

        System.out.println("Initial LinkedList : " + programmingLanguages);

        // Remove first element using :=> removeFirst()
        programmingLanguages.removeFirst(); // Throws NoSuchElementException if empty
        System.out.println("After removeFirst() : " + programmingLanguages);

        // Remove last element using :=> removeLast()
        programmingLanguages.removeLast(); // Throws NoSuchElementException if empty
        System.out.println("After removeLast() : " + programmingLanguages);

        // Remove element at an index using :=> remove(index)
        programmingLanguages.remove(5);
        System.out.println("After remove(5) : " + programmingLanguages);

        // Remove first occurrence of element using :=> remove(element)
        // remove() method returns false if element doesn't exists
        boolean isKotlinRemoved = programmingLanguages.remove("Kotlin");
        System.out.println("After remove(\"Kotlin\") : " + programmingLanguages);

        LinkedList<String> scriptingLanguages = new LinkedList<>();
        scriptingLanguages.add("Python");
        scriptingLanguages.add("Ruby");
        scriptingLanguages.add("Perl");

        // Remove all the elements that exist in a given collection using :=> removeAll(collection)
        programmingLanguages.removeAll(scriptingLanguages);
        System.out.println("After removeAll(scriptingLanguages) : " + programmingLanguages);

        // Remove all the elements that satisfy a given condition with
        // Predicate using :=> removeIf(filterCondition)
        programmingLanguages.removeIf(s -> s.startsWith("C"));
        System.out.println("After Removing all elements that start with \"C\" : " + programmingLanguages);

        // Remove all the elements from the LinkedList using :=> clear()
        programmingLanguages.clear();
        System.out.println("After clear() : " + programmingLanguages );
    }
}
