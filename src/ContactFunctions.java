import util.Input;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class ContactFunctions {
    static Path contactsPath = Paths.get("src/contacts.txt");
    static List<String> contactList = new ArrayList<>();
    static Input in = new Input();

    public static void viewContacts(){
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
        try {
            contactList = Files.readAllLines(contactsPath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void addContact(){
        System.out.println("Please enter the name and phone number you would like to add.");
        List<String> newContacts = new ArrayList<>();
        newContacts.add(in.getString());
        try {
            Files.write(contactsPath, newContacts, StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }
        // redefine the List of contacts
        System.out.println("Your contact as been added!");
        System.out.println("\nWhat would you like to do next?\n");
    }
}
