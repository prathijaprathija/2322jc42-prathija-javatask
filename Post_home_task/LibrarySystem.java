package Post_ClassDay1;

import java.util.Scanner;

class Book {
    int bookId;
    String title;
    String author;
    boolean isIssued;

    public Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.isIssued = false;
    }
}

public class LibrarySystem {
    static final int MAX_BOOKS = 100;
    static Book[] books = new Book[MAX_BOOKS];
    static int bookCount = 0;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n--- Library Menu ---");
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Issue Book");
            System.out.println("4. Show All Books");
            System.out.println("5. Exit");
            System.out.print("Choose: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1 -> addBook();
                case 2 -> removeBook();
                case 3 -> issueBook();
                case 4 -> showBooks();
                case 5 -> {
                    System.out.println("Exiting Library System.");
                    return;
                }
                default -> System.out.println("Invalid choice.");
            }
        }
    }

    // 1. Add Book
    public static void addBook() {
        if (bookCount >= MAX_BOOKS) {
            System.out.println("Library is full.");
            return;
        }

        System.out.print("Enter book ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter title: ");
        String title = scanner.nextLine();
        System.out.print("Enter author: ");
        String author = scanner.nextLine();

        books[bookCount++] = new Book(id, title, author);
        System.out.println("Book added successfully.");
    }

    // 2. Remove Book
    public static void removeBook() {
        System.out.print("Enter book ID to remove: ");
        int id = scanner.nextInt();

        for (int i = 0; i < bookCount; i++) {
            if (books[i].bookId == id) {
                // Shift remaining books left
                for (int j = i; j < bookCount - 1; j++) {
                    books[j] = books[j + 1];
                }
                books[--bookCount] = null;
                System.out.println("Book removed.");
                return;
            }
        }
        System.out.println("Book ID not found.");
    }

    // 3. Issue Book
    public static void issueBook() {
        System.out.print("Enter book ID to issue: ");
        int id = scanner.nextInt();

        for (int i = 0; i < bookCount; i++) {
            if (books[i].bookId == id) {
                if (!books[i].isIssued) {
                    books[i].isIssued = true;
                    System.out.println("Book issued successfully.");
                } else {
                    System.out.println("Book is already issued.");
                }
                return;
            }
        }
        System.out.println("Book ID not found.");
    }

    // 4. Show All Books
    public static void showBooks() {
        if (bookCount == 0) {
            System.out.println("No books in library.");
            return;
        }

        System.out.println("\n--- List of Books ---");
        for (int i = 0; i < bookCount; i++) {
            Book b = books[i];
            String status = b.isIssued ? "Issued" : "Available";
            System.out.println(b.bookId + " | " + b.title + " | " + b.author + " | " + status);
        }
    }
}

