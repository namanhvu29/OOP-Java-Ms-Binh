package Bai2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        KhachSan khachSan = new KhachSan();
        khachSan.nhapThongTinKhachTro(sc);
        khachSan.hienThiThongTin();
        khachSan.timKiemKhachHang(sc);
    }
}
