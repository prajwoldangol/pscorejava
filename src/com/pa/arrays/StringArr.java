package com.pa.arrays;

import java.util.Arrays;

public class StringArr {
    public static void main(String[] args) {
        //Task 3: Write a program that creates an array of String type and initializes it with the
        //strings “red,” “green,” “blue,” and “yellow.” Print out the array length. Make a copy
        //using the clone( ) method. Use the Arrays.toString( ) method on the new array to
        //verify that the original array was copied.
        String[] colors = {"Red","Green","Yellow","Blue"};
        System.out.println(colors.length);
        String[] clone = colors.clone();
        System.out.println(Arrays.toString(clone));
    }
}
