package com.pa.arrays;


import java.util.Scanner;

public class TaskEleven {
    public static void main(String[] args) {
        //Task 11: Write some Java code that asks the user how many favorite things they
        //have. Based on their answer, you should create a String array of the correct size.
        //Then ask the user to enter the things and store them in the array you created. Finally,
        //print out the contents of the array.
        Scanner input = new Scanner(System.in);

        int count    = 0;
        String thing = "";
        System.out.println("How many favorite things do you have?");
        while(true){
            if(input.hasNextInt()){
                count = input.nextInt();
                break;
            }else{
                System.out.println("Enter valid number count");
                input.nextLine();
            }
        }
        String[] items = new String[count] ;
        int i = 0 ;
        while( i < count ){
            System.out.println("Enter Your thing");
            thing = input.next();
            items[i] = thing ;
           i++ ;
        }
        System.out.println("Your Favorite things are : ");
        for( String item : items){
            System.out.print(item +" ");
        }
    }
}
