package com.pa.oops.interfaceimpl;

public class KidUser implements LibraryUser{
    public int age;
    public String bookType;

    public KidUser(int age, String bookType) {
        this.age = age;
        this.bookType = bookType;
    }

    @Override
    public void registerAccount() {
     if( this.age <= 11){
         System.out.println("You have successfully registered under a Kids Account");
     }else{
         System.out.println("Sorry, age must be less than 12 to register as a kid.");
     }
    }

    @Override
    public void registerBook() {
        if(this.age > 11){
            System.out.println("You are not allowed in kids library to register a book !! ");
            return ;
        }
        if( this.age <= 11 && this.bookType.equals("Kids")){
            System.out.println("Book issued successfully, please return the book within 10 days");
        }else{
            System.out.println("Oops,you are allowed to take only kids books.");
        }
    }
}
