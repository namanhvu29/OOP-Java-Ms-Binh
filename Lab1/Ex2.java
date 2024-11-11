import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Math score: ");
        double math = scanner.nextDouble();
        
        System.out.print("Enter Physics score: ");
        double physics = scanner.nextDouble();
      
        System.out.print("Enter Chemistry score: ");
        double chemistry = scanner.nextDouble();

        double average = (math + physics + chemistry) / 3;

        char rank;
        if (average >= 8.0) {
            rank = 'A';
        } else if (average >= 6.5) {
            rank = 'B';
        } else if (average >= 5.0) {
            rank = 'C';
        } else {
            rank = 'D';
        }
        System.out.printf("Average score: %.2f\n", average);
        System.out.println("Rank: " + rank);        
        scanner.close();
    }
}
