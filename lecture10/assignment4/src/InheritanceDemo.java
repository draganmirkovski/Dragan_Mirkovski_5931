import java.io.*;

public class InheritanceDemo {
    public static void main(String[] args) {
        ChildClass childClass = new ChildClass();
        childClass.setProduct("Product");
        childClass.setProductID(123);
        childClass.setBrand("Brand");

        String filename = "testChild.txt";
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(filename);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(childClass);

            FileInputStream fileInputStream = new FileInputStream(filename);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            objectInputStream.readObject();
            System.out.println(childClass);
        } catch (IOException e) {
            System.out.println(e);
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        }
    }
}