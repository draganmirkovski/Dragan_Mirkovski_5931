import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        List<SFBook> sfBooks = new ArrayList<>();
        List<AdventureBook> adventureBooks = new ArrayList<>();

        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        int choice = 0;
        while (true) {
            System.out.println("Enter some choice: ");
            System.out.println("1 - Input SF Book");
            System.out.println("2 - Input Adventure Book");
            System.out.println("3 - List all books");
            System.out.println("4 - List the oldest book");
            System.out.println("5 - List the most expensive book");
            System.out.println("6 - Average price of all books");
            System.out.println("0 - Exit");

            try {
                choice = Integer.parseInt(bufferedReader.readLine());

                switch (choice) {
                    case 1:
                        System.out.println("Enter SF Book title: ");
                        String title = bufferedReader.readLine();

                        System.out.println("Enter SF Book author: ");
                        String author = bufferedReader.readLine();

                        System.out.println("Enter SF Book price: ");
                        double price = Double.parseDouble(bufferedReader.readLine());

                        System.out.println("Enter SF Book publish year: ");
                        int publishYear = Integer.parseInt(bufferedReader.readLine());

                        System.out.println("Enter SF Book language: ");
                        String language = bufferedReader.readLine();

                        System.out.println("Is it a bestseller? ");
                        boolean bestseller = Boolean.parseBoolean(bufferedReader.readLine());

                        SFBook sfBook = new SFBook(title, author, price, language, publishYear, bestseller);
                        sfBooks.add(sfBook);
                        books.add(sfBook);
                        break;
                    case 2:
                        System.out.println("Enter Adventure Book title: ");
                        title = bufferedReader.readLine();

                        System.out.println("Enter Adventure Book author: ");
                        author = bufferedReader.readLine();

                        System.out.println("Enter Adventure Book price: ");
                        price = Double.parseDouble(bufferedReader.readLine());

                        System.out.println("Enter Adventure Book publish year: ");
                        publishYear = Integer.parseInt(bufferedReader.readLine());

                        System.out.println("Enter Adventure Book language: ");
                        language = bufferedReader.readLine();

                        System.out.println("Is it a children's book? ");
                        boolean childrenBook = Boolean.parseBoolean(bufferedReader.readLine());

                        AdventureBook adventureBook = new AdventureBook(title, author, price, language, publishYear, childrenBook);
                        adventureBooks.add(adventureBook);
                        books.add(adventureBook);
                        break;
                    case 3:
                        System.out.println("Listing all books: ");
                        books.forEach(Book::printAttributes);
                        break;
                    case 4:
                        books.stream()
                                .min(Comparator.comparingInt(Book::getPublishYear))
                                .ifPresent(book -> System.out.println("Oldest Book: " + book.getTitle() + ", Published in " + book.getPublishYear()));
                        break;
                    case 5:
                        books.stream()
                                .max(Comparator.comparingDouble(Book::getPrice))
                                .ifPresent(book -> System.out.println("Most Expensive Book: " + book.getTitle() + ", Price: " + book.getPrice()));
                        break;
                    case 6:
                        double averagePrice = books.stream()
                                .mapToDouble(Book::getPrice)
                                .average()
                                .orElse(0.0);
                        System.out.println("Average price of all books: " + averagePrice);
                        break;
                    case 0:
                        System.out.println("Exiting...");
                        return;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                        break;
                }
            } catch (IOException | NumberFormatException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}