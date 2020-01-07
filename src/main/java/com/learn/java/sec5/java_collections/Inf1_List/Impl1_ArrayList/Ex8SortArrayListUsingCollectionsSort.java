package com.learn.java.sec5.java_collections.Inf1_List.Impl1_ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex8SortArrayListUsingCollectionsSort {
    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(13);
        numbers.add(7);
        numbers.add(18);
        numbers.add(5);
        numbers.add(2);

        System.out.println("Numbers Initially: " + numbers);

        // Sorting an ArrayList using :=> Collections.sort(collection)
        Collections.sort(numbers);

        System.out.println("Numbers in Natural Order (Sorted Order) : " + numbers);


        //=========== Creating and Sorting User Defined DataTypes ========/
        List<User> users = new ArrayList<>();
        users.add(new User("Sachin", 47));
        users.add(new User("Chris", 34));
        users.add(new User("Rajeev", 25));
        users.add(new User("David", 31));
        users.add(new User("Chris", 54));

        System.out.println("\nUsers List: " + users);
        // Sort users by age
        Collections.sort(users, (user1, user2) -> user1.getAge() - user2.getAge());
        System.out.println("Users List sorted by age: " + users);

        // Sort users by name
        Collections.sort(users, (user1, user2) -> user1.getName().compareTo(user2.getName()));
        System.out.println("Users List sorted by name: " + users);

        // Sort users by name if same name, reverse sort using age
        Collections.sort(users, (user1, user2) -> {
            int val = user1.getName().compareTo(user2.getName());
            return val != 0 ? val : user2.getAge() - user1.getAge();
        });
        System.out.println("Users sorted by name and for same name reverse sorted by age: " + users);

    }
}
