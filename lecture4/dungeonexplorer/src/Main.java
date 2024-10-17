// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static boolean fight(Player player, Player creature){
        if(player.getStrength() > creature.getStrength()){
            System.out.println("Player 1 wins the creature");
            return true;
        }else {
            player.setHealth(player.getHealth() - creature.getStrength());
            if(player.getHealth() <= 0){
                System.out.println("Player 1 is defeated by the creature");
                return false;
            } else {
                System.out.println("Player ran away");
                return true;
            }
        }
    }
    public static void main(String[] args) {
        Player player1 = new Player(55,30);
        Player[] creatures = new Player[5];
        for(Player player: creatures){
            player = new Player();// Press Alt+Enter with your caret at the highlighted text to see how
        }
        boolean passed = true;
        for(Player player: creatures){
            boolean result = fight(player1, player);
            if(!result){
                System.out.println("Game over, player got defeated by the creatures");
                passed = false;
                break;
            }

        }
        if(passed){
            System.out.println("Player 1 wins");
        }
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.

    }
}