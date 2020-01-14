package com.learn.java.sec5.java_collections.Inf4_Map.Inf_SortedMap.Impl3_TreeMap;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapCreationAndOperations {
    public static void main(String[] args){
        // Crate using :=> TreeMap(lambdaComparator)
        TreeMap<String, Integer> students = new TreeMap<>((s1, s2) -> s1.compareTo(s2));

        // Check if TreeMap is empty using :=> empty()
        System.out.println("Check if students TreeMap is empty ? : " + students.isEmpty());

        // Put the key-value pairs in TreeMap using :=> put(key, value)
        students.put("Badal", 78);
        students.put("Ajit", 56);
        students.put("Vishal", 95);
        students.put("Sachin", 88);
        students.put("Doval", 73);
        students.put("Manpreet", 91);

        // Get the size using :=> size()
        System.out.println("Total size of TreeMap : " + students.size());

        // Check if a key exist in the using :=> containsKey(key)
        System.out.println("Is \"Vishal\" exist in students  ? : " + students.containsKey("Vishal"));

        // Check if a value present in map using :=> containsValue()
        System.out.println("Is 95 present in student marks ? : " + students.containsValue(95));

        // Get the value of a key using :=> get(key)
        System.out.println("Marks of \"Vishal\" is : " + students.get("Vishal"));

        // Get set of all the keys using :=> keySet()
        System.out.println("\nAll the student's names : " + students.keySet());

        // Get set of all the key-value pairs using :=> entrySet()
        System.out.println("All the students and their marks : " + students.entrySet());

        // Get all the values using :=> values()
        System.out.println("All the student's marks : " + students.values());

        // Change Key and Value using :=> compute(key, remapping function)
        students.compute("Ajit", (key, val) -> val+20);
        System.out.println("Ajit Marks after recomputing value : " + students.get("Ajit"));

        // Put Key and Value if absent using :=> computeIfAbsent(key, mappingFunction)
        students.computeIfAbsent("Balram", key -> 85);

        // Get a key value using :=> getOrDefault(key, value)
        System.out.println("The marks of \"Anil \" : " + students.getOrDefault("Anil", -1));

        // Put a value if absent using :=> putIfAbsent(key, value)
        students.putIfAbsent("Anil", 68);

        // Replace the value of a key using :=> replace(key, newValue)
        students.replace("Doval", 93);

        // Iterating using :=> entrySet(), iterator() and hasNext()
        System.out.print("All the students and their marks Now : ");
        Iterator<Map.Entry<String, Integer>> studentsIterator = students.entrySet().iterator();
        while (studentsIterator.hasNext()){
            Map.Entry<String, Integer> entry = studentsIterator.next();
            System.out.print("{" + entry.getKey() + "-->" + entry.getValue() + "}, ");
        }
        System.out.println();

        // Get the firstKey using :=> firstKey() and lastKey using :=> lastKey()
        System.out.println("\nFirst Key : " + students.firstKey() + ", Last Key : " + students.lastKey());

        // Get the firstEntry using :=> firstEntry() and lastEntry using :=> lastEntry()
        System.out.println("First Entry : " + students.firstEntry() + ", Last Entry : "
                + students.lastEntry());

        // Get the Floor Key using :=> floorKey(key) and Ceiling Key using :=> ceilingKey(key)
        System.out.println("Floor Key of \"Badal\" : " + students.floorKey("Badal") + ", " +
                "Ceiling Key of \"Manpreet\" : " + students.ceilingKey("Manpreet"));

        // Get the Floor Entry using :=> floorEntry(key) and Ceiling Entry using :=> ceilingEntry(key)
        System.out.println("Floor Entry of \"Badal\" : " + students.floorEntry("Badal") + ", " +
                "Ceiling Entry of \"Manpreet\" : " + students.ceilingEntry("Manpreet"));

        // Get the Lower Key using :=> lowerKey(key) and Higher Key using :=> higherKey(key)
        System.out.println("Lower Key of \"Badal\" : " + students.lowerKey("Badal") + ", " +
                "Higher Key of \"Manpreet\" : " + students.higherKey("Manpreet"));

        // Get the Lower Entry using :=> lowerEntry(key) and Higher Entry using :=> higherEntry(key)
        System.out.println("Lower Entry of \"Badal\" : " + students.lowerEntry("Badal") + ", " +
                "Higher Entry of \"Manpreet\" : " + students.higherEntry("Manpreet"));

        // Get the Descending KeySet using :=> descendingKeySet()
        System.out.println("\nKey Sets in Reverse Order : " + students.descendingKeySet());

        // Get the Descending Map using :=> descendingMap()
        System.out.println("Entry Sets in Reverse Order : " + students.descendingMap());

        // Get the headMap using :=> headMap(toKey)
        System.out.println("HeadMap until \"Manpreet\" : " + students.headMap("Manpreet"));

        // Get the tailMap using :=> tailMap(fromKey)
        System.out.println("TailMap from \"Manpreet\" : " + students.tailMap("Manpreet"));

        // Get the subMap using :=> subMap(fromKey, toKey)
        System.out.println("SubMap from \"Badal\" until \"Vishal\" : " + students.subMap("Badal", "Vishal"));

        // Get the Descending KeySets using :=> descendingKeySet()
        System.out.println("Descending KeySets : " + students.descendingKeySet());

        // Get the Descending EntrySets or Map using :=> descendingMap()
        System.out.println("Descendig EntrySets or Map : " + students.descendingMap());

        // Remove the element using :=> remove(key)
        students.remove("Sachin");

        // Iterating using :=> enhanced for loop and entrySet()
        System.out.print("\nAll students after \"Sachin\" removed : ");
        for(Map.Entry<String, Integer> entry : students.entrySet()){
            System.out.print("{" + entry.getKey() + "-->" + entry.getValue() + "}, ");
        }
        System.out.println();

        // Retrieve and Remove the First Entry using :=> pollFirstEntry() and Last Entry using pollLastEntry()
        System.out.println("Removed First Entry: " + students.pollFirstEntry() + ", Last Entry : "
                + students.pollLastEntry());

        // Iterate using :=> forEach() and lambdaExpression
        System.out.print("All students now after removing first and last entry : ");
        students.forEach((name, marks) -> System.out.print("{" + name + "-->" + marks + "}, "));
        System.out.println();

        // Clear the map using :=> clear()
        students.clear();
        System.out.println("After clear : " + students);

    }
}
