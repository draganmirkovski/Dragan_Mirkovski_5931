import java.util.Random;

public class Player {
    private int health;
    private int strength;

    public Player() {
        Random random = new Random();
        this.health = random.nextInt(50);
        this.strength = random.nextInt(100);
    }

    public Player(int health, int strength) {
        this.health = health;
        this.strength = strength;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

}
