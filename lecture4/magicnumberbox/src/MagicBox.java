import java.util.Random;

public class MagicBox {
    private int[] numbers = new int[10];

    public MagicBox() {
        Random random = new Random();
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = random.nextInt(100);
        }
    }
    public int findEvenNum(){
        int countEven = 0;
        for(int i = 0; i< numbers.length; i++){
            if(numbers[i] % 2 ==0){
                countEven++;
            }
        }
        return countEven;
    }
    public double calculateAverage(){
        int sum = 0;
        for(int i = 0; i< numbers.length; i++){
            sum += numbers[i];
        }
        return (double) sum/numbers.length;
    }
    public void display(){
        for(int num: numbers){
            System.out.print(num + " ");
        }
    }
}
