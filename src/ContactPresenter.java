import java.util.Scanner;
public class ContactPresenter implements ContactView {
    private ContactController contactController;
    Scanner scanner = new Scanner(System.in);
    public ContactPresenter() {
        contactController = new ContactController();
    }

    @Override
    public void onCreateContact() {
        System.out.print("Enter contact name: ");
        String name = scanner.nextLine();
        System.out.print("Enter contact phone number: ");
        String phoneNumber = scanner.nextLine();
        System.out.print("Enter contact email: ");
        String email = scanner.nextLine();
        contactController.createContact(name, phoneNumber, email);
    }

    @Override
    public void onEditContact() {
        System.out.print("Enter contact ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter new contact name: ");
        String name = scanner.nextLine();
        System.out.print("Enter new contact phone number: ");
        String phoneNumber = scanner.nextLine();
        System.out.print("Enter new contact email: ");
        String email = scanner.nextLine();
        contactController.editContact(id, name, phoneNumber, email);
    }

    @Override
    public void onDeleteContact() {
        System.out.print("Enter contact ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        contactController.deleteContact(id);
    }

    @Override
    public void onShowAllContacts() {
        contactController.showAllContacts();
    }
}

