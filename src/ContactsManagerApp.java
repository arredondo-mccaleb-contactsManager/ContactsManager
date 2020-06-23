import java.io.IOException;
import java.nio.file.*;
import java.util.*;

import util.*;

public class ContactsManagerApp{
                static Path contactsPath = Paths.get("src/contacts.txt");
    private static void cliMethod() {

        Input in = new Input();

        System.out.println("1. View contacts.\n2. Add a new contact.\n3. Search a contact by name.\n4. Delete an existing contact.\n5. Exit.\nEnter an option (1, 2, 3, 4, or 5): ");

        int userInput = in.getInt(1,5);
        List<Contact> contacts;
        List<String> contactList = new ArrayList<>();
        contactList.add("Jay | 2108835222");
        contacts = Contact.contactStringsToContacts(contactList);
        switch (userInput) {
            // view all contacts
            case 1:
                // need to use Files.readAllLines()
                System.out.println("Here are all of your contacts.");
                try {
                    List<String> showContacts = Files.readAllLines(contactsPath);
                    for(String contact: showContacts) {
                        System.out.println(contact);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
                System.out.println("\nWhat would you like to do next?\n");
                cliMethod();
                break;
            // add a new contact
            case 2:
                System.out.println("Please enter the name and phone number you would like to add.");
                List<String> newContacts = new ArrayList<>();
                newContacts.add(in.getString());
                Contact.contactsToContactStrings(contacts);
                try {
                    Files.write(contactsPath, newContacts, StandardOpenOption.APPEND);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                System.out.println("Your contact as been added!");
                System.out.println("\nWhat would you like to do next?\n");
                cliMethod();
                break;
            // search contact by name
            case 3:

                break;
            // delete a contact
            case 4:

                break;
            // exit
            case 5:
                System.out.println("Goodbye!");
                break;
        }

    }
    public static void main(String[] args) {

        System.out.println("Hello! Welcome to your Contacts Manager.\nWhat would you like to do?");
        cliMethod();

    }
}
