package org.example;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Contact contact1 = new Contact();
        System.out.println("Input number:");
        int x = System.in.read();

        char ch = (char) x;
        switch (ch) {
            case '1':
                contact1.addContact();
                break;
            case '2':
                contact1.ListContacts();
                break;
            case '3':
                contact1.EditContact();
                break;
            case '4':
                contact1.DeleteContact();
            case '5':
                contact1.ExitProgram();
            default:
                System.out.println("Wrong number");
                break;
        }
    }

    static class Contact {
        String Name;
        String LastName;
        int PhoneNumber;

        public Contact() {
        }

        public Contact(String name, String lastName, int phoneNumber) {
            Name = name;
            LastName = lastName;
            PhoneNumber = phoneNumber;
        }

        public void addContact() {
            System.out.println("New contact added.");
            System.out.println("Name: " + Name + "Lastname: " + LastName + "Number: " + PhoneNumber);


        }

        public void ListContacts() {
            System.out.println("List of all contacts.");


        }

        public void EditContact() {
            System.out.println("Contact edited.");
            System.out.println("Name: " + Name + "Lastname: " + LastName + "Number: " + PhoneNumber);


        }

        public void DeleteContact() {
            System.out.println("Contact deleted.");

        }

        public void ExitProgram() throws IOException {
            System.out.println("If you want to exit type 0.");
            System.out.println("Input number:");
            int y = System.in.read();
            if (y == 48) {
                System.exit(0);
            }

        }
    }

}



