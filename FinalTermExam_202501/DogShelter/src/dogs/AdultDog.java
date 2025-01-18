package dogs;

public class AdultDog extends Dog {
    private String size;
    private boolean isVaccinated;

    public AdultDog() {
        super();
        this.size = "";
        this.isVaccinated = false;
    }

    public AdultDog(String name, String breed, int age, String size, boolean isVaccinated) {
        super(name, breed, age);
        this.size = size;
        this.isVaccinated = isVaccinated;
    }

    @Override
    public void printDetails() {
        System.out.println("Adult Dog Details:");
        System.out.println("Name: " + name);
        System.out.println("Breed: " + breed);
        System.out.println("Age: " + age);
        System.out.println("Size: " + size);
        System.out.println("Vaccinated: " + isVaccinated);
    }
}