import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        Path filePath = Paths.get("computerinterface/lesson1/123.bin");
        String textToAppend = "Java is fun :)";
        byte[] dataTOwrite = {12,3,4,5};
        try{
            Files.write(filePath,textToAppend.getBytes());
            //  byte [] dataRead = Files.readAllBytes(filePath);
            // for (byte b: dataRead){
            //    System.out.print(b + " ");
            // }
        }catch(IOException e){
            System.err.println("There was an error!");
        }
    }
}