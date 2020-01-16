package com.learn.java.sec4.java_arrays_strings.strings.Impl1_String;

import java.util.Arrays;

public class StringCreationAndOperations {
    public static void main(String[] args){
        // Create string using :=> literals
        String s = "Astik Anand";

        // Get count of characters using :=> length()
        System.out.println("Length of string s : " + s.length());

        // Check if it is empty using :=> isEmpty()
        System.out.println("Is string empty ? : " + s.isEmpty());

        // Get the char at ith position using :=> charAt(i)
        System.out.println("Char at 4th index : " + s.charAt(4));

        // Get the substring from ith to end using : s.substring(i)
        System.out.println("Substring from 4th index to end : " + s.substring(4));

        // Get the substring from ith to (j-1)th using : substring(i, j)
        System.out.println("Substring from 4th to 9th : " + s.substring(4, 9));

        // Get the subsequence b/w i and j-1 using :=> subsequence(i, j)
        System.out.println("Subsequence form 6th to 9th : " + s.subSequence(6, 9));

        // Concatenate given string to end using :=> s.concat(anotherStr)
        String s1 = "Hello! ";
        String s2 = "Folks, Welcome";
        System.out.println("Concatenated String : " + s1.concat(s2));

        // Get index of first occurrence using :=> indexOf(str)
        String s3 = "Learn Share Learn";
        System.out.println("Index of \"Share\" : " + s3.indexOf("Share"));

        // Get index of first occurrence starting at ith index using :=> indexOf(str, i)
        System.out.println("Index of 'a' starting at 3 : " + s3.indexOf('a', 3));

        // Get last index using :=> lastIndexOf(str)
        System.out.println("Last index of \"Learn\" : " + s3.lastIndexOf("Learn"));

        // Check equality of Strings using :=> equals(anotherStr)
        String s4 = "WeLcOMe";
        System.out.println("Is \"WeLcOMe\" equal to \"Welcome\" ? : " + s4.equals("Welcome"));

        // Check equality of Strings ignoring case using :=> equalsIgnoreCase(anotherStr)
        System.out.println("Is \"WeLcOMe\" equal to \"Welcome\" after ignoring case ? : "
                + s4.equalsIgnoreCase("Welcome"));

        // Check if content equals if content from StringBuffer or Builder using :=> contentEquals(content)
        System.out.println("Is \"WeLcOMe\" content equal to \"Welcome\" ? : "
                + s4.contentEquals(new StringBuffer("Welcome")));

        // Compare String Lexicographically using :=> compareTo(anotherStr)
        String s5 = "abcde";
        System.out.println("Comparing \"abcde\" to \"abcdb\" : " + s5.compareTo("abcdb"));

        // Check if string contains given str using :=> contains(str)
        System.out.println("Does s5 contains \"cd\" ? : " + s5.contains("cd"));

        // Check if string starts with given str using :=> startsWith(str)
        System.out.println("Does s5 startsWith \"abc\" ? : " + s5.startsWith("abc"));

        // Check if string ends with given str usign :=> endsWith(str)
        System.out.println("Does s5 startsWith \"cde\" ? : " + s5.endsWith("cde"));

        // Split on the basis of regex using :=> split(regex)
        String s6 = "I am   a   Programmer  ";
        String[] splitted = s6.split("\\s+");
        System.out.println("Split using regex : " + Arrays.toString(splitted));

        // Convert to Lower Case using :=> toLowerCase()
        String s7 = "ProGraMMeR";
        System.out.println("Lower case of \"ProGraMMeR\" : " + s7.toLowerCase());

        // Convert to Upper Case using :=> toUpperCase()
        System.out.println("Upper case of \"ProGraMMeR\" : " + s7.toUpperCase());

        // Trim spaces using :=> trim()
        String s8 = " Learn Programming   ";
        System.out.println("After trim : " + s8.trim());

        // Replace characters using : replace(oldChar, newChar)
        String s9 = "abracadabra";
        System.out.println("Replace 'a' with 'm' in \"abracadabra\" : " + s9.replace('a', 'm'));

        // Replace using regex : replaceFirst(regex, replacement)
        String s10 = "java, read, job, practice, senior, java, write, job, senior";
        String regex = "(java|job|senior)";
        System.out.println("Replace s10 using replaceFirst(regex, \"XYZ\") : "
                + s10.replaceFirst(regex , "XYZ"));

        // Replace using regex : replaceAll(regex, replacement)
        System.out.println("Replace s10 using replaceAll(regex, \"XYZ\") : "
                + s10.replaceAll(regex, "XYZ"));
    }
}
