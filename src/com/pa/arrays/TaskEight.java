package com.pa.arrays;

import java.util.Arrays;

public class TaskEight {
    public static void main(String[] args) {
        //Task 8: Write a program that creates a String array of 5 elements and swaps the first
        //element with the middle element without creating a new array.
        String[] strings = {"java","lava","program","c","C++" };

        int mid = strings.length / 2 ;
        String temp = strings[0];
        strings[0] = strings[mid];
        strings[mid] = temp;

        System.out.println(Arrays.toString(strings));
    }
}
