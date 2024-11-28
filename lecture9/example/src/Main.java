import java.io.*;

public class Main {
    public static void printData(Example e) {
        System.out.println("Name: " + e.name);
        System.out.println("Age: " + e.age);
        System.out.println("Transient integer: " + e.transientInt);
        System.out.println("Static int: " + e.staticInt);
    }
    public static void main(String[] args) {
        Example example = new Example(1000, "Test", 21, 10);
        String filename = "test.txt";
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(filename);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeObject(example);
            System.out.println("Object serialized, before deserialization: ");
            printData(example);

            fileOutputStream.close();
            objectOutputStream.close();

            FileInputStream fileInputStream = new FileInputStream(filename);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            example = (Example) objectInputStream.readObject();
            System.out.println("Object deserialized: ");
            printData(example);
        } catch (IOException e) {
            System.out.println(e);
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        }
    }
}