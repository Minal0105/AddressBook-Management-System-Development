package com.Bridgelabz;
import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook implements IContactInfo {
    static Scanner input = new Scanner(System.in);

    static ArrayList<Contact> contactBook = new ArrayList<>();

    public void AddContact() {
        System.out.print("Enter First Name:- ");
        String first = input.next();

        System.out.print("Enter Last Name:- ");
        String last = input.next();

        System.out.print("Enter Address:- ");
        String add = input.next();

        System.out.print("Enter City:- ");
        String city = input.next();

        System.out.print("Enter State:- ");
        String state = input.next();

        System.out.print("Enter Zip Code:- ");
        int zip = input.nextInt();

        System.out.print("Enter Phone Number:- ");
        int phone = input.nextInt();

        System.out.print("Enter E-mail:- ");
        String email = input.next();

        Contact contact = new Contact(first, last, add, city, state, zip, phone, email);
        contactBook.add(contact);

        System.out.println("\nContact added Successfully.");
    }

    public void DisplayContacts() {
        System.out.println("\nContacts Present in Address Book:");
        for (Contact person : contactBook) {
            System.out.println(person);
        }
    }

}
