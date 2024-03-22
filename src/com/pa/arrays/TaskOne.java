package com.pa.arrays;

import java.util.Arrays;

public class TaskOne {
    public static void main(String[] args) {
        //Task 1: Write a program that creates an array of integers with a length of 3. Assign
        //the values 1, 2, and 3 to the indexes. Print out each array element.
        int[] arrayInt = new int[3] ;
        arrayInt[0] = 1 ;
        arrayInt[1] = 2;
        arrayInt[2] = 3;
        System.out.println(Arrays.toString(arrayInt));
    }
}
