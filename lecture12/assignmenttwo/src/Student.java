public class Student {
    private String fullName;
    private String yearOfStudy;
    private double id;

    public Student(String fullName, String yearOfStudy, double id) {
        this.fullName = fullName;
        this.yearOfStudy = yearOfStudy;
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public String getYearOfStudy() {
        return yearOfStudy;
    }

    public double getId() {
        return id;
    }
}
