
public class BookDemo{
    public static void main(String[] args){
        Book[] books = new Book[3];

        books[0] = new EBook("Java Programming", "John Doe", 1.5);
        books[1] = new PrintedBook("Effective Java", "Joshua Bloch", 416);
        books[2] = new EBook("Design Patterns", "Erich Gamma", 2.0);

        for (Book book : books){
            book.displayInfo();
            System.out.println();
        }
    }
}
