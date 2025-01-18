package dogs;

public abstract class Dog {
    protected String name;
    protected String breed;
    protected int age;

    public Dog() {
        this.name = "";
        this.breed = "";
        this.age = 0;
    }

    public Dog(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public abstract void printDetails();

    public int getAge() {
        return age;
    }
}