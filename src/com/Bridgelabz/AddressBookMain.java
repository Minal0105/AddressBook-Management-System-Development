package com.Bridgelabz;

import java.util.Scanner;

public class AddressBookMain {

    public static void main(String[] args) {
        AddressBook Ab = new AddressBook();
        boolean flag=true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("--------------------Welcome To Address Book Program-----------------------");
        while (flag) {

            System.out.println("Select an operation to perform\n 1. Add Contact\n 2. Display Contacts\n 3. Edit Existing Contact\n 4.Delete Existing Contact\n 5.Exit");
            System.out.print("Enter your option : ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    Ab.AddContact();
                    break;
                case 2:
                    Ab.DisplayContacts();
                    break;
                case 3:
                    Ab.EditContact();
                    break;
                case 4:
                    Ab.DeleteContact();
                    break;
                case 5:
                    flag=false;
                    break;
                default:
                    System.out.println("Enter Valid Choice");
            }
        }
    }
}