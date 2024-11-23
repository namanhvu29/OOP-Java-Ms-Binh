import java.util.ArrayList;
import java.util.Scanner;

public class HoDan {
    private int soThanhVien;
    private String soNha;
    private ArrayList<Nguoi> danhSachNguoi;

    // Constructor
    public HoDan() {
        danhSachNguoi = new ArrayList<>();
    }

    // Getter và Setter
    public int getSoThanhVien() {
        return soThanhVien;
    }

    public void setSoThanhVien(int soThanhVien) {
        this.soThanhVien = soThanhVien;
    }

    public String getSoNha() {
        return soNha;
    }

    public void setSoNha(String soNha) {
        this.soNha = soNha;
    }

    public ArrayList<Nguoi> getDanhSachNguoi() {
        return danhSachNguoi;
    }

    public void setDanhSachNguoi(ArrayList<Nguoi> danhSachNguoi) {
        this.danhSachNguoi = danhSachNguoi;
    }

    // Nhap thong tin
    public void nhapThongTin(Scanner sc) {
        System.out.print("so nha: ");
        soNha = sc.nextLine();

        System.out.print("so thanh vien: ");
        soThanhVien = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < soThanhVien; i++) {
            System.out.println("Nhap thong tin thanh vien " + (i + 1) + ":");
            Nguoi nguoi = new Nguoi();
            nguoi.nhapThongTin(sc);
            danhSachNguoi.add(nguoi);
        }
    }

    // Hien thi thong tin
    public void hienThiThongTin() {
        System.out.println("so nha: " + soNha);
        System.out.println("so thanh vien: " + soThanhVien);
        for (Nguoi nguoi : danhSachNguoi) {
            nguoi.hienThongTin();
            System.out.println("--------------------");
        }
    }

    // Kiem tra huong tho
    public boolean coNguoiThuongTho() {
        for (Nguoi nguoi : danhSachNguoi) {
            if (nguoi.coThuongTho()) {
                return true;
            }
        }
        return false;
    }
}
