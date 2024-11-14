import java.util.ArrayList;
import java.util.List;

public class Student implements UniversityMember, Learner {
    private String id;
    private String name;
    private String role;
    private List<String> coursesEnrolled;

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
        this.role = "Student";
        this.coursesEnrolled = new ArrayList<>();
        System.out.println("A new student has been created: " + name);
    }

    @Override
    public String getID() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getRole() {
        return role;
    }

    @Override
    public void attendClass(String courseName) {
        coursesEnrolled.add(courseName);
        System.out.println(name + " attended class: " + courseName);
    }

    public List<String> getCoursesEnrolled() {
        return coursesEnrolled;
    }
}