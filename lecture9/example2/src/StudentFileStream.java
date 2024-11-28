import java.io.*;
public class StudentFileStream {
    public void printData(Student student) {
        System.out.println("Name: " + student.name);
        System.out.println("Phone number: " + student.phoneNum);
        System.out.println("Index number: " + student.indexNum);
        System.out.println("Record number: " + student.recordNum);
    }

    public void writeToFile(Student student, String filename) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(filename);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeObject(student);
            printData(student);
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public Student readFromFile(String filename) {
        Student student = new Student();
        try {
            FileInputStream fileInputStream = new FileInputStream(filename);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            student = (Student) objectInputStream.readObject();
            printData(student);
            objectInputStream.close();
            fileInputStream.close();
        } catch (IOException e) {
            System.out.println(e);
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        }
        return student;
    }
}