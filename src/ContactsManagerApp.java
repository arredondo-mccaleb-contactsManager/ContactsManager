import java.io.IOException;
import java.nio.file.*;
import java.util.*;

import util.*;

public class ContactsManagerApp{
                static Path contactsPath = Paths.get("src/contacts.txt");
                static List<String> contactList = new ArrayList<>();
    private static void cliMethod() {

        Input in = new Input();

        System.out.println("1. View contacts.\n2. Add a new contact.\n3. Search a contact by name.\n4. Delete an existing contact.\n5. Exit.\nEnter an option (1, 2, 3, 4, or 5): ");

        int userInput = in.getInt(1,5);

        switch (userInput) {
            // view all contacts
            case 1:
//                // need to use Files.readAllLines()
                ContactFunctions.viewContacts();
                cliMethod();
                break;
            // add a new contact
            case 2:
                ContactFunctions.addContact();
                cliMethod();
                break;
            // search contact by name
            case 3:
                ContactFunctions.searchContact();
                cliMethod();
                break;
            // delete a contact
            case 4:
                ContactFunctions.deleteContact();
                cliMethod();
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
