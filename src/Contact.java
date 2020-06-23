import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Contact {

    private String contactInfo;


    public Contact(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public String getName() {
        return contactInfo;
    }

    public void setName(String name) {
        this.contactInfo = contactInfo;
    }

    public static List<String> contactsToContactStrings(List<Contact> contactList) {
        List<String> contactStrings = new ArrayList<>();
        for (Contact contact : contactList) {
            contactStrings.add(contact.getName());
        }
        return contactStrings;
    }
    public static List<Contact> contactStringsToContacts(List<String> contactStrings) {
        List<Contact> contacts = new ArrayList<>();
        for (String contactString : contactStrings) {
            contacts.add(new Contact(contactString));
        }
        return contacts;
    }
}
