public class Fish implements Animal {

    @Override
    public void sound() {
        System.out.println("The fish makes bubbling sounds.");
    }

    @Override
    public void move() {
        System.out.println("The fish swims swiftly in the water.");
    }

    @Override
    public void sleep() {
        System.out.println("The fish rests on the sandy bottom.");
    }
}