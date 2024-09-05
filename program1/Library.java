package Task3.program1;

public class Library {

    // Declaring an array of class Book
    private Book[] books;
    private int count;       // To have a count of number of books stored

    //  Parameterized Constructor to initialize
    public Library() {
        this.books = new Book[5];   // Initial array of size 5
        this.count = 0;
    }

    // Method to add book attributes to the Library
    public void addBook(Book book) {
        if (count < books.length) {
            books[count] = book;
            count++;
            System.out.println("Book added successfully!");
        } else {
            System.out.println("Library is full ,cannot add more books.");
        }
    }

    // Method to replace a book in the library by bookID
    public void replaceBook(int bookID, String name, String author) {
        for (Book book : books) {
            if (book.getBookID() == bookID) {
                book.setTitle(name);
                book.setAuthor(author);
                break;
            }
        }
        System.out.println("Book ID found add and Replaced with the given Details");
    }

    // Method to search for a book by bookID
    public void searchBook(int bookID) {
        for (int i = 0; i < count; i++) {
            if(books[i].getBookID()==bookID)
            {
                System.out.println("Found the book ");
                System.out.println("Title: " + books[i].getTitle());
                System.out.println("Author: " + books[i].getAuthor()); ;
                break;
            }
        }
    }


    // Method to display all books in the library
    public void displayBooks() {
        if (count == 0) {
            System.out.println("No books in the library.");
        } else {
            for (int i = 0; i < count; i++) {
                System.out.println("Book ID: " + books[i].getBookID());
                System.out.println("Title: " + books[i].getTitle());
                System.out.println("Author: " + books[i].getAuthor());
                System.out.println("Available: " + (books[i].isAvailable() ? "Yes" : "No"));
            }
        }
    }
}

