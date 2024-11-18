import java.util.Scanner;

public class FullTimeEmployee extends Employee implements BonusProvider {

    // Declare
    protected double monthlySalary;

    @Override
    public double calculateSalary() {
        return monthlySalary;
    }

    // Contructor
    public FullTimeEmployee(String name, int employeeID, double monthlySalary) {
        super(name, employeeID);
        this.monthlySalary = monthlySalary;
    }
    public FullTimeEmployee() {
        super();
        monthlySalary = 1.0;
    }


    // Setter and Getter
    public double getMonthlySalary() {
        return monthlySalary;
    }
    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    // Display
    public void displayInfor() {
        super.displayInfor();
        System.out.println("monthlySalary:" + monthlySalary);
    }

    // Input
    public void Input() {
        try {
            super.Input();
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhap luong thang: ");
            setMonthlySalary(sc.nextDouble());
            sc.nextLine();
        }
        catch (Exception e) {
            System.out.println("loi!!!!");  
        }
        
    }

    @Override
    public double calculateBonus() {
        return monthlySalary*0.1;
    }
    

    
}
