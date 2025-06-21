import java.util.Arrays;

class Book {
    int bookId;
    String title;
    String author;

    Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
    }

    public String toString() {
        return "ID: " + bookId + ", Title: " + title + ", Author: " + author;
    }
}

public class LibraryManagementSystem {

    // Linear search by title
    public static Book linearSearch(Book[] books, String searchTitle) {
        for (Book book : books) {
            if (book.title.equalsIgnoreCase(searchTitle)) {
                return book;
            }
        }
        return null;
    }

    // Binary search by title
    public static Book binarySearch(Book[] books, String searchTitle) {
        int low = 0;
        int high = books.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            String midTitle = books[mid].title.toLowerCase();
            String target = searchTitle.toLowerCase();

            if (midTitle.equals(target)) {
                return books[mid];
            } else if (midTitle.compareTo(target) < 0) { //lexicographical comparison
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Book[] books = {
            new Book(1, "Avengers", "Stan Lee"),
            new Book(2, "Harry Potter", "J.K. Rowling"),
            new Book(3, "The Jungle Book", "Rudyard Kipling"),
            new Book(4, "The Ramayana", "Valmiki"),
            new Book(5, "The Mahabharata", "Vyasa")
        };


        System.out.println("Linear Search for 'Harry Potter':");
        Book found1 = linearSearch(books, "Harry Potter");
        if (found1 != null) {
            System.out.println(found1);
        } else {
            System.out.println("Book not found.");
        }

        // Sorting books by title
        Arrays.sort(books, (a, b) -> a.title.compareTo(b.title));

        System.out.println("\nBinary Search for 'The Ramayana':");
        Book found2 = binarySearch(books, "The Ramayana");
        if (found2 != null) {
            System.out.println(found2);
        } else {
            System.out.println("Book not found.");
        }
    }
}
