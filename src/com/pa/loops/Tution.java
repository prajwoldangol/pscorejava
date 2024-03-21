package com.pa.loops;

import java.util.Scanner;

public class Tution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        double tution;
        int rate ;
        System.out.println(" Enter Tution amount !!");
        while(true){
            if(input.hasNextDouble()){
                tution = input.nextDouble();
                break ;
            }else{
                System.out.println("Enter valid Tution amount");
                input.nextLine();
            }
        }
        System.out.println("Enter the tution increase rate");
        while(true){
            if(input.hasNextInt()){
                rate = input.nextInt();
                break ;
            }else{
                System.out.println("Enter valid tution increase rate");
                input.next();
            }
        }


        double tuitionDouble = tution * 2 ;
        int year = 0 ;
        while( tution < tuitionDouble){
            tution += rate * tution / 100 ;
            year ++ ;
        }
        System.out.println( "It will take " +year +" years to double the tution");
    }
}
