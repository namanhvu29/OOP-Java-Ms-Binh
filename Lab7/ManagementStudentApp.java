import java.util.ArrayList;
import java.nio.channels.Pipe.SourceChannel;
import java.util.Scanner;

public class ManagementStudentApp {
    static Scanner sc = new Scanner(System.in);
    
    

    // Main function
    public static void main(String[] args) {
        ArrayList<Student> studentList = new ArrayList<>();
        addListOfStudent(studentList);
        printListOfStudent(studentList);
        findTheBestOfStudent(studentList);
    }
            
            
    // Add student
    public static void addStudent(ArrayList<Student> studentList) {
        System.out.println("Fill Student' information");

        System.out.println("Student' ID: ");
        int studentID = sc.nextInt();
        sc.nextLine();

        System.out.println("Student' Name: ");
        String studentName = sc.nextLine();

        System.out.println("Math: ");
        double math = sc.nextDouble();

        System.out.println("Physic: ");
        double physic = sc.nextDouble();

        System.out.println("Chemistry: ");
        double chemistry = sc.nextDouble();
        sc.nextLine();

        Student student = new Student(studentID, studentName, math, physic, chemistry);
        studentList.add(student);

    }


    // View student
    public static void viewStudent(Student student) {
        System.out.println(student);
    }


    // Add a list of student
    public static void addListOfStudent(ArrayList<Student> studentList) {
        System.out.println("How many students do you want to add?");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details information of Student " + (i + 1) + ":");
            addStudent(studentList);
        }
    }


    // Print list of student
    public static void printListOfStudent(ArrayList<Student> studentList) {
        System.out.println("\nList of Students:");
        for (Student student : studentList) {
            viewStudent(student);
            System.out.println("---------------------");
        }
    }

    // Find the best student
    public static void findTheBestOfStudent(ArrayList<Student> studentList) {
        Student bestStudent = studentList.get(0);
        for (Student student : studentList) {
            if (student.getAverageMark() > bestStudent.getAverageMark()) {
                bestStudent = student;
            }
        }
        System.out.println("\nThe Best Student:");
        viewStudent(bestStudent);
    }




    
}