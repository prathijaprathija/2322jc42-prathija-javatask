package Post_ClassDay1;


import java.util.Scanner;

public class MiniAddressBook {

    static final int MAX_CONTACTS = 100;
    static String[] names = new String[MAX_CONTACTS];
    static String[] phones = new String[MAX_CONTACTS];
    static String[] emails = new String[MAX_CONTACTS];
    static int contactCount = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Mini Address Book ---");
            System.out.println("1. Add Contact");
            System.out.println("2. List Contacts");
            System.out.println("3. Search Contact by Name");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
           
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                	addContact(scanner);
                	break;
                	
                case 2 :
                	listContacts();
                	break;
               
                case 3 :
                	searchContact(scanner);
                	break;
                case 4 : {
                    System.out.println("Exiting Address Book.");
                    return;
                  
                }
                default : 
                System.out.println("Invalid choice. Try again.");
            }
        }
    }

    public static void addContact(Scanner scanner) {
        if (contactCount >= MAX_CONTACTS) {
            System.out.println("Address book full.");
            return;
        }

        System.out.print("Enter name: ");
        names[contactCount] = scanner.nextLine();

        System.out.print("Enter phone: ");
        phones[contactCount] = scanner.nextLine();

        System.out.print("Enter email: ");
        emails[contactCount] = scanner.nextLine();

        System.out.println("Contact added.");
        contactCount++;
    }

    public static void listContacts() {
        if (contactCount == 0) {
            System.out.println("No contacts found.");
            return;
        }

        System.out.println("\n--- Contact List ---");
        for (int i = 0; i < contactCount; i++) {
            System.out.println((i + 1) + ". " + names[i] + " | " + phones[i] + " | " + emails[i]);
        }
    }

    public static void searchContact(Scanner scanner) {
        System.out.print("Enter name to search: ");
        String searchName = scanner.nextLine().toLowerCase();
        boolean found = false;

        for (int i = 0; i < contactCount; i++) {
            if (names[i].toLowerCase().contains(searchName)) {
                System.out.println("Found: " + names[i] + " | " + phones[i] + " | " + emails[i]);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No contact found with that name.");
        }
    }
}

