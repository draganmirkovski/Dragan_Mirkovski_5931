import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        try {
            Test test = new Test();

            Class classObj = test.getClass();
            System.out.println("Name of class: " + classObj.getName());

            Constructor constructor = classObj.getConstructor();
            System.out.println("Constructor name: " + constructor.getName());
            Method[] methods = classObj.getMethods();
            for (Method method : methods) {
                System.out.println("Method name: " + method.getName());
            }

            Method methodCall1 = classObj.getDeclaredMethod("method1");
            methodCall1.invoke(test);

            Method methodCall2 = classObj.getDeclaredMethod("method2", int.class);
            methodCall2.invoke(test, 19);


            Method methodCall3 = classObj.getDeclaredMethod("method3");
            methodCall3.setAccessible(true);
            methodCall1.invoke(test);

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}