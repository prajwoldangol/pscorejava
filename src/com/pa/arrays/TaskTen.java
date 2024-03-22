package com.pa.arrays;

import java.util.Arrays;

public class TaskTen {
    public static void main(String[] args) {
        //Task 10: Create an array that includes an integer, 3 strings, and 1 double. Print the
        //array.

        Object[] multiType = new Object[] { 55, "string1","string2", "string3", 5.55 } ;
        System.out.println(Arrays.toString(multiType));
    }
}
