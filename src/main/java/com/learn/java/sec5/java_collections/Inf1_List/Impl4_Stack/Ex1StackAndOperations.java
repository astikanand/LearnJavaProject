package com.learn.java.sec5.java_collections.Inf1_List.Impl4_Stack;

import java.util.Stack;

public class Ex1StackAndOperations {
    public static void main(String[] args){
        Stack<String> topCompanies = new Stack<>();

        // Check if an Stack is empty using :=>  isEmpty()
        System.out.println("Is the topCompanies stack empty? : " + topCompanies.isEmpty());

        // Push the element to stack using :=> push(element)
        topCompanies.push("Facebook");
        topCompanies.push("Amazon");
        topCompanies.push("Microsoft");
        topCompanies.push("Apple");
        topCompanies.push("Google");

        // Find the size of the Stack using :=> size()
        System.out.println("Here are the top " + topCompanies.size() + " companies in the world.");
        System.out.println(topCompanies);

        // Retrieve and remove the top element using :=> pop()
        String bestCompany = topCompanies.pop();

        // Only retrieve the top element now using :=> top()
        String secondBestCompany = topCompanies.peek();

        System.out.println("Best Company: " + bestCompany);
        System.out.println("Second Best Company: " + secondBestCompany);

        // Search the element in stack using :=> search(element)
        System.out.println("Find \"Amazon\" : " + topCompanies.search("Amazon"));
    }
}
