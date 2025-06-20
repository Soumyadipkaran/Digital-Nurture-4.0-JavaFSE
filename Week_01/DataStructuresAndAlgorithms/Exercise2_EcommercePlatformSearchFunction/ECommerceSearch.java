import java.util.Arrays;

class Product {
    int productId;
    String productName;
    String category;

    public Product(int productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }

    // print product info
    public String toString() {
        return "ID: " + productId + ", Name: " + productName + ", Category: " + category;
    }
}

public class ECommerceSearch {

    // Linear Search
    public static Product linearSearch(Product[] products, int targetId) {
        for (Product product : products) {
            if (product.productId == targetId) {
                return product;
            }
        }
        return null;
    }

    // Binary Search
    public static Product binarySearch(Product[] products, int targetId) {
        int low = 0;
        int high = products.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int currentId = products[mid].productId;

            if (currentId == targetId) {
                return products[mid];
            } else if (currentId < targetId) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return null;
    }

    public static void main(String[] args) {

        Product[] products = {
            new Product(105, "Laptop", "Electronics"),
            new Product(101, "Shoes", "Fashion"),
            new Product(110, "Smartphone", "Electronics"),
            new Product(103, "Watch", "Accessories"),
            new Product(102, "Headphones", "Electronics"),
            new Product(109, "T-Shirt", "Fashion"),
            new Product(107, "Backpack", "Bags")
        };

        // Linear Search before sorting
        System.out.println("Linear Search Result:");
        Product result1 = linearSearch(products, 107);
        if (result1 != null) {
            System.out.println(result1);
        } else {
            System.out.println("Product not found");
        }

        // Sort by productId
        Arrays.sort(products, (a, b) -> Integer.compare(a.productId, b.productId));

        // Binary Search after sorting
        System.out.println("\nBinary Search Result:");
        Product result2 = binarySearch(products, 107);
        if (result2 != null) {
            System.out.println(result2);
        } else {
            System.out.println("Product not found");
        }
    }
}
