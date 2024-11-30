package person_employee;

import java.util.*;

public class Employee extends Person {

    Scanner sc = new Scanner(System.in);

    // declare
    protected double salary;
    protected String role;

    // contructor
    public Employee() {
        super();
    }
    public Employee(int personId, String personName, String personEmail, double salary, String role) {
        super(personId, personName, personEmail);
        this.salary = salary;
        this.role = role;
    }

    // setter and getter
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }

    // display
    public void displayInformation() {
        super.displayInformation();
        System.out.println("Salrary: " + salary);
        System.out.println("Role: " + role);
    }

    // input
    public void inputInformation() {
        super.inputInformation();

        System.out.println("Salary?");
        salary = sc.nextDouble();
        sc.nextLine();

        System.out.println("Role?");
        role = sc.nextLine();
    }
    
}
