package com.learn.java.sec5.java_collections.Inf1_List.Impl1_ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Ex5IterateOverArrayList {
    public static void main(String[] args){
        List<String> tvShows = new ArrayList<>();
        tvShows.add("Breaking Bad");
        tvShows.add("Game of Thrones");
        tvShows.add("Friends");
        tvShows.add("Prison Break");

        // Iterate by simple for loop with index using :=> for(index, condition, inc/dec)
        System.out.println("\n=== Iterate using simple for loop with index ===");
        for (int i = 0; i < tvShows.size(); ++i){
            System.out.println(tvShows.get(i));
        }

        // Iterate by enhanced for loop using :=> for (element : collection)
        System.out.println("\n=== Iterate using enhanced for loop ===");
        for(String tvShow : tvShows){
            System.out.println(tvShow);
        }

        // Iterate by Java8 forEach and lambda using :=> forEach(e -> { action using e })
        System.out.println("=== Iterate using Java 8 forEach and lambda ===");
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

        // Iterate by ListIterator to go in both directions using
        // :=> listIterator(), hasPrevious() and hasNext()
        System.out.println("\n=== Iterate using a listIterator() to traverse in both directions ===");
        ListIterator<String> tvShowListIterator = tvShows.listIterator(tvShows.size()); // here starts from end
        while (tvShowListIterator.hasPrevious()){
            String tvShow = tvShowListIterator.previous();
            System.out.println(tvShow);
        }
    }
}
