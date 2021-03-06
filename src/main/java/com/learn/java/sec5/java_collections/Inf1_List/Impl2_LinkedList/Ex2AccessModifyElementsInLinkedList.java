package com.learn.java.sec5.java_collections.Inf1_List.Impl2_LinkedList;

import java.util.LinkedList;

public class Ex2AccessModifyElementsInLinkedList {
    public static void main(String[] args){
        LinkedList<String> topCompanies = new LinkedList<>();

        // Check if an LinkedList is empty using :=>  isEmpty()
        System.out.println("Is the topCompanies list empty? : " + topCompanies.isEmpty());

        topCompanies.add("Google");
        topCompanies.add("Apple");
        topCompanies.add("Microsoft");
        topCompanies.add("Amazon");
        topCompanies.add("Facebook");

        // Find the size of the LinkedList using :=> size()
        System.out.println("Here are the top " + topCompanies.size() + " companies in the world.");
        System.out.println(topCompanies);

        // Retrieve the element at first, last and given index using :=> get(index)
        String bestCompany = topCompanies.getFirst();
        String lastCompany = topCompanies.getLast();
        String thirdBestCompany = topCompanies.get(2);

        System.out.println("Best Company: " + bestCompany);
        System.out.println("Third Best Company: " + thirdBestCompany);
        System.out.println("Last Best Company: " + lastCompany);

        // Modify the element at a given index using :=> set(index, element)
        topCompanies.set(4, "Walmart");

        System.out.println("Modified Top Companies List: " + topCompanies);
    }
}
