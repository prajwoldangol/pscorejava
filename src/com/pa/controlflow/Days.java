package com.pa.controlflow;

import java.util.Scanner;

public class Days {
    public static void main(String[] args) {
        // 6. Write a program that accepts an integer between 1 and 7 from the user.
        // Use a switch statement to print out the corresponding weekday.
        // Print “Out of range” if the number is less than 1 or greater than 7.
        // Do not forget to include “break” statements in each of your cases.
        Scanner input = new Scanner(System.in);
        int number = 0 ;
        boolean valid = false ;
        System.out.println( " Guess the day !! Please Enter Number !! ");
        // Loop until we get valid number from the user .
        while(!valid){
            if( input.hasNextInt()){
                number  = input.nextInt();
                valid = true ;
            }else{
                System.out.println( " Please Enter Valid Number !! ");
                input.nextLine();
            }
        }

        switch (number){
            case 1:
                System.out.println("Today is Sunday");
                break;
            case 2:
                System.out.println("Today is Monday");
                break;
            case 3:
                System.out.println("Today is Tuesday");
                break;
            case 4:
                System.out.println("Today is Wednesday");
                break;
            case 5:
                System.out.println("Today is Thursday");
                break;
            case 6:
                System.out.println("Today is Friday");
                break;
            case 7:
                System.out.println("Today is Saturday");
                break;
            default:
                System.out.println(" Number Out of Range !! ");

        }
        input.close();
    }
}
