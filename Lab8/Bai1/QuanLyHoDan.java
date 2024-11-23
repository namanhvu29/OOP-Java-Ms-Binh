import java.util.Scanner;

public class QuanLyHoDan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        KhuPho khuPho = new KhuPho();

        khuPho.nhapDanhSachHoDan(sc);
        khuPho.hienThiHoDanCoNguoiThuongTho();

        sc.close();
    }
}
