package com.pa.oops.interfaceimpl;

public class AdultUser implements LibraryUser{
    public int age;
    public String bookType;

    public AdultUser(int age, String bookType) {
        this.age = age;
        this.bookType = bookType;
    }

    @Override
    public void registerAccount() {
        if( this.age >= 12){
            System.out.println("You have successfully registered under a Adult Account");
        }else{
            System.out.println("Sorry, age must be greater than 12 to register as an Adult.");
        }
    }

    @Override
    public void registerBook() {
        if(this.age < 12){
            System.out.println("You are not allowed in Adult library to register a book !! ");
            return ;
        }
        if( this.age >= 12 && this.bookType.equals("Fiction")){
            System.out.println("Book issued successfully, please return the book within 7 days");
        }else{
            System.out.println("Oops,you are allowed to take only Fiction books.");
        }
    }
}
