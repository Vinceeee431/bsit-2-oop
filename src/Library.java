
public class Library {
    private Book[] books;
    private int bookCount;


    public Library() {
        books = new Book[10];
        bookCount = 0;
    }


    public boolean addBook(Book book) {
        if (bookCount < books.length) {
            books[bookCount++] = book;
            return true;
        }
        return false;
    }

    public boolean removeBook(String isbn) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getIsbn().equals(isbn)) {
                books[i] = books[bookCount - 1];
                books[bookCount - 1] = null;
                bookCount--;
                return true;
            }
        }
        return false;
    }

    public Book findBook(String isbn) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getIsbn().equals(isbn)) {
                return books[i];
            }
        }
        return null;
    }

    public boolean borrowBook(String isbn) {
        Book book = findBook(isbn);
        if (book != null) {
            return book.borrowBook();
        }
        return false;
    }

    public boolean returnBook(String isbn) {
        Book book = findBook(isbn);
        if (book != null) {
            return book.returnBook();
        }
        return false;
    }

    public void displayAvailableBooks() {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].isAvailable()) {
                books[i].displayBookInfo();
            }
        }
    }

    public void displayAllBooks() {
        for (int i = 0; i < bookCount; i++) {
            books[i].displayBookInfo();
        }
    }

    public int getBookCount() {
        return bookCount;
    }
}
