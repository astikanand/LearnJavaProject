package com.learn.java.sec5.java_collections.Inf1_List.Impl1_ArrayList;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Ex9SortArrayListUsingArrayListSort {
    public static void main(String[] args){
        List<String> names = new ArrayList<>();
        names.add("Lisa");
        names.add("Jennifer");
        names.add("Mark");
        names.add("David");

        System.out.println("Names: " + names);

        // Sorting an ArrayList using :=> sort(lambdaExpression)
        names.sort((name1, name2) -> name1.compareTo(name2));

        // A concise way using :=> sort(Comparator)
        names.sort(Comparator.naturalOrder());

        System.out.println("Sorted Names: " + names);


        //=========== Creating and Sorting User Defined DataTypes ========/
        List<User> users = new ArrayList<>();
        users.add(new User("Sachin", 47));
        users.add(new User("Chris", 34));
        users.add(new User("Rajeev", 25));
        users.add(new User("David", 31));
        users.add(new User("Chris", 54));

        System.out.println("\nUsers List: " + users);
        // Sort users by age
        users.sort((user1, user2) -> user1.getAge() - user2.getAge());
        System.out.println("Users List sorted by age: " + users);

        // Sort users by name
        users.sort((user1, user2) -> user1.getName().compareTo(user2.getName()));
        System.out.println("Users List sorted by name: " + users);

        // Sort users by name if same name, reverse sort using age
        users.sort((user1, user2) -> {
            int val = user1.getName().compareTo(user2.getName());
            return val != 0 ? val : user2.getAge() - user1.getAge();
        });
        System.out.println("Users sorted by name and for same name reverse sorted by age: " + users);
    }
}
