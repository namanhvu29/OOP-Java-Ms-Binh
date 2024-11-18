import java.util.Scanner;

public class PartTimeEmployee extends Employee implements BonusProvider {

    @Override
    public double calculateSalary() {
        return hourlyRate*hoursWorked;
    }
    
    // Declare
    protected double hourlyRate;
    protected int hoursWorked;

    // Contructor
    public PartTimeEmployee(String name, int employeeID, double hourlyRate, int hoursWorked) {
        super(name, employeeID);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }
    public PartTimeEmployee(){
        super();
        hourlyRate = 1.0;
        hoursWorked = 1;
    }

    // Setter and Getter
    public double getHourlyRate() {
        return hourlyRate;
    }
    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
    public int getHoursWorked() {
        return hoursWorked;
    }
    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    // Display
    public void displayInfor() {
        super.displayInfor();
        System.out.println("hourlyRate: " + hourlyRate);
        System.out.println("hoursWorked: " + hoursWorked);
    }

    // Input
    public void Input() {
        try {
            super.Input();
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhap hour rate: ");
            hourlyRate = sc.nextDouble();
            System.out.println("Nhap hour work: ");
            hoursWorked = sc.nextInt();
        }
        catch (Exception e) {
            System.err.println("loi!!!!");
        }

    }

    @Override
    public double calculateBonus() {
        return hourlyRate*hoursWorked*0.05;
    }

}
