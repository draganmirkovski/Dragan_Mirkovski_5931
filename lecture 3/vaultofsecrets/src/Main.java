import java.util.Random;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int[] arr = new int[15];
        Random random = new Random();
        int counter = 0;
        for(int i = 0; i < 15; i++){
            int r = random.nextInt(101);
            arr[i] = r;
            if(arr[i] % 3 == 0){
                counter ++;
            }

        }

        // IntelliJ IDEA suggests fixing it.
        System.out.printf(" There are " + counter + " numbers divisible by 3 ");
        int[] arrB = new int[15];
        for(int i = 0; i<15; i++){
            arrB[i]=100-arr[i];
        }
        for(int i=0;i<15;i++){
            System.out.println(arr[i]+ " ");
        }
        System.out.println();
        for(int i=0;i<15;i++){
            System.out.printf(arrB[i]+" ");
        }
        System.out.println("Array A ");
        for (int element : arr) {
            System.out.println(element + " ");
        }
        // Press Shift+F10 or click the green arrow button in the gutter to run the code.

    }
}