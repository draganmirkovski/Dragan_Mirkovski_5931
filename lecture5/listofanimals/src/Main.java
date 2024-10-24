import jdk.jfr.FlightRecorderPermission;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[5];
        animals[0] = new Dog("Jerry");
        animals[1] = new Lion("Toby");
        animals[2] = new Frog("Tommy");
        animals[3] = new SaraMountainDog("Sara");
        animals[4] = new Animal("Any animal");
        for(Animal animal : animals){
            animal.onomatopeia();
            if(animal instanceof SaraMountainDog){
                ((SaraMountainDog) animal).traits();
            }
        }
        // IntelliJ IDEA suggests fixing it.

    }
}