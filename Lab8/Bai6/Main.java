import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // TamGiac dagiac = new TamGiac();
        // dagiac.Input();
        // dagiac.Display();
        // dagiac.Value();
        // dagiac.KiemTraTamGiac();
        // dagiac.Perimeter();
        // dagiac.Area();

        Scanner sc = new Scanner(System.in);

        ArrayList<TamGiac> daGiac = new ArrayList<>();
        System.out.println("nhap n tam giac: ");
        int n = sc.nextInt();
        sc.nextLine();

        for ( int i = 0; i < n; i++) {
            System.out.println("nhap thong tin tam giac thu " + (i+1));
            TamGiac tg = new TamGiac();
            tg.Input();
            // tg.Display();
            // tg.Value();
            // tg.KiemTraTamGiac();
            // tg.Perimeter();
            // tg.Area();
            daGiac.add(tg);
        }

        double maxArea = 0;
        TamGiac largestArea = null;

        for ( TamGiac tg : daGiac) {
            double cArea = tg.Area();
            if ( cArea > maxArea) {
                maxArea = cArea;
                largestArea = tg;
            }
        }

          // Display the triangle with the largest area
          if (largestArea != null) {
            System.out.println("\tam giac co dien tich lon nhat la:");
            largestArea.Display();
            System.out.println("dien tich la: " + maxArea);
        } else {
            System.out.println("\nkhong tam giac hop le trong danh sach.");
        }

        sc.close();



        
    } 
}
