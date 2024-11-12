import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] studentCodes = new String[10];
        String[] studentNames = new String[10];
        int[] studentAges = new int[10];
        String[] studentSexes = new String[10];

        int studentCount = 0;
        System.out.println("Enter number of students: ");
        int n = scanner.nextInt();

        while (studentCount < n) {
            System.out.print("Enter student code (or 'n' to stop): ");
            String code = scanner.nextLine();
            if (code.equalsIgnoreCase("n")) break;
            System.out.print("Enter student name: ");
            String name = scanner.nextLine();
            System.out.print("Enter student age: ");
            int age = Integer.parseInt(scanner.nextLine());
            System.out.print("Enter student sex: ");
            String sex = scanner.nextLine();

            studentCodes[studentCount] = code;
            studentNames[studentCount] = name;
            studentAges[studentCount] = age;
            studentSexes[studentCount] = sex;

            studentCount++;
        }

        System.out.println("Student list: ");
        for (int i = 1; i <= n; i++) {
            System.out.println("Student code: " + studentCodes[i]);
            System.out.println("Student name: " + studentNames[i]);
            System.out.println("Student age: " + studentAges[i]);
            System.out.println("Student sex: " + studentSexes[i]);
            System.out.println();
        }
        
    }
}
