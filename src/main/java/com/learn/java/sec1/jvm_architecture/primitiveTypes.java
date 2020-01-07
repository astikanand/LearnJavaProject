package com.learn.java.sec1.jvm_architecture;

public class primitiveTypes {
    public static void main (String [] args) {
        /*
         Primitive Types: float and double
         */
        float myMinFloatVal = Float.MIN_VALUE;
        float myMaxFloatVal = Float.MAX_VALUE;
        System.out.println("Min Float Value: " + myMinFloatVal);
        System.out.println("Max Float Value: " + myMaxFloatVal);

        double myMinDoubleVal = Double.MIN_VALUE;
        double myMaxDoubleVal = Double.MAX_VALUE;
        System.out.println("\nMin Double Value: " + myMinDoubleVal);
        System.out.println("Max Float Value: " + myMaxDoubleVal);

        int myIntVal = 5;
        float myFloatVal = 5.25f;
        float myFloatVal2 = (float) 5.25;
        double myDoubleVal = 5.25;
        double myDoubleVal2 = 5.25d;

        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5.00 / 3;
        System.out.println("MyIntValue: " + myIntValue);
        System.out.println("MyFloatValue: " + myFloatValue);
        System.out.println("MyDoubleValue: " + myDoubleValue);


        /*
         Primitive Types: char and boolean
         */
        char myChar = 'D';
        char myUnicodeChar = '\u0044';
        System.out.println(myChar);
        System.out.println(myUnicodeChar);
        char myCopyRightChar = '\u00A9';
        System.out.println(myCopyRightChar);
        boolean isCustomerOver18 = true;

    }
}
