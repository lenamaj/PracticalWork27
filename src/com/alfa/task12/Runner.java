package com.alfa.task12;

public class Runner {

    public void run(){

        //1

        MyPhoneBookold phoneBook = new MyPhoneBookold();
        phoneBook.addPhoneNumber("Ivan", "06644428653");
        phoneBook.addPhoneNumber("Lena", "0631300973");
        phoneBook.addPhoneNumber("Nastya", "0667262626");
        phoneBook.addPhoneNumber("Olya", "07272272727");
        phoneBook.addPhoneNumber("Kolya", "776773667676");
        phoneBook.addPhoneNumber("Marina", "9877633");
        phoneBook.addPhoneNumber("Sasha", "75656565");
        phoneBook.printPhoneBook();


        //phoneBook.sortByName();
        //phoneBook.printPhoneBook();

        System.out.println();
        //phoneBook.sortByPhone();
        //phoneBook.printPhoneBook();


    }
}
