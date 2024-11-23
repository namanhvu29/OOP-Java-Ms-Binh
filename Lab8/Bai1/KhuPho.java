import java.util.ArrayList;
import java.util.Scanner;

public class KhuPho {
    private ArrayList<HoDan> danhSachHoDan;

    // Constructor
    public KhuPho() {
        danhSachHoDan = new ArrayList<>();
    }

    // nhap danh sach ho dan
    public void nhapDanhSachHoDan(Scanner sc) {
        System.out.print("nhap so luong ho dan: ");
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.println("nhap thong tin cho ho dan " + (i + 1) + ":");
            HoDan hoDan = new HoDan();
            hoDan.nhapThongTin(sc);
            danhSachHoDan.add(hoDan);
        }
    }

    // Hien thi thong tin ho dan co nguoi mung tho
    public void hienThiHoDanCoNguoiThuongTho() {
        System.out.println("\nCac ho dan co nguoi mung tho (80 tuoi):");
        for (HoDan hoDan : danhSachHoDan) {
            if (hoDan.coNguoiThuongTho()) {
                hoDan.hienThiThongTin();
                System.out.println("====================");
            }
        }
    }
}
