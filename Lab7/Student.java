import java.util.Scanner;

public class Student {

    Scanner sc = new Scanner(System.in);

    // Declare
    protected int studentID;
    protected String studentName;
    protected double math;
    protected double physic;
    protected double chemistry;


    // Contructor
    public Student(int studentID, String studentName, double math, double physic, double chemistry) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.math = math;
        this.physic = physic;
        this.chemistry = chemistry;
    }

    public Student() {

    }


    // Setter and Getter
    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public double getMath() {
        return math;
    }

    public void setMath(double math) {
        this.math = math;
    }

    public double getPhysic() {
        return physic;
    }

    public void setPhysic(double physic) {
        this.physic = physic;
    }

    public double getChemistry() {
        return chemistry;
    }

    public void setChemistry(double chemistry) {
        this.chemistry = chemistry;
    }


    // Input
    public void Input() {
        System.out.println("Math' mark: ");
        math = sc.nextDouble();
        System.out.println("Physic' mark: ");
        physic = sc.nextDouble();
        System.out.println("Chemistry' mark: ");
        chemistry = sc.nextDouble();
        System.out.println("Get mark done!!");
    }


    // Average mark
    public double getAverageMark() {
        double averageMark = (math + physic + chemistry) / 3;
        return averageMark;
    }

    // Rank
    public void getRank() {
        if ( getAverageMark() >= 8.0) {
            System.out.println("Rate A");
        }
        else if ( getAverageMark() >= 6.5) {
            System.out.println("Rate B");
        }
        else if ( getAverageMark() >= 5.0) {
            System.out.println("Rate C");
        }
        else {
            System.out.println("Rate D");
        }
    }

    


    

}