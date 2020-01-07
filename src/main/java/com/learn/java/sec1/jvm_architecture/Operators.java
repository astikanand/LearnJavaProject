package com.learn.java.sec1.jvm_architecture;

public class Operators {
    public static void main(String [] args){
        int clientAge = 20;
        boolean clientOver18 = (clientAge > 18) ? true : false;

        double a = 20.00;
        double b = 80.00;
        double c = (a + b) * 100;
        double remainder = c % 40;
        boolean result = (remainder == 0) ? true : false;
        System.out.println("Final Result : " + result);
        System.out.println(5.00 % 3.5);

    }
}
