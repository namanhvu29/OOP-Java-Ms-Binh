import java.util.*;

public class SinhVien {

    Scanner sc = new Scanner(System.in);
    // Declare
    protected String hoTen;
    protected int maSinhVien;
    protected String lop;

    // Setter and Getter
    public String getHoTen() {
        return hoTen;
    }
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
    public int getMaSinhVien() {
        return maSinhVien;
    }
    public void setMaSinhVien(int maSinhVien) {
        this.maSinhVien = maSinhVien;
    }
    public String getLop() {
        return lop;
    }
    public void setLop(String lop) {
        this.lop = lop;
    }

    // Contructor
    public SinhVien(String hoTen, int maSinhVien, String lop) {
        this.hoTen = hoTen;
        this.maSinhVien = maSinhVien;
        this.lop = lop;
    }
    public SinhVien() {
        
    }

    // hien thi thong tin sinh vien
    public void hienThiThongTin() {
        System.out.println("ho ten: " + hoTen);
        System.out.println("ma sinh vien: " + maSinhVien);
        System.out.println("lop: " + lop);
    }

    // nhap thong tin sinh vien
    public void nhapThongTin() {
        System.out.println("ho ten: ");
        hoTen = sc.nextLine();
        System.out.println("ma sinh vien: ");
        maSinhVien = sc.nextInt();
        sc.nextLine();
        System.out.println("lop: ");
        lop = sc.nextLine();
    }
    

    
}