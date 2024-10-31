import java.util.Scanner;
import java.util.Arrays;

class Book {
    private String title;
    private String author;
    private double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}

class Library {
    private Book[] books;
    private int size;

    public Library(int capacity) {
        books = new Book[capacity];
        size = 0;
    }

    public void addBook(Book book) {
        if (size < books.length) {
            books[size++] = book;
        } else {
            System.out.println("Library is full. Cannot add more books.");
        }
    }

    public void displayAllBooks() {
        for (int i = 0; i < size; i++) {
            System.out.println(books[i]);
        }
    }

    public void findBooksByAuthor(String author) {
        for (int i = 0; i < size; i++) {
            if (books[i].getAuthor().equalsIgnoreCase(author)) {
                System.out.println(books[i]);
            }
        }
    }

    public void sortBooksByPrice() {
        Arrays.sort(books, 0, size, (b1, b2) -> Double.compare(b1.getPrice(), b2.getPrice()));
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library(10);

        // Prompt the user to enter details for three books
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter details for book " + (i + 1) + ":");
            System.out.print("Title: ");
            String title = scanner.nextLine();
            System.out.print("Author: ");
            String author = scanner.nextLine();
            System.out.print("Price: ");
            double price = scanner.nextDouble();
            scanner.nextLine(); // Consume the newline
            library.addBook(new Book(title, author, price));
        }

        // Display all entered book details
        System.out.println("All books in the library:");
        library.displayAllBooks();

        // Allow the user to enter an author’s name to search for matching books
        System.out.print("Enter author name to search: ");
        String searchAuthor = scanner.nextLine();
        System.out.println("Books by " + searchAuthor + ":");
        library.findBooksByAuthor(searchAuthor);

        // Display books sorted by price before and after calling sortBooksByPrice()
        System.out.println("Books before sorting:");
        library.displayAllBooks();
        library.sortBooksByPrice();
        System.out.println("Books after sorting by price:");
        library.displayAllBooks();
    }
}