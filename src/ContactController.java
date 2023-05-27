import java.util.ArrayList;

public class ContactController {
    private ArrayList<Contact> contacts;
    private int nextId;

    public ContactController() {
        contacts = new ArrayList<>();
        nextId = 1;
    }

    public void createContact(String name, String phoneNumber, String email) {
        Contact contact = new ContactImpl(nextId, name, phoneNumber, email);
        contacts.add(contact);
        nextId++;
        System.out.println("Contact created with id " + contact.getId());
    }

    public void editContact(int id, String name, String phoneNumber, String email) {
        for (Contact contact : contacts) {
            if (contact.getId() == id) {
                contact.setName(name);
                contact.setPhoneNumber(phoneNumber);
                contact.setEmail(email);
                System.out.println("Contact with id " + id + " edited successfully.");
                return;
            }
        }
        System.out.println("Contact with id " + id + " not found.");
    }

    public void deleteContact(int id) {
        for (Contact contact : contacts) {
            if (contact.getId() == id) {
                contacts.remove(contact);
                System.out.println("Contact with id " + id + " deleted successfully.");
                return;
            }
        }
        System.out.println("Contact with id " + id + " not found.");
    }

    public void showAllContacts() {
        if (contacts.isEmpty()) {
            System.out.println("No contacts found.");
            return;
        }
        System.out.println("List of all contacts:");
        for (Contact contact : contacts) {
            System.out.println(contact.getId() + "\t" + contact.getName() + "\t" + contact.getPhoneNumber() + "\t" + contact.getEmail());
        }
    }
}
