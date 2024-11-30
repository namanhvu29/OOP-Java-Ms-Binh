package ptgt;
import java.util.Scanner;

public class PTGT {

    // khoi tao thuoc tinh
    protected String hangSanXuat;
    protected int namSanXuat;
    protected double giaBan;
    protected String mauSac;

    Scanner sc = new Scanner(System.in);

    // ham tao
    public PTGT() {

    }

    public PTGT(String hangSanXuat, int namSanXuat, double giaBan, String mauSac) {
        this.hangSanXuat = hangSanXuat;
        this.namSanXuat = namSanXuat;
        this.giaBan = giaBan;
        this.mauSac = mauSac;
    }


    // setter va getter
    public String getHangSanXuat() {
        return hangSanXuat;
    }

    public void setHangSanXuat(String hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }

    public int getNamSanXuat() {
        return namSanXuat;
    }

    public void setNamSanXuat(int namSanXuat) {
        this.namSanXuat = namSanXuat;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }

    // hien thi thong tin
    public void hienThiThongTin() {
        System.out.println("------------");
        System.out.println("hang san xuat: " + hangSanXuat);
        System.out.println("nam san xuat: " + namSanXuat);
        System.out.println("mau sac: " + mauSac);
    }

    // nhap thong tin
    public void nhapThongTin() {
        System.out.println("nhap thong tin phuong tien!");

        System.out.println("hang san xuat?");
        hangSanXuat = sc.nextLine();

        System.out.println("nam san xuat?");
        namSanXuat = sc.nextInt();
        sc.nextLine();

        System.out.println("mau sac?");
        mauSac = sc.nextLine();
    }
    
}