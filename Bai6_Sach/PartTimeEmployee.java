import java.util.Scanner;

public class PartTimeEmployee {

    // Attribute
    int hoursPerWeek;

    // Contructor
    public PartTimeEmployee() {
        hoursPerWeek = 0;
    }
    public PartTimeEmployee(String name, int age, char gender, String EmployeeID, int hoursPerWeek) {
        super();
        this.hoursPerWeek = hoursPerWeek;
    }

    // Setter and Getter
    public void setHoursPerWeek(int hoursPerWeek) {
        this.hoursPerWeek = hoursPerWeek;
    }
    public int getHoursPerWeek() {
        return hoursPerWeek;
    }

    // Method toString
    public String toString() {
        return super.toString() + "\nHours per week:" + hoursPerWeek;
    }

    // Method input
    public void input() {
        

    } 
}