package ptgt;
import java.util.Scanner;

public class OTo extends PTGT {
    
    // khoi tao thuoc tinh
    protected int soChoNgoi;
    protected String kieuDongCo;

    Scanner sc = new Scanner(System.in);

    // ham tao
    public OTo() {
        super();
    }
    public OTo (String hangSanXuat, int namSanXuat, double giaBan, String mauSac, int soChoNgoi, String kieuDongCo) {
        super(hangSanXuat, namSanXuat, giaBan, mauSac);
        this.soChoNgoi = soChoNgoi;
        this.kieuDongCo = kieuDongCo;
    }

    // setter va getter
    public void setSoChoNgoi(int soChoNgoi) {
        this.soChoNgoi = soChoNgoi;
    }
    public int getSoChoNgoi() {
        return soChoNgoi;
    }

    public void setKieuDongCo(String kieuDongCo) {
        this.kieuDongCo = kieuDongCo;
    }
    public String getKieuDongCo() {
        return kieuDongCo;
    }

    // hien thi thong tin
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("oto co so cho ngoi la: " + soChoNgoi);
        System.out.println("oto co kieu dong co la: " + kieuDongCo);
    }

    // nhap thong tin
    public void nhapThongTin() {
        super.nhapThongTin();
        System.out.println("oto co so cho ngoi?");
        soChoNgoi = sc.nextInt();
        sc.nextLine();

        System.out.println("oto co kieu dong co?");
        kieuDongCo = sc.nextLine();
    }
}
