package CoreJava;



// Employee Class

class Employees {
    private String name;
    private int age;
    private double salary;

    // Parameterized constructor
    public Employees(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    // Display employee details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }
}


// Main Class

public class P017_ParameterizedConstructor {
    public static void main(String[] args) {
        // Create and initialize an Employee object using the parameterized constructor
        Employees employee1 = new Employees("Miku", 30, 50000.0);

        // Display employee details
        System.out.println("Employee 1 Details:");
        employee1.displayDetails();

        // Create another Employee object
        Employees employee2 = new Employees("Miku Kumar", 25, 60000.0);

        // Display employee details
        System.out.println("\nEmployee 2 Details:");
        employee2.displayDetails();
    }
}
