import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the value of a: ");
        double a = scanner.nextDouble();
        
        System.out.print("Enter the value of b: ");
        double b = scanner.nextDouble();

        if (a != 0) {

            double x = -b / a;
            System.out.println("The solution for x is: " + x);
        } else {

            if (b == 0) {
                System.out.println("The equation has infinitely many solutions.");
            } else {
                System.out.println("The equation has no solution.");
            }
        }
        
        scanner.close();
    }

}
