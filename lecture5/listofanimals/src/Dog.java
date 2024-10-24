public class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }
    @Override
    public void onomatopeia(){
        System.out.println("Woof");
    }
}
