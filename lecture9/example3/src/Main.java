import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        SerializationDef serializationDef = new SerializationDef();
        serializationDef.setFeature("Feature");
        serializationDef.setProduct("Product");
        serializationDef.setFeatureCount(5);

        try {
            SerializationLib.doSerialize(serializationDef, "test.txt");
            serializationDef = (SerializationDef) SerializationLib.doDeserialize("test.txt");
            System.out.println(serializationDef);
        } catch (IOException e) {
            System.out.println(e);
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        }
    }
}