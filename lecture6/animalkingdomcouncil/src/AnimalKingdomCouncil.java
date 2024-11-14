public class AnimalKingdomCouncil {

    public static void main(String[] args) {
        Animal lion = new Lion();
        Animal bird = new Bird();
        Animal fish = new Fish();

        System.out.println("Welcome to the " + Animal.KINGDOM_NAME + " Council!\n");

        lion.sound();
        lion.move();
        lion.sleep();

        System.out.println();

        bird.sound();
        bird.move();
        bird.sleep();

        System.out.println();

        fish.sound();
        fish.move();
        fish.sleep();

        System.out.println("\nAll animals have shared their unique traits!");
    }
}