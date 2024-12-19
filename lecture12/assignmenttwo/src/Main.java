import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Main {
    public static Student createStudent(String fullName, String yearOfStudy, double id) {
        return new Student(fullName, yearOfStudy, id);
    }

    public static void print(Student student) {
        System.out.println("Student info: ");
        System.out.println("Full name: " + student.getFullName());
        System.out.println("Year of study: " + student.getYearOfStudy());
        System.out.println("ID: " + student.getId());
    }

    public static void main(String[] args) {
        Random random = new Random();
        List<String> names = Arrays.asList("Name1", "Name2", "Name3", "Name4", "Name5");
        List<Student> students = names.stream().map
                        (name -> createStudent(name, Integer.toString(random.nextInt(3) + 1), random.nextDouble(9999 - 1000 + 1) + 1000))
                .collect(Collectors.toList());
        students.stream().forEach(student -> print(student));
        System.out.println("\nStudents in year 2: ");
        students.stream().filter(student -> student.getYearOfStudy().equals("2")).forEach(student -> print(student));
    }
}