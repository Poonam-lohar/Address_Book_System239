package com.bridgelabz;

import java.util.Scanner;

public class AddressBookMain {

    public static void main(String[] args) {

        System.out.println("....Welcome To Address Book System....");
        System.out.println("--------------------------------------");
        AddressBook addressBook = new AddressBook();
        addressBook.addContact();
        System.out.println("\n1.Add Contact \n2.Edit Contact \n3.Delete \n4.Display \n5.Exit");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                addressBook.addContact();
                break;
            case 2:
                addressBook.editContact();
                break;
            case 3:
                addressBook.deleteContact();
                break;
            case 4:
                addressBook.display();
                break;
            case 5:
                System.out.println("Thank You We Are Exited........");
                break;
            default:
                System.out.println("Invalid Option..");
                break;
        }
    }
}
