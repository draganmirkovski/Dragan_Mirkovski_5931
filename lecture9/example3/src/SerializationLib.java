import java.io.*;

public class SerializationLib {
    public static void doSerialize(Object obj, String filename) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(filename);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(obj);
        objectOutputStream.close();
        fileOutputStream.close();
    }

    public static Object doDeserialize(String filename) throws IOException, ClassNotFoundException {
        SerializationDef serializationDef = null;

        FileInputStream fileInputStream = new FileInputStream(filename);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        serializationDef = (SerializationDef) objectInputStream.readObject();
        objectInputStream.close();
        fileInputStream.close();

        return serializationDef;
    }
}