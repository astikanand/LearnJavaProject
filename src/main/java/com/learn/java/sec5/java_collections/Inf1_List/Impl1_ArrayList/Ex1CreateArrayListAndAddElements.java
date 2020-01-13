package com.learn.java.sec5.java_collections.Inf1_List.Impl1_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Ex1CreateArrayListAndAddElements {
    public static void main(String[] args){
        // Creation an empty ArrayList using :=> ArrayList()
        List<String> friends = new ArrayList<>();

        // Adding new elements to the ArrayList using :=> add(element)
        friends.add("Rajeev");
        friends.add("John");
        friends.add("David");
        friends.add("Chris");
        System.out.println("Initial Friend List: " + friends);

        // Add an element at a particular index in an ArrayList using :=> add(index, element)
        friends.add(2, "Steve");
        System.out.println("Friends List after friends.add(2, \"Steve\") : " + friends);

        // Create a  ArrayList from existing collection using :=> ArrayList(collection)
        ArrayList<String> familyFriends = new ArrayList<>(friends);
        System.out.println("\nFamily Friends initially : " + familyFriends);

        ArrayList<String> spouseFriends = new ArrayList<>();
        spouseFriends.add("Jesse");
        spouseFriends.add("Walt");
        System.out.println("Spouse Friends : " + spouseFriends);

        // Add a collection to existing using :=> addAll(collection)
        familyFriends.addAll(spouseFriends);
        System.out.println("Family Friends after addAll(spouseFriends) : " + familyFriends);
    }
}
