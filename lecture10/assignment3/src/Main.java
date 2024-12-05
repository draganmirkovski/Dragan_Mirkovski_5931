import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {
    public static Student createStudent(String name, int indexNo, int age) {
        return new Student(name, indexNo, age);
    }

    public static void printData(Student s) {
        System.out.println("Name: " + s.getName());
        System.out.println("Index number: " + s.getIndexNo());
        System.out.println("Age: " + s.getAge());
    }

    public static void main(String[] args) {
        List<String> namesList = Arrays.asList("Anna", "Barbara", "Chad", "Deon", "Elon");
        Random random = new Random();
        namesList
                .stream()
                .map(name -> createStudent(name, (random.nextInt(10000 - 1) + 1), (random.nextInt(12) + 18)))
                .forEach(student -> printData(student));
}