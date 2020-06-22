import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import util.*;

public class ContactsManagerApp{

    private static void cliMethod() {

        Input in = new Input();

        System.out.println("1. View contacts.\n2. Add a new contact.\n3. Search a contact by name.\n4. Delete an existing contact.\n5. Exit.\nEnter an option (1, 2, 3, 4, or 5): ");

        int userInput = in.getInt(0,5);

        switch (userInput) {
            case 0:
                break;
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

        cliMethod();

        Path contactsPath = Paths.get("src/contacts.txt");
        System.out.println(Files.exists(contactsPath));

        HashMap<String, Contact> contactHashMap;
    }
}
