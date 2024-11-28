import java.io.Serializable;

public class Example implements Serializable {
    transient int transientInt;
    static int staticInt;
    String name;
    int age;

    public Example(int transientInt, String name, int age, int staticInt) {
        this.transientInt = transientInt;
        this.name = name;
        this.age = age;
        this.staticInt = staticInt;
    }
}