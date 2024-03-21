package com.pa.loops;

public class Multiplication {
    public static void main(String[] args) {

        int multiplication = 0 ;
        for(int i = 1; i <=10; i++){

            for(int j=1; j <=12; j++ ){

                 multiplication= i * j ;
                 // add a tab with each column element
                System.out.print("\t" + multiplication);
            }
            // print new line after each row
            System.out.println();
        }



    }
}
