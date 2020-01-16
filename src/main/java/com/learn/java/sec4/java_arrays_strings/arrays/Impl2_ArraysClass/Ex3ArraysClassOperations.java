package com.learn.java.sec4.java_arrays_strings.arrays.Impl2_ArraysClass;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ex3ArraysClassOperations {
    public static void main(String[] args){
        // Create an array using :=> Type[] arr = new Type[size]
        int[] arr = new int[5];

        // Filling values in array using : arr[index] = val
        arr[0] = 10; arr[1] = 20; arr[2] = 15;
        arr[3] = 22; arr[4] = 35;

        // Get the length of the arr using : length member
        System.out.println("Length of the arr : " + arr.length);

        // Get string representation of array using : toString(arr)
        String arrString = Arrays.toString(arr);
        System.out.println("String rep of arr : " + arrString);

        // List representation of array using : asList(arr)
        System.out.println("List representation of arr : " + Arrays.asList(arr));

        // Binary Search in arr using : binarySearch(arr, key)
        Arrays.sort(arr);
        System.out.println("Find key 22 in arr : " + Arrays.binarySearch(arr, 22));

        // Binary Search in range using : binarySearch(arr, fromIndex, toIndex, key)
        System.out.println("Find key 22 in arr : " + Arrays.binarySearch(arr, 1, 3, 22));

        // Fill the arr with new value using :=> fill(arr, newVal)
        Arrays.fill(arr, 55);
        System.out.println("Arrays after filling with 55 : " + arr);

        int arr1[] = { 10, 20, 15, 22, 35 };
        int arr2[] = { 10, 15, 22 };

        // Check if arrays are equal using :=> equals(arr1, arr2)
        System.out.println("Are arr1 and arr2 equal ? : " + Arrays.equals(arr1, arr2));

        // sort arr using :=> sort(arr)
        Arrays.sort(arr1);
        System.out.println("Sorted Arr : " + Arrays.toString(arr1));

        // Use stream using :=> stream(arr)
        List<Integer> arrIntegerList = Arrays.stream(arr1)   // Stream of int
                                                .boxed()    // Stream of Integer
                                                .collect(Collectors.toList());
        System.out.println("Integer List of arr : " + arrIntegerList);
    }
}
