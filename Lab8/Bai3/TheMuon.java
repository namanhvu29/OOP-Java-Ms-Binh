import java.util.*;

public class TheMuon {

    Scanner sc = new Scanner(System.in);
    // declare
    protected int soPhieuMuon;
    protected String ngayMuon;
    protected String hanTra;
    protected int soHieuSach;
    protected SinhVien sinhVien;

    // Initilazation

    // setter and getter
    public int getSoPhieuMuon() {
        return soPhieuMuon;
    }
    public void setSoPhieuMuon(int soPhieuMuon) {
        this.soPhieuMuon = soPhieuMuon;
    }
    public String getNgayMuon() {
        return ngayMuon;
    }
    public void setNgayMuon(String ngayMuon) {
        this.ngayMuon = ngayMuon;
    }
    public String getHanTra() {
        return hanTra;
    }
    public void setHanTra(String hanTra) {
        this.hanTra = hanTra;
    }
    public int getSoHieuSach() {
        return soHieuSach;
    }
    public void setSoHieuSach(int soHieuSach) {
        this.soHieuSach = soHieuSach;
    }
    public SinhVien getSinhVien() {
        return sinhVien;
    }
    public void setSinhVien(SinhVien sinhVien) {
        this.sinhVien = sinhVien;
    }

    // contructor
    
    public TheMuon(int soPhieuMuon, String ngayMuon, String hanTra, int soHieuSach, SinhVien sinhVien) {
        sinhVien = new SinhVien();
        this.soPhieuMuon = soPhieuMuon;
        this.ngayMuon = ngayMuon;
        this.hanTra = hanTra;
        this.soHieuSach = soHieuSach;
        this.sinhVien = sinhVien;
    }
    public TheMuon(){
        sinhVien = new SinhVien();
    }

    // hien thi thong tin
    public void hienThiThongTin() {
        System.out.println("--------------");
        sinhVien.hienThiThongTin();
        System.out.println("So phieu muon: " + soPhieuMuon);
        System.out.println("So hieu sach: " + soHieuSach);
        System.out.println("Ngay muon: " + ngayMuon);
        System.out.println("Ngay tra: " + hanTra);
    }

    // nhap thong tin
    public void nhapThongTin() {
        sinhVien.nhapThongTin();
        System.out.println("So phieu muon: ");
        soPhieuMuon = sc.nextInt();
        sc.nextLine();
        System.out.println("So hieu sach: ");
        soHieuSach = sc.nextInt();
        sc.nextLine();
        System.out.println("Ngay muon: ");
        ngayMuon = sc.nextLine();
        System.out.println("Ngay tra: ");
        hanTra = sc.nextLine();
        
    }

    

    
}
