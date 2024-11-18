import java.util.Scanner;

public class Main {

    // Nhap n nhan vien
    public static int nhapN() {
        int n = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n nhan vien: ");
        try {
            n = sc.nextInt();
            if ( n < 2 || n > 5) {
                throw new Exception("may phai nhap 2 <= n <= 5");
            }
        }
        catch (Exception e) {
            System.out.println("loi!! " + e.getMessage());
        }
        return n;      
    }


    // Nhap va hien thi nv fulltime
    public static void inforFullTime(FullTimeEmployee[] nv1, int n) {
            for ( int i = 0; i < n; i++) {
                nv1[i] = new FullTimeEmployee();
                System.out.println("Nhap thong tin nv fulltime thu " + i);
                nv1[i].Input();
                
            }
            for ( int i = 0; i < n; i++) {
                System.out.println("Hien thi thong tin nv fulltime thu " + i);
                nv1[i].displayInfor();
                System.out.println("- - - - - - - - - - ");
            }
    }


    // Nhap va hien thi nv parttime
    public static void inforPartTime(PartTimeEmployee[] nv2, int n) {
            for ( int i = 0; i < n; i++) {
                nv2[i] = new PartTimeEmployee();
                System.out.println("Nhap thong tin nv partime thu " + i);
                nv2[i].Input();
            }
            for ( int i = 0; i < n; i++) {
                nv2[i] = new PartTimeEmployee();
                System.out.println("Hien thi thong tin nv parttime thu " + i);
                nv2[i].displayInfor();
                System.out.println("- - - - - - - - - - ");
            }
    }


    // Sap xep nhan vien fulltime
    public static void sort(FullTimeEmployee[] nv1, int n) {
        for ( int i = 0; i < n; i++) {
            for ( int j = 1; j < n; j++) {
                if ( nv1[i].calculateSalary() < nv1[j].calculateSalary()) {
                    FullTimeEmployee temp = nv1[i];
                    nv1[i] = nv1[j];
                    nv1[j] = temp;
                }
            }
        }
        System.out.println("danh sach sau khi sap xep la:");
        for ( int i = 0; i < n; i++) {
            nv1[i].displayInfor();
        }
    }

    
    // Sap xep nhan vien Parttime
    public static void sort(PartTimeEmployee[] nv2, int n) {
        for ( int i = 0; i < n; i++) {
            for ( int j = 0; j < n; j++) {
                if ( nv2[i].calculateSalary() < nv2[j].calculateSalary()) {
                    PartTimeEmployee temp = nv2[i];
                    nv2[i] = nv2[j];
                    nv2[j] = temp;
                }
            }
        }
        System.out.println("danh sach sau khi sap xep la:");
        for ( int i = 0; i < n; i++) {
            nv2[i].displayInfor();
        }
    }


    // Find staff FullTime Staff by "Name"
    public static void findStaffFullTimeByName(FullTimeEmployee[] nv1, int n) {
        System.out.println("Nhap ten de tim kiem nhan vien fulltime");
        Scanner sc = new Scanner(System.in);
        String ten = sc.nextLine();
        for ( int i = 0; i < n; i++) {
            if (nv1[i].getName().equalsIgnoreCase(ten)) {
                nv1[i].displayInfor();
            }
        }
    }
    

    // Find staff fulltime by id
    public static void findStaffFullTimeById(FullTimeEmployee[] nv1, int n) {
        System.out.println("Nhap id de tim kiem nhan vien fulltime");
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        for ( int i = 0; i < n; i++) {
            if ( nv1[i].getEmployeeID() == id) {
                nv1[i].displayInfor();
            }
        }
    }


        // Find staff PartTime Staff by "Name"
        public static void findStaffPartTimeByName(PartTimeEmployee[] nv2, int n) {
            System.out.println("Nhap ten de tim kiem nhan vien parttime");
            Scanner sc = new Scanner(System.in);
            String ten = sc.nextLine();
            for ( int i = 0; i < n; i++) {
                if (nv2[i].getName().equalsIgnoreCase(ten)) {
                    nv2[i].displayInfor();
                }
            }
        }
        
    
        // Find staff PartTime by id
        public static void findStaffPartTimeById(PartTimeEmployee[] nv2, int n) {
            System.out.println("Nhap id de tim kiem nhan vien parttime");
            Scanner sc = new Scanner(System.in);
            int id = sc.nextInt();
            for ( int i = 0; i < n; i++) {
                if ( nv2[i].getEmployeeID() == id) {
                    nv2[i].displayInfor();
                }
            }
        }



    public static void main(String[] args) {
        int n = Main.nhapN();
        FullTimeEmployee[] nv1 = new FullTimeEmployee[n];
        PartTimeEmployee[] nv2 = new PartTimeEmployee[n];
        Main.inforFullTime(nv1, n);
        // Main.inforPartTime(nv2, n);
        // Main.sort(nv1, n);
        // Main.sort(nv2, n);
        // Main.findStaffFullTimeByName(nv1, n);
        // Main.findStaffFullTimeById(nv1, n);
        
    }

}
