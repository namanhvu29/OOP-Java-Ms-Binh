import java.util.Scanner;

public abstract class Employee {
    // Declare
    protected String name;
    protected int employeeID;

    // Contructor
    public Employee(String name, int employeeID) {
        this.name = name;
        this.employeeID = employeeID;
    }
    public Employee() {
        name = "";
        employeeID = 01;
    }

    // Setter and Getter
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getEmployeeID() {
        return employeeID;
    }
    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    // Abtract method
    public abstract double calculateSalary();

    // Display
    public void displayInfor() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + employeeID);
    }
    
    // Input
    public void Input() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhap ten nhan vien: ");
            name = sc.nextLine();
            System.out.println("Nhap id nhan vien:");
            employeeID = sc.nextInt();
        }
        catch (Exception e) {
            System.out.println("loi!!!!");
        }
        
    }

    
     
}