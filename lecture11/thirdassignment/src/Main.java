import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String input = " ";
        int weight = 0;
        try{
            while(true){
            System.out.println("Enter input, or END to exit");
            input = bufferedReader.readLine();
            if(input.equalsIgnoreCase("END"))break;
            for (int i = 0; i<input.length(); i++){
                weight +=input.charAt(i);

                }
                System.out.println("Weight is: " + weight);
                System.out.println("Length is: + " + input.length());
        } }catch (Exception e){
            System.out.println(e);
        }
    }

}