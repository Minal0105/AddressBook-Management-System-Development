package com.Bridgelabz;
import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook implements IContactInfo {
    static Scanner input = new Scanner(System.in);
    static ArrayList<Contact> contactBook = new ArrayList<>();

    public void DeleteContact() {
        System.out.print("Enter first name to delete contact:- ");
        String name_to_delete = input.next();

        for (int i = 0; i < contactBook.size(); i++) {
            String search_name_in_arrayList = contactBook.get(i).getFirst_Name();

            if (name_to_delete.equals(search_name_in_arrayList)) {
                contactBook.remove(i);
                System.out.println("\nEntered contact deleted successfully.");
                break;
            } else {
                continue;

            }
        }
    }
}