import java.util.Scanner;

public class Employee extends Person {

    // Attribute
    String EmployeeID;
    
    // Constructor
    public Employee() {
        super();
        EmployeeID = "";
    }
    public Employee(String name, int age, char gender, String EmployeeID) {
        super();
        this.EmployeeID = EmployeeID;
    }

    // Setter and Getter
    public void setEmployeeID(String EmployeeID) {
        this.EmployeeID = EmployeeID;
    }
    public String getEmployeeID() {
        return EmployeeID;
    }

    // Method toString
    public String toString() {
        return super.toString() + "\nID:" + EmployeeID;
    }

    // Method input
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name:");
        String name = sc.nextLine();
        System.out.println("\nWhat is your age:");
        int age = sc.nextInt();
        System.out.println("\nWhat is your gender:");
        char gender = sc.next().charAt(0);
        System.out.println("\nWhat is your ID:");
        String id = sc.nextLine();
        Employee employee = new Employee(name, age, gender, id);
    }
}
