package com.learn.java.sec5.java_collections.Inf1_List.Impl2_LinkedList;

import java.util.LinkedList;

public class Ex1CreateLinkedListAndAddElements {
    public static void main(String[] args){
        // Creation an empty LinkedList using :=> LinkedList()
        LinkedList<String> friends = new LinkedList<>();

        // Adding elements using :=> add(element)
        friends.add("Rajeev");
        friends.add("John");
        friends.add("David");
        friends.add("Chris");
        System.out.println("Initial Friend List: " + friends);

        // Add elements at a specific index using :=> add(index, element)
        friends.add(3, "Lisa");
        System.out.println("Friends List after add(3, \"Lisa\") : " + friends);

        // Add an element at the beginning of Linked List :=> addFirst(element)
        friends.addFirst("Steve");
        System.out.println("Friends List after addFirst(\"Steve\") : " + friends);

        // Add an element at end (equivalent to add method) using :=> addLast(element)
        friends.addLast("Jennifer");
        System.out.println("Friends List after addLast(\"Jennifer\") : " + friends);

        // Create a Linked List from existing collection using :=> LinkedList(collection)
        LinkedList<String> familyFriends = new LinkedList<>(friends);
        System.out.println("\nFamily Friends initially : " + familyFriends);

        LinkedList<String> spouseFriends = new LinkedList<>();
        spouseFriends.add("Jesse");
        spouseFriends.add("Walt");
        System.out.println("Spouse Friends : " + spouseFriends);

        // Add a collection to existing using :=> addAll(collection)
        familyFriends.addAll(spouseFriends);
        System.out.println("Family Friends after addAll(spouseFriends) : " + familyFriends);
    }
}
