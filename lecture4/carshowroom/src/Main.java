// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {
        Car car = new Car("Tesla", 5,"Electric","White");
        Car car2 = new Car();// Press Alt+Enter with your caret at the highlighted text to see how

        car2.setNoSeats(2);
        car2.setType("Type: ");
        car2.setColor("Blue");

        car.displayCar();
        car2.displayCar();// IntelliJ IDEA suggests fixing it.
    }
}