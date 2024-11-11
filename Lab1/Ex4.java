import java.util.Scanner;

public class Ex4 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of a: ");
        double a = scanner.nextDouble();
        
        System.out.print("Enter the value of b: ");
        double b = scanner.nextDouble();
        
        System.out.print("Enter the value of c: ");
        double c = scanner.nextDouble();

        if (a == 0) {
            if (b != 0) {
                double x = -c / b;
                System.out.println("The solution is x = " + x);
            } else if (c == 0) {
                System.out.println("The equation has infinitely many solutions.");
            } else {
                System.out.println("The equation has no solution.");
            }
        } else {

            double discriminant = b * b - 4 * a * c;
            
            if (discriminant > 0) {
                double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
                System.out.println("The equation has two distinct roots:");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            } else if (discriminant == 0) {

                double x = -b / (2 * a);
                System.out.println("The equation has one real root:");
                System.out.println("x = " + x);
            } else {

                double realPart = -b / (2 * a);
                double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
                System.out.println("The equation has two complex roots:");
                System.out.println("x1 = " + realPart + " + " + imaginaryPart + "i");
                System.out.println("x2 = " + realPart + " - " + imaginaryPart + "i");
            }
        }
        
        scanner.close();
    }
}
