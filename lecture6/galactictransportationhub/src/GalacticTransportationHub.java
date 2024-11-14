public class GalacticTransportationHub {

    public static void main(String[] args) {
        AmphibiousCar amphibiousCar = new AmphibiousCar(50.0, 4, "water and land");
        System.out.println("Fuel Capacity: " + amphibiousCar.getFuelCapacity() + " liters");
        System.out.println("Passenger Capacity: " + amphibiousCar.getPassengerCapacity());
        amphibiousCar.drive();

        System.out.println();

        FlyingCar flyingCar = new FlyingCar(70.0, 2, "road", 3000);
        System.out.println("Fuel Capacity: " + flyingCar.getFuelCapacity() + " liters");
        System.out.println("Passenger Capacity: " + flyingCar.getPassengerCapacity());
        flyingCar.drive();
        flyingCar.fly();

        System.out.println();

        SpaceShuttle spaceShuttle = new SpaceShuttle(2000.0, 6, 10000, 500000);
        System.out.println("Fuel Capacity: " + spaceShuttle.getFuelCapacity() + " liters");
        System.out.println("Passenger Capacity: " + spaceShuttle.getPassengerCapacity());
        spaceShuttle.fly();
        spaceShuttle.launch();

        System.out.println("\nAll vehicles have been created and their capabilities displayed!");
    }
}