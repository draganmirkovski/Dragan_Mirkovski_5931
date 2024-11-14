public class StaffMember implements UniversityMember, Administrator {
    private String id;
    private String name;
    private String role;

    private String departmentName;

    public StaffMember(String id, String name, String departmentName) {
        this.id = id;
        this.name = name;
        this.role = "Staff Member";
        this.departmentName = departmentName;
        System.out.println("A new staff member has been created: " + name);
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
    public void manageDepartment(String departmentName) {
        this.departmentName = departmentName;
        System.out.println(name + " is managing the administrative tasks for the department: " + departmentName);
    }
}