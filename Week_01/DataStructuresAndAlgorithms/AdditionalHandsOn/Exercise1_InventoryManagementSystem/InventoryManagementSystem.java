import java.util.HashMap;

class Product {
    int productId;
    String productName;
    int quantity;
    double price;

    Product(int id, String name, int qty, double price) {
        this.productId = id;
        this.productName = name;
        this.quantity = qty;
        this.price = price;
    }

    public String toString() {
        return productId + " - " + productName + " | Qty: " + quantity + " | Price: " + price;
    }
}

public class InventoryManagementSystem {
    public static void main(String[] args) {
        HashMap<Integer, Product> inventory = new HashMap<>();

    
        Product p1 = new Product(1, "Mouse", 10, 299.0);
        inventory.put(p1.productId, p1);

        Product p2 = new Product(2, "Keyboard", 5, 599.0);
        inventory.put(p2.productId, p2);

        // Initial inventory
        System.out.println("Initial Inventory:");
        for (Product p : inventory.values()) {
            System.out.println(p);
        }

        // Update product with ID 1
        if (inventory.containsKey(1)) {
            Product update = inventory.get(1);
            update.quantity = 25;
            update.price = 279.0;
        }

        //Inventory after update
        System.out.println("\nInventory After Update:");
        for (Product p : inventory.values()) {
            System.out.println(p);
        }
    }
}
