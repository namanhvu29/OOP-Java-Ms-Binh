package ptgt;
import java.util.Scanner;

public class XeTai extends PTGT {
    
    // khoi tao thuoc tinh
    protected double trongTai;

    Scanner sc = new Scanner(System.in);

    // ham tao
    public XeTai() {
        super();
    }

    public XeTai(String hangSanXuat, int namSanXuat, double giaBan, String mauSac, double trongTai) {
        super(hangSanXuat, namSanXuat, giaBan, mauSac);
        this.trongTai = trongTai;
    }

    // setter va getter
    public void setTrongTai( double trongTai) {
        this.trongTai = trongTai;
    }
    public double getTrongTai() {
        return trongTai;
    }

    // hien thi thong tin
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("xe tai co trong tai la: " + trongTai);
    }

    // nhap thong tin
    public void nhapThongTin() {
        super.nhapThongTin();
        System.out.println("xe tai co trong tai?");
        trongTai = sc.nextDouble();
        sc.nextLine();
    }
}
