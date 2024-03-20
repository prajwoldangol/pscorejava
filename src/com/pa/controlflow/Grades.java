package com.pa.controlflow;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        //5. Write a program that uses if-else-if statements to print out grades A, B, C, D, F,
        // according to the following criteria:
        //A: 90-100
        //B: 80-89
        //C: 70-79
        //D: 60-69
        //F: <60
        //Use the Scanner class to accept a number score from the user to determine the letter grade.
        // Print out “Score out of range” if the score is less than 0 or greater than 100.
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your score ! ");
        double score = 0 ;
        boolean valid = false ;
        // repeat until valid score is passed
        while ( ! valid ) {
            if( input.hasNextDouble()){
                score = input.nextDouble();
                valid = true ;

            }else{
                System.out.println("Invalid Score. Enter Valid Score Again !!");
                input.nextLine();
            }

        }
        if( score >= 90 ){
            System.out.println("A");
        }else if( score >= 80 && score <= 89){
            System.out.println("B");
        }
        else if( score >= 70 && score <= 79){
            System.out.println("C");
        }else if( score >= 60 && score <= 69) {
            System.out.println("D");
        }else {
            System.out.println("F");
        }
        input.close();
    }
}
