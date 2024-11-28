import java.util.Scanner;

public class BienLai {
    Scanner sc = new Scanner(System.in);

    // khoi tao thuoc tinh
    private KhachHang khachHang;
    protected int chiSoCu;
    protected int chiSoMoi;
    protected int soTien; 
    // soTien = (chi so moi - chi so cu)*750

    // ham tao
    public BienLai(){
        khachHang = new KhachHang();
    }

    // Setter va getter
    public KhachHang getKhachHang() {
        return khachHang;
    }

    public void setKhachHang(KhachHang khachHang) {
        this.khachHang = khachHang;
    }

    public int getChiSoCu() {
        return chiSoCu;
    }

    public void setChiSoCu(int chiSoCu) {
        this.chiSoCu = chiSoCu;
    }

    public int getChiSoMoi() {
        return chiSoMoi;
    }

    public void setChiSoMoi(int chiSoMoi) {
        this.chiSoMoi = chiSoMoi;
    }

    public int getSoTien() {
        return soTien;
    }

    public void setSoTien(int soTien) {
        this.soTien = soTien;
    }

    // hien thi thong tin
    public void hienThiThongTin() {
        khachHang.hienThiThongTin();
        System.out.println("chi so dien cu: " + chiSoCu);
        System.out.println("chi so dien moi: " + chiSoMoi);
        System.out.println("so tien phai tra: " + (chiSoMoi - chiSoCu)*750);
    }

    // nhap thong tin
    public void nhapThongTin() {
        khachHang.nhapThongTin();
        System.out.println("nhap chi so dien cu: ");
        chiSoCu = sc.nextInt();
        sc.nextLine();

        System.out.println("nhap chi so dien moi: ");
        chiSoMoi = sc.nextInt();
        sc.nextLine();
    }

    
}