import java.util.ArrayList;
import java.util.Scanner;

class Student {
    String studentCode;
    String studentName;
    int studentAge;
    String studentSex;

    // Constructor
    public Student(String code, String name, int age, String sex) {
        this.studentCode = code;
        this.studentName = name;
        this.studentAge = age;
        this.studentSex = sex;
    }

    // Display student information
    public void displayInfo() {
        System.out.println("Student Code: " + studentCode);
        System.out.println("Student Name: " + studentName);
        System.out.println("Student Age: " + studentAge);
        System.out.println("Student Sex: " + studentSex);
    }
}

public class Ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        while (true) {
            System.out.print("Enter student code (or 'n' to stop): ");
            String code = scanner.nextLine();
            if (code.equalsIgnoreCase("n")) break;

            System.out.print("Enter student name: ");
            String name = scanner.nextLine();
            System.out.print("Enter student age: ");
            int age = Integer.parseInt(scanner.nextLine());
            System.out.print("Enter student sex: ");
            String sex = scanner.nextLine();

            students.add(new Student(code, name, age, sex));
        }

        System.out.println("\nStudent List:");
        for (Student s : students) {
            s.displayInfo();
            System.out.println();
        }
    }
}
