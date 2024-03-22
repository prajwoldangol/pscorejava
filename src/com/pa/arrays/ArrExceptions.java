package com.pa.arrays;

public class ArrExceptions {
    public static void main(String[] args) {
        //Task 4: Write a program that creates an integer array with 5 elements (i.e., numbers).
        //The numbers can be any integers. Print out the value at the first index and the last
        //index using length - 1 as the index. Now try printing the value at index = length (e.g.,
        //myArray[myArray.length] ). Notice the type of exception which is produced. Now try
        //to assign a value to the array index 5. You should get the same type of exception.
        int[] nums = new int[5];
        nums = new int[]{2, 4, 6, 8, 5};

        System.out.println(nums[0]);
        System.out.println(nums[nums.length - 1 ]);
        // we get ArrayIndexOutOfBoundsException from line 11 and 12
        System.out.println(nums[nums.length]);
        nums[5] = 10 ;

    }
}
