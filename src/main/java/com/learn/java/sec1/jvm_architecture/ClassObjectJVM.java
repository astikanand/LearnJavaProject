package com.learn.java.sec1.jvm_architecture;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

class Student  {
    private String name;
    private int roll_No;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll_no()  {
        return roll_No;
    }

    public void setRoll_no(int roll_no) {
        this.roll_No = roll_no;
    }
}

public class ClassObjectJVM {
    public static void main (String[] args) {
        Student s1 = new Student();

        // Getting hold of Class object created by JVM.
        Class c1 = s1.getClass();

        // Printing type of object using c1.
        System.out.println("Name of class: " + c1.getName());

        // getting all methods in an array
        System.out.println("\nAll the Declared Methods of the class: ");
        Method m[] = c1.getDeclaredMethods();
        for (Method method : m) {
            System.out.println(method.getName());
        }

        // getting all fields in an array
        System.out.println("\nAll the Declared Fields of the class: ");
        Field f[] = c1.getDeclaredFields();
        for (Field field : f) {
            System.out.println(field.getName());
        }

    }
}

