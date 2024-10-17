// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       MagicBox magicBox = new MagicBox();
       magicBox.display();
       int numEven = magicBox.findEvenNum();
        System.out.println("Number of even numbers is: " + numEven);
        double averageValue = magicBox.calculateAverage();
        System.out.println("Average of numbers is: " + averageValue);

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.

    }
}