import java.util.ArrayList;

class Order {
    private String customerName;
    private ArrayList<Item> items;

    public Order(String customerName) {
        this.customerName = customerName;
        this.items = new ArrayList<>();
    }

    public void addItem(String name, double price) {
        if (name == null || name.trim().isEmpty()) {
            System.out.println("Error: Invalid item: cannot be empty");
            return;
        }
        if (price <= 0) {
            System.out.println("Error: Invalid price: must be greater than 0");
            return;
        }

        items.add(new Item(name, price));


        if (name.equals("Pizza")) {
            System.out.println("Item 'Pizza' added successfully");
        }
    }

    public String getCustomerName() {
        return customerName;
    }

    public int getItemCount() {
        return items.size();
    }

    public double getTotal() {
        double total = 0;
        for (Item i : items) {
            total += i.getPrice();
        }
        return total;
    }

    public String getSize() {
        int count = getItemCount();
        if (count <= 3) return "Small";
        else if (count <= 5) return "Medium";
        else return "Large";
    }

    @Override
    public String toString() {
        return "Order for " + customerName + ": " + getItemCount() +
                " items, Total: $" + String.format("%.2f", getTotal()) +
                ", Size: " + getSize();
    }
}

class Item {
    private String name;
    private double price;

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
