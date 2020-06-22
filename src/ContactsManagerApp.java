import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

import util.*;

public class ContactsManagerApp{
    static HashMap<String, String> contactList = new HashMap<>();
    private static void cliMethod() {

        Input in = new Input();

        System.out.println("1. View contacts.\n2. Add a new contact.\n3. Search a contact by name.\n4. Delete an existing contact.\n5. Exit.\nEnter an option (1, 2, 3, 4, or 5): ");

        int userInput = in.getInt(0,5);

        switch (userInput) {
            case 1:

                break;
            case 2:

                break;
            case 3:

                break;
            case 4:

                break;
            case 5:

                break;
        }

    }
    public static void main(String[] args) {

        System.out.println("Hello! Welcome to your Contacts Manager.\nWhat would you like to do?");
        cliMethod();

        Path contactsPath = Paths.get("src/contacts.txt");
//        System.out.println(Files.exists(contactsPath));
        contactList.put("Jay", "2108835222");
        contactList.put("Texas Hammer", "444444444");

    }
}
