public class DepartmentHead extends Professor implements Administrator {
    private String departmentName;

    public DepartmentHead(String id, String name, String departmentName) {
        super(id, name);
        this.departmentName = departmentName;
        System.out.println("A new department head has been created: " + name);
    }

    @Override
    public void manageDepartment(String departmentName) {
        this.departmentName = departmentName;
        System.out.println(getName() + " is managing the department: " + departmentName);
    }

    @Override
    public String getRole() {
        return super.getRole() + ", Department Head";
    }
}