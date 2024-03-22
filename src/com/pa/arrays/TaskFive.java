package com.pa.arrays;

import java.util.Arrays;

public class TaskFive {
    public static void main(String[] args) {
        //Task 5: Write a program where you create an integer array with a length of 5. Loop
        //through the array and assign the value of the loop control variable (e.g., i) to the
        //corresponding index in the array
        int[] nums = new int[5];
        for(int i =0; i<nums.length; i++){
            nums[i] = i ;
        }
        System.out.println(Arrays.toString(nums));
    }
}
