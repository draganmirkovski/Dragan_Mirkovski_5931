public class Bird implements Animal {

    @Override
    public void sound() {
        System.out.println("The bird chirps melodiously!");
    }

    @Override
    public void move() {
        System.out.println("The bird flutters gracefully through the air.");
    }

    @Override
    public void sleep() {
        System.out.println("The bird nests in a cozy tree branch.");
    }
}