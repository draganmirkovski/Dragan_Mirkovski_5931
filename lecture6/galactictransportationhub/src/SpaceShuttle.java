public class SpaceShuttle implements Vehicle, AirTransport, SpaceTransport {
    private double fuelCapacity;
    private int passengerCapacity;
    private double maxAltitude;
    private double orbitRange;

    public SpaceShuttle(double fuelCapacity, int passengerCapacity, double maxAltitude, double orbitRange) {
        this.fuelCapacity = fuelCapacity;
        this.passengerCapacity = passengerCapacity;
        this.maxAltitude = maxAltitude;
        this.orbitRange = orbitRange;
        System.out.println("A space shuttle has been created.");
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
    public void fly() {
        System.out.println("The space shuttle is flying at an altitude of " + maxAltitude + " meters.");
    }

    @Override
    public double getMaxAltitude() {
        return maxAltitude;
    }

    @Override
    public void launch() {
        System.out.println("The space shuttle is launching into space!");
    }

    @Override
    public double getOrbitRange() {
        return orbitRange;
    }
}