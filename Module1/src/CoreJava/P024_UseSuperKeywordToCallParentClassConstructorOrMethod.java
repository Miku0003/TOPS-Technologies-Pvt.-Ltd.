package CoreJava;



// University Class (Parent)

class University {
    private String name;

    public University(String name) {
        this.name = name;
    }

    public void displayUniversityName() {
        System.out.println("University Name: " + name);
    }
}


// Department Class (Child)

class Department extends University {
    private String departmentName;

    public Department(String universityName, String departmentName) {
        super(universityName); // Calls the parent class constructor
        this.departmentName = departmentName;
    }

    public void displayDepartmentDetails() {
        super.displayUniversityName(); // Calls the parent class method
        System.out.println("Department Name: " + departmentName);
    }
}


// Main Class

public class P024_UseSuperKeywordToCallParentClassConstructorOrMethod {
    public static void main(String[] args) {
        Department department = new Department("Magadh University, Bodh Gaya, Bihar", "Computer Science");
        department.displayDepartmentDetails();
    }
}