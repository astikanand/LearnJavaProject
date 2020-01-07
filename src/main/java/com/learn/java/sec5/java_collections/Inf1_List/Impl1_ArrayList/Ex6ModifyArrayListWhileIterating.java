package com.learn.java.sec5.java_collections.Inf1_List.Impl1_ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ex6ModifyArrayListWhileIterating {
    public static void main (String[] args){
        List<Integer> numbers = new ArrayList<>();
        numbers.add(13);
        numbers.add(18);
        numbers.add(25);
        numbers.add(40);

        Iterator<Integer> numberIterator = numbers.iterator();
        while (numberIterator.hasNext()){
            int num = numberIterator.next();
            if (num % 2 != 0){
                // Remove the Iterator pointing(current) element
                numberIterator.remove();
            }
        }

        System.out.println(numbers);
    }
}
