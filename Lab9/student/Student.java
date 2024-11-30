package student;

import java.util.Scanner;

public class Student {

    Scanner sc = new Scanner(System.in);

    // declare attribute
    protected int studentId;
    protected String studentName;
    protected String studentClass;
    protected double studentMark1;
    protected double studentMark2;

    // contructor
    public Student() {

    }
    public Student(int studentId, String studentName, String studentClass, double studentMark1, double studentMark2) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentClass = studentClass;
        this.studentMark1 = studentMark1;
        this.studentMark2 = studentMark2;
    }

    // setter and getter
    public int getStudentId() {
        return studentId;
    }
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
    public String getStudentName() {
        return studentName;
    }
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    public String getStudentClass() {
        return studentClass;
    }
    public void setStudentClass(String studentClass) {
        this.studentClass = studentClass;
    }
    public double getStudentMark1() {
        return studentMark1;
    }
    public void setStudentMark1(double studentMark1) {
        this.studentMark1 = studentMark1;
    }
    public double getStudentMark2() {
        return studentMark2;
    }
    public void setStudentMark2(double studentMark2) {
        this.studentMark2 = studentMark2;
    }

    // display
    public void displayStudent() {
        System.out.println("-----------------");
        System.out.println("student id: " + studentId);
        System.out.println("student name: " + studentName);
        System.out.println("student class: " + studentClass);
        System.out.println("student mark1: " + studentMark1);
        System.out.println("student mark2: " + studentMark2);
    }

    // input
    public void inputStudent() {
        System.out.println("GET INFORMATION OF STUDENT!");

        System.out.println("student id?");
        studentId = sc.nextInt();
        sc.nextLine();

        System.out.println("student name?");
        studentName = sc.nextLine();

        System.out.println("student class?");
        studentClass = sc.nextLine();

        System.out.println("student mark1?");
        studentMark1 = sc.nextDouble();
        sc.nextLine();

        System.out.println("student mark2?");
        studentMark2 = sc.nextDouble();
        sc.nextLine();
    }

    // get average mark
    public double getAvgMark() {
        double averageMark = (studentMark1 + studentMark2)/2;
        return averageMark;
    }

    
    
}