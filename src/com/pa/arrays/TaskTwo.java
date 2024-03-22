package com.pa.arrays;

public class TaskTwo {
    public static void main(String[] args) {
        //Task 2: Write a program that returns the middle element in an array. Give the following
        //values to the integer array: {13, 5, 7, 68, 2} and produce the following output: 7
        int[] arr = {13, 5, 7, 68, 2} ;
        int midIndex = arr.length/2 ;
        System.out.println(arr[midIndex]);
    }
}
