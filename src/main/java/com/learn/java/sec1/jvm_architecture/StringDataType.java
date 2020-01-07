package com.learn.java.sec1.jvm_architecture;

public class StringDataType {
    public static void main (String [] args){
        String myString = "This is a string";
        System.out.println("My String : " + myString);
        myString = myString + ", and this is more.";
        System.out.println("My String Now : " + myString);
        myString += " \u00A9 2019";
        System.out.println("My String Now : " + myString);
        String myNewString = "10";
        int myInt = 50;
        myNewString = myNewString + myInt;
        System.out.println("My New String : " + myNewString);
    }
}
