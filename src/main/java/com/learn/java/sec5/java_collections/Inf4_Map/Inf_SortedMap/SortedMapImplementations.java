package com.learn.java.sec5.java_collections.Inf4_Map.Inf_SortedMap;

import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapImplementations {
    public static void main(String[] args){
        SortedMap<String, Integer> students = new TreeMap<>((s1, s2) -> s2.compareTo(s1));
    }
}
