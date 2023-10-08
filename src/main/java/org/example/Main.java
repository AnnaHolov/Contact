package org.example;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Contact> storage = new ArrayList<Contact>();

    public static void main(String[] args) throws IOException {
        menu();

    }

    static void menu() throws IOException {
        System.out.println("Input number of operation:");
        System.out.println("1-Add");
        System.out.println("2-List:");
        System.out.println("3-Edit");
        System.out.println("4-Delete");
        System.out.println("5-Exit");
        int x = System.in.read();

        char ch = (char) x;
        switch (ch) {
            case '1':
                addContact();
                break;
            case '2':
                listContacts();
                break;
            case '3':
                editContact();
                break;
            case '4':
                deleteContact();
            case '5':
                exitProgram();
            default:
                System.out.println("Wrong number");
                break;
        }
    }

    public static void addContact() throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a name: ");
        String name = sc.next();

        System.out.println("Enter a lastname: ");
        String lastName = sc.next();

        System.out.println("Enter a phone number: ");
        String phoneNumber = sc.next();

        Contact contact = new Contact(name, lastName, phoneNumber);
        System.out.println("Contact " + contact.name + " " + contact.lastName + " " + contact.phoneNumber + " added");
        storage.add(contact);
        menu();
    }

    public static void listContacts() throws IOException {
        System.out.println("List of all contacts.");
        listAllContactFromStorage();
        menu();
    }

    private static void listAllContactFromStorage() {
        int i = 0;

        for (Contact contact : storage) {
            System.out.println("Contact: " + i + " - " + contact.name + " " + contact.lastName + " " + contact.phoneNumber);
            i++;
        }
    }

    public static void editContact() throws IOException {

        listAllContactFromStorage();
        System.out.println("Input number to edit contact");

        Scanner in = new Scanner(System.in);
        int index = in.nextInt();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a name: ");
        String name = sc.next();

        System.out.println("Enter a lastname: ");
        String lastName = sc.next();

        System.out.println("Enter a phone number: ");
        String phoneNumber = sc.next();
        storage.set(index,new Contact(name,lastName,phoneNumber));

        System.out.println("Contact edited.");
        menu();

    }

    public static void deleteContact() throws IOException {
        listAllContactFromStorage();
        System.out.println("Input number to delete contact");

        Scanner in = new Scanner(System.in);
        int index = in.nextInt();

        storage.remove(index);
        System.out.println("Contact deleted.");
        menu();
    }

    public static void exitProgram() throws IOException {
        System.out.println("If you want to exit type 0.");
        System.out.println("Input number:");
        int y = System.in.read();
        if (y == 48) {
            System.exit(0);
        }


    }
}





