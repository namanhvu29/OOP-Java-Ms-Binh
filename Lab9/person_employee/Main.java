package person_employee;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    
        // initialize
        private static ArrayList<Employee> emp = new ArrayList<>();

        // function to input employees data
        public static void storeInformation() {
            System.out.println("Enter number of employee?");
            int n = sc.nextInt();
            for ( int i = 0; i < n; i++) {
                Employee em = new Employee();
                System.out.println("Employee no" + (i+1) + ": ");
                em.inputInformation();
                emp.add(em);
            }
        }

        // function to print information of employees
        public static void printInformation() {
            System.out.println("-----------------------");
            System.out.println("Information of Employee");
            for ( Employee em : emp) {
                em.displayInformation();
            }
        }

        public static void main(String[] args) {
            storeInformation();
            printInformation();
    }
}
