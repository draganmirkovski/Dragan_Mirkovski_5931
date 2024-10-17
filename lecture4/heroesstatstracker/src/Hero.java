public class Hero {
    private int health;
    private int strength;

    public Hero(int health, int strength){
        this.health = health;
        this.strength = strength;
    }
    public void displayStats(){
        System.out.println("Hero stats: ");
        System.out.println("Health: " + health);
        System.out.println("Strength: " + strength);
    }
    public void takeDamage(int damage){
        health -= damage;
        if(health < 0){
            health = 0;
        }
        System.out.println("Hero took" + damage + "damage.");
    }
    public void powerUp(int increaseStrength){
        strength += increaseStrength;
        System.out.println("Increased strength: " + strength);
    }
    public static void main(String[] args){
        Hero hero = new Hero(100, 50);
        hero.displayStats();
        hero.takeDamage(200);
        hero.powerUp(10);
        hero.displayStats();
    }
}
