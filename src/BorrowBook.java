public class BorrowBook {
    public static void main(String[] args) {
        Book book1 = new Book("To Kill a Mockingbird", "Harper Lee", 281);
        Book book2 = new Book("1984", "George Orwell", 328);
        Book book3 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 180);

        book1.displayInfo();
        book2.displayInfo();
        book3.displayInfo();

        book1.borrowBook();
        book1.displayInfo();

        book1.returnBook();
        book1.displayInfo();
    }
}

class Book {
    String title;
    String author;
    int pages;
    boolean isAvailable;

    Book(String t, String a, int p) {
        title = t;
        author = a;
        pages = p;
        isAvailable = true;
        System.out.println("A new book '" + title + "' by " + author + " has been added to the library!");
    }

    void displayInfo() {
        System.out.println("\nTitle: " + title);
        System.out.println("Author: " + author);
        System.out.println("Pages: " + pages);
        System.out.println("Available: " + isAvailable);
    }

    void borrowBook() {
        isAvailable = false;
        System.out.println("\nYou borrowed '" + title + "'.");
    }

    void returnBook() {
        isAvailable = true;
        System.out.println("\nYou returned '" + title + "'.");
    }
}
