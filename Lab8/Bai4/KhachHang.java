import java.util.Scanner;

public class KhachHang {
    Scanner sc = new Scanner(System.in);
    
    // khoi tao thuoc tinh
    protected String hoTen;
    protected int soNha;
    protected String maSoCongTo;

    // ham tao
    public KhachHang() {

    }

    // setter va getter
    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getSoNha() {
        return soNha;
    }

    public void setSoNha(int soNha) {
        this.soNha = soNha;
    }

    public String getMaSoCongTo() {
        return maSoCongTo;
    }

    public void setMaSoCongTo(String maSoCongTo) {
        this.maSoCongTo = maSoCongTo;
    }

    // hien thi thong tin
    public void hienThiThongTin() {
        System.out.println("------------------");
        System.out.println("ho ten: " + hoTen);
        System.out.println("so nha: " + soNha);
        System.out.println("ma so cong to: " + maSoCongTo);
    }

    // nhap thong tin
    public void nhapThongTin() {
        System.out.println("nhap thong tin chu ho!");
        
        System.out.println("ho ten: ");
        hoTen = sc.nextLine();

        System.out.println("so nha: ");
        soNha = sc.nextInt();
        sc.nextLine();
        
        System.out.println("ma so cong to: ");
        maSoCongTo = sc.nextLine();
    }

    
}