
public class Main {
    public static void main(String[] args) {
        System.out.println("=== Library Management System ===\n");


        Library library = new Library();

        System.out.println("Adding books to library...");
        Book b1 = new Book("Java Programming", "John Smith", "1234567890", 2020);
        Book b2 = new Book("Data Structures", "Jane Doe", "9876543210", 2019);
        Book b3 = new Book("Web Development", "Mike Johnson", "5555666677", 2021);

        library.addBook(b1);
        System.out.println("Book added: Java Programming by John Smith");
        library.addBook(b2);
        System.out.println("Book added: Data Structures by Jane Doe");
        library.addBook(b3);
        System.out.println("Book added: Web Development by Mike Johnson");

        System.out.println("\nAll books in library:");
        library.displayAllBooks();

        System.out.println("\nBorrowing Java Programming...");
        if (library.borrowBook("1234567890")) {
            System.out.println("Book borrowed successfully!");
        }

        System.out.println("\nTrying to borrow Java Programming again...");
        if (!library.borrowBook("1234567890")) {
            System.out.println("Book is not available for borrowing.");
        }

        System.out.println("\nAvailable books:");
        library.displayAvailableBooks();

        System.out.println("\nReturning Java Programming...");
        if (library.returnBook("1234567890")) {
            System.out.println("Book returned successfully!");
        }


        System.out.println("\nTesting validation...");
        try {
            Book invalidBook = new Book("Invalid Book", "No Author", "12345", 1400);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            Book invalidBook2 = new Book("Another Invalid", "Someone", "123", 2022);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
