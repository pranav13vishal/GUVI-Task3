package Task3.program1;

import java.util.Scanner;

public class BookManagementSystem {
    public static void main(String[] args) {

        // Creating a reference variable of class Library
        Library library = new Library();

        Scanner scanner = new Scanner(System.in);
        int choice;

        // // Method for user to interact with the library system
        do {
            System.out.println("Library Management System");
            System.out.println("1. Add Book");
            System.out.println("2. Replace Book");
            System.out.println("3. Search Book");
            System.out.println("4. Display All Books");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // calling the addBook function
                    System.out.print("Enter Book ID: ");
                    int bookID = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter Author: ");
                    String author = scanner.nextLine();
                    library.addBook(new Book(bookID,title,author,true));
                    break;

                case 2:
                    // calling the replaceBook function
                    System.out.print("Enter Book ID to replace: ");
                    int replaceID = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter new Title: ");
                    String newTitle = scanner.nextLine();
                    System.out.print("Enter new Author: ");
                    String newAuthor = scanner.nextLine();
                    library.replaceBook(replaceID,newTitle,newAuthor);
                    break;

                case 3:
                    // calling the displayBooks function
                    System.out.print("Enter Book ID to search: ");
                    int searchID = scanner.nextInt();
                    library.searchBook(searchID);
                    break;

                case 4:
                    // calling the displayBooks function
                    library.displayBooks();
                    break;

                case 5:
                    System.out.println("Exiting system...");
                    break;

                default:
                    System.out.println("Invalid choice, please try again.");
            }
        } while (choice != 5);

    }
}
