package com.endava.timbuchalka.s7;

import java.util.ArrayList;
import java.util.Scanner;

// on Udemy fails on adding duplicated contact

public class S7_44_MobilePhone {

    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("999888777");

    public static void main(String[] args) {

        boolean quit = false;
        startPfone();
        printActions();
        while (!quit) {
            System.out.println("Enter you choice:");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("Shut down");
                    quit = true;
                    break;
                case 1:
                    mobilePhone.printContacts();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    printActions();
                    break;
            }
        }
    }

    private static void startPfone() {
        System.out.println("Starting phone ...");
    }

    private static void printActions() {
        System.out.println("\nAvailable actions:");
        System.out.println(
                "0 - Shutdown\n" +
                "1 - Print contacts\n" +
                "2 - Add new contact\n" +
                "3 - Update an existing contact\n" +
                "4 - Remove an existing contact\n" +
                "5 - Query if an existing contact exists\n" +
                "6 - Print the list of available actions");
        System.out.println("Choose your action: ");
    }

    private static void addNewContact() {
        System.out.println("Enter new contact name: ");
        String name = scanner.nextLine();
        System.out.println("Enter phone number: ");
        String number = scanner.nextLine();
        System.out.print("Contact " + name + " with number " + number);
        if (mobilePhone.addNewContact(Contact.createContact(name, number))) {
            System.out.println(" was added successfully");
        } else {
            System.out.println(" wasn't added");
        }
    }

    private static void updateContact() {
        System.out.println("Enter the name of an existing contact:");
        String name = scanner.nextLine();
        Contact oldContact = mobilePhone.queryContact(name);
        if (oldContact == null) {
            System.out.println("Contact " + name + " doesn't exist");
            return;
        }

        System.out.println("Enter new contact name: ");
        name = scanner.nextLine();
        System.out.println("Enter phone number: ");
        String number = scanner.nextLine();
        Contact newContact = Contact.createContact(name, number);
        System.out.print("Contact " + name + " with number " + number);
        if (mobilePhone.updateContact(oldContact, newContact)) {
            System.out.println(" was updated successfully");
        } else {
            System.out.println(" wasn't updated");
        }
    }

    private static void removeContact() {
        System.out.println("Enter the name of an existing contact:");
        String name = scanner.nextLine();
        Contact contact = mobilePhone.queryContact(name);
        if (contact == null) {
            System.out.println("Contact " + name + " doesn't exist");
            return;
        }

        if (mobilePhone.removeContact(contact)) {
            System.out.println("Contact was removed successfully");
        } else {
            System.out.println("Contact wasn't removed");
        }
    }

    private static void queryContact() {
        System.out.println("Enter the name of an existing contact:");
        String name = scanner.nextLine();
        Contact contact = mobilePhone.queryContact(name);
        if (contact == null) {
            System.out.println("Contact " + name + " doesn't exist");
        } else {
            System.out.println("Name: " + contact.getName() + ", phone: " + contact.getPhoneNumber());
        }
    }
}

class MobilePhone {

    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<>();
    }

    public boolean addNewContact(Contact contact) {
        if (findContact(contact.getName()) == -1) {
            myContacts.add(contact);
            return true;
        }
        return false;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        if (findContact(oldContact) > -1) {
            myContacts.set(myContacts.indexOf(oldContact), newContact);
            return true;
        }
        return false;
    }

    public boolean removeContact(Contact contact) {
        if (findContact(contact) > -1) {
            myContacts.remove(contact);
            return true;
        }
        return false;
    }

    private int findContact(Contact contact) {
        return myContacts.indexOf(contact);
    }

    private int findContact(String name) {
        for (Contact element: myContacts) {
            if (element.getName().equalsIgnoreCase(name)) {
                return myContacts.indexOf(element);
            }
        }
        return -1;
    }

    public Contact queryContact(String name) {
        int contactIndex = findContact(name);
        return contactIndex != -1 ? myContacts.get(contactIndex) : null;
    }

    public void printContacts() {
        System.out.println("Contact List:");
        for (int i = 0; i < myContacts.size(); i++) {
            Contact contact = myContacts.get(i);
            System.out.println((i+1) + ". " + contact.getName() + " -> " + contact.getPhoneNumber());
        }
    }
}

class Contact {

    private String name;
    private String phoneNumber;

    public static Contact createContact(String name, String phoneNumber) {
        return new Contact(name, phoneNumber);
    }

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
