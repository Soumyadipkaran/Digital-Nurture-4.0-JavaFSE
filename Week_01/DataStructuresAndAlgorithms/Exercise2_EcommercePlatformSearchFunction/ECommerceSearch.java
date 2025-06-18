import java.util.Arrays;
import java.util.Comparator;

// Product class to store product details
class Product {
    int productId;
    String productName;
    String category;

    // Constructor to set values
    public Product(int productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }

    // Print product info
    public String toString() {
        return "ID: " + productId + ", Name: " + productName + ", Category: " + category;
    }
}

public class ECommerceSearch {

    // Linear Search check one by one
    public static Product linearSearch(Product[] products, String targetName) {
        for (Product product : products) {
            // If names match, return the product
            if (product.productName.equalsIgnoreCase(targetName)) {
                return product;
            }
        }
        return null; // not found
    }

    // Binary Search works on sorted array
    public static Product binarySearch(Product[] products, String targetName) {
        int low = 0;
        int high = products.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int compare = products[mid].productName.compareToIgnoreCase(targetName);

            if (compare == 0) {
                return products[mid]; // found
            } else if (compare < 0) {
                low = mid + 1; // search right
            } else {
                high = mid - 1; // search left
            }
        }
        return null; // not found
    }

    public static void main(String[] args) {
        // Added more products to the list
        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(102, "Shoes", "Fashion"),
            new Product(103, "Smartphone", "Electronics"),
            new Product(104, "Watch", "Accessories"),
            new Product(105, "Headphones", "Electronics"),
            new Product(106, "T-Shirt", "Fashion"),
            new Product(107, "Backpack", "Bags")
        };

        // Test Linear Search
        System.out.println("Linear Search Result:");
        Product result1 = linearSearch(products, "Backpack");
        if (result1 != null) {
            System.out.println(result1);
        } else {
            System.out.println("Product not found");
        }

        // Sort before Binary Search
        Arrays.sort(products, Comparator.comparing(p -> p.productName.toLowerCase()));

        // Test Binary Search
        System.out.println("\nBinary Search Result:");
        Product result2 = binarySearch(products, "Backpack");
        if (result2 != null) {
            System.out.println(result2);
        } else {
            System.out.println("Product not found");
        }
    }
}
