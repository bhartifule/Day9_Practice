package com.bridgelabz;
import java.util.PrimitiveIterator;
import java.util.Scanner;

public class AdressBook {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        AddressBookMain addBook = new AddressBookMain();
        String start = "start";

        System.out.println("Welcome to Address Book Program");
        while(start.equals("start")){
            System.out.println("if you want to add address press 1 if show address press 2");
            int choice = sc.nextInt();
            if(choice==1)
                addBook.saveAddress();
            else if (choice==2)
                addBook.showMyAddress();
            else
                System.out.println("Chouse correct option ");
        }

    }


    }


