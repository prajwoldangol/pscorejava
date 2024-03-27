package com.pa.oops.interfaceimpl;

public class LibraryInterfaceDemo {
    public static void main(String[] args) {

        LibraryUser kid = new KidUser(10, "Kids");
        System.out.println( " KID 1");
        kid.registerAccount();
        kid.registerBook();
        System.out.println( " KID 2");
        LibraryUser kid2 = new KidUser(10, "Fiction");
        kid2.registerAccount();
        kid2.registerBook();
        System.out.println( " KID 3");
        LibraryUser kid3 = new KidUser(18, "Kids");
        kid3.registerAccount();
        kid3.registerBook();
        System.out.println( " KID 4");
        LibraryUser kid4 = new KidUser(18, "Fiction");
        kid4.registerAccount();
        kid4.registerBook();
        System.out.println( " Adult 1");
        LibraryUser adult = new AdultUser(5, "Kids");
        adult.registerAccount();
        adult.registerBook();
        System.out.println( " Adult 2");
        LibraryUser adult2 = new AdultUser(5, "Fiction");
        adult2.registerAccount();
        adult2.registerBook();
        System.out.println( " Adult 3");
        LibraryUser adult3 = new AdultUser(23, "Kids");
        adult3.registerAccount();
        adult3.registerBook();
        System.out.println( " Adult 4");
        LibraryUser adult4 = new AdultUser(23, "Fiction");
        adult4.registerAccount();
        adult4.registerBook();
    }
}
