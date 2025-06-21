interface Image {
    void display();
}

class RealImage implements Image {
    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromServer();
    }

    private void loadFromServer() {
        System.out.println("Loading image from remote server: " + fileName);
    }

    public void display() {
        System.out.println("Displaying image: " + fileName);
    }
}

// Proxy class
class ProxyImage implements Image {
    private String fileName;
    private RealImage realImage;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    public void display() {
        if (realImage == null) {
            realImage = new RealImage(fileName); // Lazy load only once
        }
        realImage.display(); // Display from cache
    }
}

public class ProxyPatternExample {
    public static void main(String[] args) {
        Image img1 = new ProxyImage("photo1.jpg");

        System.out.println("First call: ");
        img1.display();  // Loads and displays

        System.out.println("\nSecond call: ");
        img1.display();  // Only displays from cache
    }
}
