public class UniversityManagementSystem {

    public static void main(String[] args) {

        Student student1 = new Student("S001", "Alice Johnson");
        student1.attendClass("Introduction to Computer Science");

        System.out.println();

        Professor professor1 = new Professor("P001", "Dr. Bob Smith");
        professor1.teachCourse("Data Structures");
        professor1.conductResearch("Artificial Intelligence");

        System.out.println();

        DepartmentHead deptHead1 = new DepartmentHead("D001", "Dr. Carol White", "Computer Science");
        deptHead1.manageDepartment("Computer Science");

        System.out.println();

        StaffMember staff1 = new StaffMember("A001", "Mr. John Doe", "Administration");
        staff1.manageDepartment("Administration");

        displayUniversityMemberInfo(student1);
        displayUniversityMemberInfo(professor1);
        displayUniversityMemberInfo(deptHead1);
        displayUniversityMemberInfo(staff1);

    }

    private static void displayUniversityMemberInfo(UniversityMember member) {
        System.out.println("\nID: " + member.getID());
        System.out.println("Name: " + member.getName());
        System.out.println("Role(s): " + member.getRole());
    }
}