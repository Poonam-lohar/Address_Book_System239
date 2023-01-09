package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {

    Scanner sc = new Scanner(System.in);
    ArrayList<Contacts> addressBook = new ArrayList<>();

    public Contacts createContact() {

        Contacts contact = new Contacts();
        System.out.print("Enter Firstname: ");
        contact.setFirstName(sc.next());
        System.out.print("Enter LastName: ");
        contact.setLastName(sc.next());
        System.out.print("Enter Address: ");
        contact.setAddress(sc.next());
        System.out.print("Enter City: ");
        contact.setCity(sc.next());
        System.out.print("Enter State: ");
        contact.setCity(sc.next());
        System.out.print("Enter email: ");
        contact.setEmail(sc.next());
        System.out.print("Enter ZipCode: ");
        contact.setZipCode(sc.nextInt());
        System.out.print("Enter Phone Number: ");
        contact.setPhoneNumber(sc.nextLong());
        addressBook.add(contact);

        return contact;
    }

    public void addContact() {
        Contacts contacts = createContact();
        System.out.println(contacts);
        System.out.println("Contact Added Successfully.........");
    }

    public void editContact() {
        System.out.println("Confirm first name to edit details: " );
        String confirmName = sc.next();
        for (int i=0; i < addressBook.size(); i++) {
            if (addressBook.get(i).getFirstName().equals(confirmName)) {
                System.out.println("\n1.First Name\n2.last Name\n3.Address\n4.city\n5state\n6.Email\n7.Zip code\n8.Phone number");
                int edit = sc.nextInt();
                switch (edit) {
                    case 1 :
                        System.out.println("Enter First name: ");
                        addressBook.get(i).setFirstName(sc.next());
                        break;
                    case 2 :
                        System.out.println("Enter last name: ");
                        addressBook.get(i).setLastName(sc.next());
                        break;
                    case 3 :
                        System.out.println("Enter Address: ");
                        addressBook.get(i).setAddress(sc.next());
                        break;
                    case 4 :
                        System.out.println("Enter City : ");
                        addressBook.get(i).setCity(sc.next());
                        break;

                    case 5 :
                        System.out.println("Enter State: ");
                        addressBook.get(i).setState(sc.next());
                        break;

                    case 6 :
                        System.out.println("Enter Email: ");
                        addressBook.get(i).setEmail(sc.next());
                        break;

                    case 7 :
                        System.out.println("Enter Zip: ");
                        addressBook.get(i).setZipCode(sc.nextInt());
                        break;
                    case 8 :
                        System.out.println("Enter Phone Number: ");
                        addressBook.get(i).setPhoneNumber(sc.nextInt());
                        break;
                }
                System.out.println("Edited list is: ");
                System.out.println(addressBook);
            }
            else
                System.out.println("Enter valid first name: ");
        }
    }

    public void deleteContact(){
        boolean isContactFound = false;
        System.out.println("enter name to delete contact");
        String name = sc.next();
        for (Contacts contacts : addressBook){
            if (contacts.getFirstName().equalsIgnoreCase(name)) {
                System.out.println("contact found:");
                isContactFound = true;
                System.out.println(contacts);
                System.out.println("confirm to delete (y/n)");
                if (sc.next().equalsIgnoreCase("y")) {
                    addressBook.remove(contacts);
                    System.out.println("contact deleted");
                }
                break;
            }
        }
        if (!isContactFound) {
            System.out.println("Opps... contact not found");
        }
    }

    void display(){
        for (Contacts contacts : addressBook) {
            System.out.println(contacts);
        }
    }
}
