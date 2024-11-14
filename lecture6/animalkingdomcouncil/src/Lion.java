public class Lion implements Animal {

    @Override
    public void sound() {
        System.out.println("The lion roars!");
    }

    @Override
    public void move() {
        System.out.println("The lion prowls majestically.");
    }

    @Override
    public void sleep() {
        System.out.println("The lion sleeps under a tree.");
    }
}
