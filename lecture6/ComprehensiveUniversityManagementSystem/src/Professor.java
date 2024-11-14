import java.util.ArrayList;
import java.util.List;

public class Professor implements UniversityMember, Educator, Researcher {
    private String id;
    private String name;
    private String role;
    private List<String> coursesTaught;
    private List<String> researchTopics;

    public Professor(String id, String name) {
        this.id = id;
        this.name = name;
        this.role = "Professor";
        this.coursesTaught = new ArrayList<>();
        this.researchTopics = new ArrayList<>();
        System.out.println("A new professor has been created: " + name);
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
    public void teachCourse(String courseName) {
        coursesTaught.add(courseName);
        System.out.println(name + " is teaching course: " + courseName);
    }

    @Override
    public void conductResearch(String topic) {
        researchTopics.add(topic);
        System.out.println(name + " is conducting research on: " + topic);
    }

    public List<String> getCoursesTaught() {
        return coursesTaught;
    }

    public List<String> getResearchTopics() {
        return researchTopics;
    }
}