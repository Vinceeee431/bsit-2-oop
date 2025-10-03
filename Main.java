public class Main {
    public static void main(String[] args) {
        System.out.println("═══ LIBRARY MANAGEMENT SYSTEM TEST ═══");

        LibraryManager manager = new LibraryManager();

        System.out.println("\n═══ Adding Items to Library ═══");
        Book book1 = new Book("B1", "Java Programming", "James Gosling", "12345", 500, "Programming");
        Magazine mag1 = new Magazine("M1", "Tech Today", "Editor Smith", 101, "October", true);
        DVD dvd1 = new DVD("D1", "The Matrix", "Wachowski Sisters", 136, "R", "Sci-Fi");
        manager.addItem(book1);
        manager.addItem(mag1);
        manager.addItem(dvd1);
        System.out.println("Added: Book - " + book1.title + " by " + book1.author);
        System.out.println("Added: Magazine - " + mag1.title + " by " + mag1.author);
        System.out.println("Added: DVD - " + dvd1.title + " by " + dvd1.author);

        System.out.println("\n═══ Displaying All Items ═══");
        manager.displayAllItems();

        System.out.println("\n═══ Testing Borrowing ═══");
        manager.borrowItem("B1", "Student John");
        manager.borrowItem("D1", "Faculty Dr. Smith");

        System.out.println("\n═══ Displaying Available Items ═══");
        manager.displayAvailableItems();

        System.out.println("\n═══ Testing Late Fees ═══");
        System.out.println("Java Programming - 5 days late: $" + book1.calculateLateFee(5));
        System.out.println("The Matrix - 3 days late: $" + dvd1.calculateLateFee(3));

        System.out.println("\n═══ Testing User Information ═══");
        Student student = new Student("S1", "John Smith", "john@email.com", "ST123", "Computer Science");
        Faculty faculty = new Faculty("F1", "Dr. Smith", "smith@email.com", "Engineering", "Professor");
        student.addBorrowedItem(book1);
        faculty.addBorrowedItem(dvd1);
        System.out.println("Student: " + student.getName() + " (" + student.getMajor() + ") - " + student.getBorrowedItemsCount() + " items borrowed");
        System.out.println("Faculty: " + faculty.getName() + " (" + faculty.getDepartment() + ") - " + faculty.getBorrowedItemsCount() + " items borrowed");
    }
}
