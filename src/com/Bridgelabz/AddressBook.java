package com.Bridgelabz;
import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook implements IContactInfo {
    static Scanner input = new Scanner(System.in);
    static ArrayList<Contact> contactBook = new ArrayList<>();

    public void EditContact() {
        System.out.println("\nEnter first name to edit :- ");
        String name = input.next();

        for (Contact person : contactBook) {
            if (name.equals(person.First_Name)) {
                System.out.print("\nSelect option to edit----\n1.First_name \n2.Last_name \n3.Address \n4.City \n5.State \n6.Zip_code \n7.Phone_number \n8.Email :- ");
                int option = input.nextInt();
                switch (option) {
                    case 1:
                        System.out.print("Enter new first name :- ");
                        String newFirstName = input.next();
                        person.setFirst_Name(newFirstName);
                        System.out.println("First name is updated.");
                        break;

                    case 2:
                        System.out.print("Enter new last name :- ");
                        String newLastName = input.next();
                        person.setLast_Name(newLastName);
                        System.out.println("Last name is updated.");
                        break;

                    case 3:
                        System.out.print("Enter new Address :- ");
                        String newAddress = input.next();
                        person.setAddress(newAddress);
                        System.out.println("Address is updated.");
                        break;

                    case 4:
                        System.out.print("Enter new city name :- ");
                        String newCity = input.next();
                        person.setCity(newCity);
                        System.out.println("City is updated.");
                        break;

                    case 5:
                        System.out.print("Enter new state name :- ");
                        String newState = input.next();
                        person.setState(newState);
                        System.out.println("State is updated.");
                        break;

                    case 6:
                        System.out.print("Enter new Zip code :- ");
                        int newZip = input.nextInt();
                        person.setZip_code(newZip);
                        System.out.println("Zip code is updated.");
                        break;

                    case 7:
                        System.out.print("Enter new phonr number :- ");
                        int newPhone = input.nextInt();
                        person.setPhone_number(newPhone);
                        System.out.println("Phone number is updated.");
                        break;

                    case 8:
                        System.out.print("Enter new email :- ");
                        String newEmail = input.next();
                        person.setEmail(newEmail);
                        System.out.println("Email is updated.");
                        break;

                    default:
                        System.out.println("Please enter a number between 1 to 8 only...");

                }
            }
            else {
                continue;

            }
        }
    }}