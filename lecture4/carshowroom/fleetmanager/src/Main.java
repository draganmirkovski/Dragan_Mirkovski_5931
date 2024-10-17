// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {


        Car[] cars = new Car[5];
        cars[0] = new Car("Tesla",5,"Electric", "White");
        cars[1] = new Car();
        cars[2] = new Car("Audi",4, "Petrol", "Red");
        cars[3] = new Car();
        cars[4] = new Car("Seat", 5, "Petrol","White");


        for(Car car: cars){
            car.displayCar();// Press Shift+F10 or click the green arrow button in the gutter to run the code.
        }
        Car maxSeatsCar = cars[0];
        for(int i = 1; i < cars.length; i++){
            if(maxSeatsCar.getNoSeats() < cars[i].getNoSeats()){
                maxSeatsCar = cars[i];
            }
        }
        System.out.println("Car with max number of seats: ");
        maxSeatsCar.displayCar();
    }
}