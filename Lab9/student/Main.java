package student;

import java.util.*;

public class Main {

    // initilize array list of student
    private static ArrayList<Student> studentList = new ArrayList<>();
    // enter a list of students and stores them in an array list.
    public static void storeStudentList() {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("how many student' information you want to store?");
        int n = sc.nextInt();

        for ( int i = 0; i < n; i++) {
            Student st = new Student();
            System.out.println("Please fill information of student(" + (i+1) + ")");
            st.inputStudent();
            studentList.add(st);
        }

    }

    // sort student by average mark
    public static void sortStudentMark() {
        int n = studentList.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (studentList.get(j).getAvgMark() > studentList.get(j + 1).getAvgMark()) {
                    Student temp = studentList.get(j);
                    studentList.set(j, studentList.get(j + 1));
                    studentList.set(j + 1, temp);
                }
            }
        }
        System.out.println("Students sorted by average mark:");
        printStudentList();

    }

    // print the list of student 
    public static void printStudentList() {
        for (Student st : studentList) {
            st.displayStudent();
        }
    }


    // menu
    public static void menu() {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("===Menu of Student Managemen===");
            System.out.println("1. Store Student Information");
            System.out.println("2. Print Student list");
            System.out.println("3. Sort Student by Average Mark");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");
            
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    storeStudentList();
                    break;
                case 2:
                    printStudentList();
                    break;
                case 3:
                    sortStudentMark();
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice!");
                    break;
            }

        } while ( choice != 4);
    }

    // main program
    public static void main(String[] args) {
        menu(); 
    }
}
