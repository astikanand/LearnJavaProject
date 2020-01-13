package com.learn.java.sec5.java_collections.Inf1_List.Impl2_LinkedList;

import java.util.*;

public class Ex4IterateOverLinkedList {
    public static void main(String[] args){
        LinkedList<String> tvShows = new LinkedList<>();
        tvShows.add("Breaking Bad");
        tvShows.add("Game of Thrones");
        tvShows.add("Friends");
        tvShows.add("Prison Break");

        // Iterate by enhanced for loop using :=> for (element : collection)
        System.out.println("\n=== Iterate using enhanced for loop ===");
        for(String tvShow : tvShows){
            System.out.println(tvShow);
        }

        // Iterate by Java8 forEach and lambda using :=> forEach(e -> { action using e })
        System.out.println("\n=== Iterate using Java 8 forEach and lambda ===");
        tvShows.forEach(tvShow -> {
            System.out.println(tvShow);
        });

        // Iterate by Iterator using :=> iterator() and hasNext()
        System.out.println("\n=== Iterate using an iterator() ===");
        Iterator<String> tvShowIterator = tvShows.iterator();
        while (tvShowIterator.hasNext()){
            String tvShow = tvShowIterator.next();
            System.out.println(tvShow);
        }

        // Iterate by Iterator and Java 8 forEachRemaining using
        // :=> iterator() and forEachRemaining(e -> { action using e }
        System.out.println("\n=== Iterate using an iterator() and Java 8 forEachRemaining() method ===");
        tvShowIterator = tvShows.iterator();
        tvShowIterator.forEachRemaining(tvShow -> {
            System.out.println(tvShow);
        });

        // Iterate by descendingIterator using :=> descendingIterator() and hasNext()
        System.out.println("\n=== Iterate over a LinkedList using descendingIterator() ===");
        Iterator<String> tvShowDecendingIterator = tvShows.descendingIterator();
        while (tvShowDecendingIterator.hasNext()){
            String tvShow = tvShowDecendingIterator.next();
            System.out.println(tvShow);
        }

        // Iterate by ListIterator to go in both directions using
        // :=> listIterator(), hasPrevious() and hasNext()
        System.out.println("\n=== Iterate using a listIterator() to traverse in both directions ===");
        ListIterator<String> tvShowListIterator = tvShows.listIterator(tvShows.size()); // here starts from end
        while (tvShowListIterator.hasPrevious()){
            String tvShow = tvShowListIterator.previous();
            System.out.println(tvShow);
        }

        // Modify list while traversing by removing elements using :=> iterator.remove()
        tvShowIterator = tvShows.iterator();
        while (tvShowIterator.hasNext()){
            String movieName = tvShowIterator.next();
            if (movieName.startsWith("Game") || movieName.endsWith("Bad")){
                tvShowIterator.remove();
            }
        }
        System.out.println("\n=== Final Movies List after iterator.remove() : ===\n" + tvShows);
    }
}
