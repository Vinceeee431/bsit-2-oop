import java.util.ArrayList;

public class LibraryManager {
    private ArrayList<Borrowable> items;

    public LibraryManager() {
        items = new ArrayList<>();
    }

    public void addItem(Borrowable item) {
        items.add(item);
    }

    public void displayAllItems() {
        for (Borrowable item : items) {
            if (item instanceof LibraryItem) {
                System.out.println(((LibraryItem) item).getItemType() + ": " + ((LibraryItem) item).title + " (" + item.getBorrowingStatus() + ")");
            }
        }
    }

    public void borrowItem(String itemId, String borrowerName) {
        for (Borrowable item : items) {
            if (item instanceof LibraryItem) {
                if (((LibraryItem) item).itemId.equals(itemId) && item.isAvailable()) {
                    item.borrowItem(borrowerName);
                    System.out.println(borrowerName + " borrowed: " + ((LibraryItem) item).title);
                    return;
                }
            }
        }
    }

    public void returnItem(String itemId) {
        for (Borrowable item : items) {
            if (item instanceof LibraryItem) {
                if (((LibraryItem) item).itemId.equals(itemId) && !item.isAvailable()) {
                    item.returnItem();
                    System.out.println(((LibraryItem) item).title + " has been returned.");
                    return;
                }
            }
        }
    }

    public void displayAvailableItems() {
        for (Borrowable item : items) {
            if (item.isAvailable()) {
                System.out.println(((LibraryItem) item).getItemType() + ": " + ((LibraryItem) item).title + " (" + item.getBorrowingStatus() + ")");
            }
        }
    }

    public void calculateTotalLateFees(int daysLate) {
        for (Borrowable item : items) {
            if (!item.isAvailable() && item instanceof LibraryItem) {
                System.out.println(((LibraryItem) item).title + " - " + daysLate + " days late: $" + ((LibraryItem) item).calculateLateFee(daysLate));
            }
        }
    }
}
