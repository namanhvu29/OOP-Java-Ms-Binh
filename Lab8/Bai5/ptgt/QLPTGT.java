package ptgt;

import java.util.ArrayList;
import java.util.Scanner;

public class QLPTGT {
    Scanner sc = new Scanner(System.in);

    // ham chinh
    public static void main(String[] args) {
        XeMay xeMay = new XeMay();
        XeTai xeTai = new XeTai();
        OTo oTo = new OTo();
        xeMay.nhapThongTin();
        xeTai.nhapThongTin();
        oTo.nhapThongTin();
        QLPTGT.tiemKiemTheoMau(xeMay, xeTai, oTo);
        
    }


    // ham tim kiem phuong tien
    public static void tiemKiemTheoMau(XeMay xeMay, XeTai xeTai,OTo oTo) {
        String xeMayMauSac = xeMay.getMauSac();
        String xeTaiMauSac = xeTai.getMauSac();
        String oToMauSac = oTo.getMauSac();
        System.out.println("xe may mau sac: " + xeMayMauSac);
        System.out.println("xe tai mau sac: " + xeTaiMauSac);
        System.out.println("oto mau sac la: " + oToMauSac);

    }


    

}
