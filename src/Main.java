import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ContactPresenter contactPresenter = new ContactPresenter();
        Scanner scanner = new Scanner(System.in);
        System.out.println("hdjsf");

        while (true) {
            System.out.println("1. Create contact");
            System.out.println("2. Edit contact");
            System.out.println("3. Delete contact");
            System.out.println("4. Show all contacts");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    contactPresenter.onCreateContact();
                    break;
                case 2:
                    contactPresenter.onEditContact();
                    break;
                case 3:
                    contactPresenter.onDeleteContact();
                    break;
                case 4:
                    contactPresenter.onShowAllContacts();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        }
    }
}
