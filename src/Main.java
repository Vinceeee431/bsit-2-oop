import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("═══ Food Ordering System ═══\n");

        System.out.println("Creating orders and adding items...");

        ArrayList<Order> orders = new ArrayList<>();


        Order alice = new Order("Alice Johnson");
        alice.addItem("Pizza", 12.99);   // success
        alice.addItem("Burger", 8.75);
        alice.addItem("Fries", 3.00);
        System.out.println("Items added: Burger, Fries");
        orders.add(alice);


        Order bob = new Order("Bob Smith");
        bob.addItem("", 10.00);   // invalid item
        bob.addItem("Salad", 0);  // invalid price
        bob.addItem("Pasta", 10.25);
        bob.addItem("Salad", 7.00);
        bob.addItem("Soup", 7.25);
        System.out.println("Items added: Pasta, Salad, Soup");
        orders.add(bob);


        Order charlie = new Order("Charlie Brown");
        charlie.addItem("Sandwich", 9.50);
        charlie.addItem("Hotdog", 6.00);
        charlie.addItem("Soda", 0);  // invalid price
        System.out.println("Items added: Hotdog, Soda");
        orders.add(charlie);

        System.out.println("\nOrder Results:");
        for (Order o : orders) {
            System.out.println(o);
        }

        System.out.println("\nTotal orders created: " + orders.size());


        Order largest = orders.get(0);
        for (Order o : orders) {
            if (o.getTotal() > largest.getTotal()) {
                largest = o;
            }
        }
        System.out.println("Largest order: " + largest.getCustomerName() +
                " ($" + String.format("%.2f", largest.getTotal()) + ")");
    }
}
