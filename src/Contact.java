import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Contact {

    private String name;
    private String number;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Contact(){}

    public Contact(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static List<String> contactsToContactStrings(List<Contact> contactList) {
        List<String> contactStrings = new ArrayList<>();
        for (Contact contact : contactList) {
            contactStrings.add(contact.getName() + " | " + contact.getNumber());
        }
        return contactStrings;
    }
//    public static List<Contact> contactStringsToContacts(List<String> contactStrings) {
//        List<Contact> contacts = new ArrayList<>();
//        for (String contactString : contactStrings) {
//            contacts.add(new Contact(contactString));
//        }
//        return contacts;
//    }

}
