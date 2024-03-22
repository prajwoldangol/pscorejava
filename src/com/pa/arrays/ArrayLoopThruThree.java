package com.pa.arrays;

import java.util.Arrays;

public class ArrayLoopThruThree {
    public static void main(String[] args) {
        //Task 7: Write a program where you create an array of 5 elements. Loop through the
        //array and print the value of each element, except for the middle (index 2) element.
        int[] nums = {5,4,8,9,11};
        int mid = nums.length / 2 ;
        for(int i =0; i<nums.length; i++){
            if(i != mid ){
                System.out.println(nums[i]);
            }

        }

    }
}
