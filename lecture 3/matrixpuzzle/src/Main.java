import java.util.Random;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        char[][] arr = new char[3][3];
        Random random_generator = new Random();
        int x;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                x = random_generator.nextInt(101);
                if (x % 2 == 0) {
                    arr[i][j] = 'X';// Press Alt+Enter with your caret at the highlighted text to see how
                } else {
                    arr[i][j] = 'O';
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j]);
            }
            // IntelliJ IDEA suggests fixing it.
            System.out.println();

            // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (arr[i][0] == arr[i][1] && arr[i][1] == arr[i][2]) {
                    System.out.println("The winner is " + arr[i][0]);
                    break;
                }
                if (arr[0][j] == arr[1][j] && arr[1][j] == arr[2][j]) {
                    System.out.println("The winner is " + arr[0][j]);
                    break;
                }
                if (arr[0][0] == arr[1][1] && arr[1][1] == arr[2][2]) {
                    System.out.println("The winner is " + arr[0][0]);
                    break;
                }
                if (arr[0][2] == arr[1][j] && arr[1][j] == arr[0][2]) {
                    System.out.println("The winner is " + arr[0][2]);
                    break;
                }
                System.out.println("the game is draw");
                break;
            }
        }
    }
}


















