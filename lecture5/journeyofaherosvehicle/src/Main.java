// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle("Toyora Corolla", 5, 50.0, 7.5);
        Vehicle vehicle2 = new Vehicle("Bugatti Veyron", 4, 70.0, 12.5);
        System.out.println(vehicle1.calculateDistance());
        System.out.println(vehicle2.calculateDistance());
        vehicle1.compareRange(vehicle2);
        vehicle2.compareRange(vehicle1);
        // IntelliJ IDEA suggests fixing it.

    }
}