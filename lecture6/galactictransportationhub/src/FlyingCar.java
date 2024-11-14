public class FlyingCar implements Vehicle, GroundTransport, AirTransport {
    private double fuelCapacity;
    private int passengerCapacity;
    private String terrainType;
    private double maxAltitude;

    public FlyingCar(double fuelCapacity, int passengerCapacity, String terrainType, double maxAltitude) {
        this.fuelCapacity = fuelCapacity;
        this.passengerCapacity = passengerCapacity;
        this.terrainType = terrainType;
        this.maxAltitude = maxAltitude;
        System.out.println("A flying car has been created.");
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
        System.out.println("The flying car is driving on " + terrainType + ".");
    }

    @Override
    public String getTerrainType() {
        return terrainType;
    }

    @Override
    public void fly() {
        System.out.println("The flying car is flying at an altitude of " + maxAltitude + " meters.");
    }

    @Override
    public double getMaxAltitude() {
        return maxAltitude;
    }
}