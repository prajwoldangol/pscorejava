package com.pa.arrays;

import java.util.Arrays;

public class ArrayLoopThruTwo {
    public static void main(String[] args) {
        //Task 6: Write a program where you create an integer array of 5 numbers. Loop
        //through the array and assign the value of the loop control variable multiplied by 2 to
        //the corresponding index in the array.
        int[] nums = new int[5];
        for(int i =0; i<nums.length; i++){
            nums[i] = i * 2 ;
        }
        System.out.println(Arrays.toString(nums));
    }
}
