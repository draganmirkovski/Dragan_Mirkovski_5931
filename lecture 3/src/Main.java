import java.util.Random;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int i = 0;// Press Alt+Enter with your caret at the highlighted text to see how
        while(i < 10){
            int r = random.nextInt(500) + 1;
            System.out.printf("br" + r);
            i++;
        }


        int r;
        do{
            r = random.nextInt(500) + 1;
        }while(r > 300);


            int counter = 0;
            for(int j = 0;j <= 20;i++){
                int a = random.nextInt(500)+1;
                System.out.printf(a + " ");
                if(a % 2 == 0){
                    counter++;
                }
            }
            System.out.println("There were" + counter + "even numbers.");

//            while(true){
//                int b = random.nextInt(500)+1;
//                if(b % 7 == 0){
//                    System.out.println("The number" + b + "divisible by 7");
//                    break;
//                }
//           }
        }

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.


    }
