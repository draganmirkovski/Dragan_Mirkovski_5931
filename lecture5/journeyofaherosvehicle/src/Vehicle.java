public class Vehicle {
    private String model;
    private int noPassangers;
    private double gasTankCapacity;
    private double fuelConsumption;

    public Vehicle(String model, int noPassangers, double gasTankCapacity, double fuelConsumption) {
        this.model = model;
        this.noPassangers = noPassangers;
        this.gasTankCapacity = gasTankCapacity;
        this.fuelConsumption = fuelConsumption;
    }
    public double calculateDistance(){
        return gasTankCapacity / fuelConsumption;
    }
    public void compareRange(Vehicle vehicle2){
        if(this.calculateDistance() > vehicle2.calculateDistance()){
            System.out.println("Vehicle" + model + "has a greater range" + vehicle2.model);
        } else if (this.calculateDistance() < vehicle2.calculateDistance()){
            System.out.println("Vehicle" + vehicle2.model + "has a greater range" + model);
        } else {
            System.out.println("Vehicles have the same range.");
        }

    }
}
