public class Main {
    public static void main(String[] args) {
        Student student = new Student("Student", "075328351", 1234, 778);
        StudentFileStream studentFileStream = new StudentFileStream();

        studentFileStream.writeToFile(student, "test.txt");
        studentFileStream.readFromFile("test.txt");
    }
}