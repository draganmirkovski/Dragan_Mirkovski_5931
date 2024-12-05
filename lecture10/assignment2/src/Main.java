import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<String> initialList = Arrays.asList("a", "b", "c");
        List<String> resultList = initialList.stream().map(str -> str.toUpperCase()).toList();
        resultList.stream().forEach(str -> System.out.println(str));
    }
}