package com.pa.arrays;

import java.util.Arrays;

public class TaskNine {
    public static void main(String[] args) {
        //Task 9:
        //Write a program to sort the following int array in ascending order: {4, 2, 9, 13, 1,
        //0}. Print the array in ascending order, and print the smallest and the largest
        //element of the array. The output will look like the following:
        //Array in ascending order: 0, 1, 2, 4, 9, 13
        //The smallest number is 0
        //The biggest number is 13
        int[] nums = {4, 2, 9, 13, 1,0} ;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for( int i = 0; i < nums.length; i++ ){
            for( int j = i+1; j < nums.length; j++){

                // if current item is less than the one wecomparing with
                if( nums[j] < nums[i]){
                    //check before swapping if it is min value is greater than current value
                    if( min > nums[j]){
                        min = nums[j];
                    }
                    // store old value before we swap
                    int temp = nums[i];
                    // swap the small value
                    nums[i] = nums[j];
                    // assign the large value to current index
                    nums[j] = temp;


                }
                // if current max is less than j index
                if( max < nums[j]){
                    max = nums[j];
                }


            }
        }
        System.out.println(min);
        System.out.println(max);
        System.out.println(Arrays.toString(nums));
    }
}
