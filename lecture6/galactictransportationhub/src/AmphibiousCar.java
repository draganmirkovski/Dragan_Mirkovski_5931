public class AmphibiousCar implements Vehicle, GroundTransport {
    private double fuelCapacity;
    private int passengerCapacity;
    private String terrainType;

    public AmphibiousCar(double fuelCapacity, int passengerCapacity, String terrainType) {
        this.fuelCapacity = fuelCapacity;
        this.passengerCapacity = passengerCapacity;
        this.terrainType = terrainType;
        System.out.println("An amphibious car has been created.");
    }

    @Override
    public double getFuelCapacity() {
        return fuelCapacity;
    }

    @Override
    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    @Override
    public void drive() {
        System.out.println("The amphibious car is driving on " + terrainType + ".");
    }

    @Override
    public String getTerrainType() {
        return terrainType;
    }
}