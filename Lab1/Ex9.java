import java.util.Scanner;
import java.time.YearMonth;

public class Ex9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a month (1-12): ");
        int month = scanner.nextInt();

        if (month < 1 || month > 12) {
            System.out.println("Invalid month number.");
        } else {
            int year = java.time.Year.now().getValue();
            YearMonth yearMonth = YearMonth.of(year, month);
            int days = yearMonth.lengthOfMonth();
            System.out.println("Number of days: " + days);
        }
    }
}
