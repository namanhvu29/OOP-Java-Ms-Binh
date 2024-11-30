import java.util.Scanner;

public class DaGiac {

    // Declare
    protected int soCanh;
    protected int [] kichThuocCacCanh;
    public Object TamGiac;


    // Contructor
    public DaGiac(int soCanh, int[] kichThuocCacCanh) {
        this.soCanh = soCanh;
        this.kichThuocCacCanh = kichThuocCacCanh;
    }

    public DaGiac() {

    }

    // Setter and Getter
    public int getSoCanh() {
        return soCanh;
    }

    public void setSoCanh(int soCanh) {
        this.soCanh = soCanh;
    }

    public int[] getKichThuocCacCanh() {
        return kichThuocCacCanh;
    }

    public void setKichThuocCacCanh(int[] kichThuocCacCanh) {
        this.kichThuocCacCanh = kichThuocCacCanh;
    }

    // Input
    public void Input() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so canh cua da giac: ");
        soCanh = sc.nextInt();
        kichThuocCacCanh = new int[soCanh];
        System.out.println("Da giac co so canh la: " + soCanh);

        for ( int i = 0; i < soCanh; i++) {
            System.out.print("Canh thu " + (i+1) + " co gia tri la: ");
            kichThuocCacCanh[i] = sc.nextInt();
        }
        System.out.println("-----------------------------");

    }

    // Display
    public void Display() {
        System.out.println("Da giac co so canh la: " + soCanh);
    }

    // Perimeter
    public void Perimeter() {

    }

    // Print value side of Multirengular
    public void Value() {
        System.out.println("-----------------------------");
        for ( int i = 0; i < soCanh; i++) {
            System.out.println("Canh thu "+ (i+1) + "co gia tri la: " + kichThuocCacCanh[i]);
        }
        System.out.println("-----------------------------");
    }


    
}