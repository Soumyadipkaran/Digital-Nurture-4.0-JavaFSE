class Order {
    int orderId;
    String customerName;
    double totalPrice;

    Order(int id, String name, double price) {
        this.orderId = id;
        this.customerName = name;
        this.totalPrice = price;
    }
}

public class SortingCustomerOrders {

    // Bubble Sort by totalPrice
    public static void bubbleSort(Order[] orders) {
        int n = orders.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (orders[j].totalPrice > orders[j + 1].totalPrice) {
                    Order temp = orders[j];
                    orders[j] = orders[j + 1];
                    orders[j + 1] = temp;
                }
            }
        }
    }

    // Quick Sort
    public static void quickSort(Order[] arr, int low, int high) {
        if (low >= high) return;

        int pivotIndex = partition(arr, low, high);
        quickSort(arr, low, pivotIndex - 1);
        quickSort(arr, pivotIndex + 1, high);
    }

    // partition by totalPrice
    public static int partition(Order[] arr, int low, int high) {
        Order pivot = arr[low];
        int i = low + 1;
        int j = high;

        while (i <= j) {
            while (i <= high && arr[i].totalPrice <= pivot.totalPrice) i++;
            while (j >= low && arr[j].totalPrice > pivot.totalPrice) j--;

            if (i < j) {
                Order temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        Order temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;

        return j;
    }

    public static void display(Order[] orders) {
        for (Order o : orders) {
            System.out.println("Order ID: " + o.orderId + ", Customer: " + o.customerName +", Total Price: " + o.totalPrice);
        }
    }


    public static void main(String[] args) {
        Order[] orders = {
            new Order(101, "Soumyadip", 1460.50),
            new Order(102, "Karan", 269.99),
            new Order(103, "Sdk", 1050.75),
            new Order(104, "Mk", 4569.00)
        };

        Order[] bubbleSorted = orders.clone(); //keep original orders intact
        System.out.println("Using Bubble Sort: ");
        bubbleSort(bubbleSorted);
        display(bubbleSorted);

        Order[] quickSorted = orders.clone(); //keep original orders intact
        System.out.println("Using Quick Sort: ");
        quickSort(quickSorted, 0, quickSorted.length - 1);
        display(quickSorted);
    }
}
