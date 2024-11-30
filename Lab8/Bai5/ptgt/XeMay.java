package ptgt;
import java.util.Scanner;

public class XeMay extends PTGT {
    
    // khoi tao thuoc tinh
    protected double congSuat;

    Scanner sc = new Scanner(System.in);

    // ham tao
    public XeMay () {
        super();
    }
    public XeMay (String hangSanXuat, int namSanXuat, double giaBan, String mauSac, double congSuat) {
        super(hangSanXuat, namSanXuat, giaBan, mauSac);
        this.congSuat = congSuat;
    }

    // setter va getter
    public double getCongSuat() {
        return congSuat;
    }
    public void setCongSuat(double congSuat) {
        this.congSuat = congSuat;
    }

    // hien thi thong tin
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("xe may co cong suat la: " + congSuat);
    }

    // nhap thong tin
    public void nhapThongTin() {
        super.nhapThongTin();
        System.out.println("xe may co cong suat?");
        congSuat = sc.nextDouble();
        sc.nextLine();
    }
        

    
}
