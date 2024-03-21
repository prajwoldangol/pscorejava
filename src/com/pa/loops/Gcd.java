package com.pa.loops;

import java.util.Scanner;

public class Gcd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int firstNum, secondNum ;
        System.out.println("Enter First Number");
        while (true){
            if( input.hasNextInt()){
                firstNum = input.nextInt();
                break ;
            }else{
                System.out.println("Enter Valid first number");
                input.nextLine() ;
            }

        }
        System.out.println("Enter Second Number");
        while(true){
            if( input.hasNextInt()){
                secondNum = input.nextInt();
                break ;

            }else{
                System.out.println("Enter Valid Second number");
                input.next() ;
            }
        }



        // find the smallest of both number
        int min = Math.min(firstNum,secondNum);
        // start going back from smaller upto 1
        for( int i = min ; i > 1 ; i --){
            // if both are divisible by same number then it will print it and end the execution preventing to go forward down to loop
            if( firstNum % i == 0 && secondNum % i == 0 ){
                System.out.println( i );
                return ;
            }
        }
        System.out.println(1);
    }
}
