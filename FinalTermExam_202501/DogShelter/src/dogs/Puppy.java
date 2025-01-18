package dogs;

public class Puppy extends Dog {
    private String trainingLevel;
    private boolean isHouseTrained;

    public Puppy() {
        super();
        this.trainingLevel = "";
        this.isHouseTrained = false;
    }

    public Puppy(String name, String breed, int age, String trainingLevel, boolean isHouseTrained) {
        super(name, breed, age);
        this.trainingLevel = trainingLevel;
        this.isHouseTrained = isHouseTrained;
    }

    @Override
    public void printDetails() {
        System.out.println("Puppy Details:");
        System.out.println("Name: " + name);
        System.out.println("Breed: " + breed);
        System.out.println("Age: " + age);
        System.out.println("Training Level: " + trainingLevel);
        System.out.println("House Trained: " + isHouseTrained);
    }
}