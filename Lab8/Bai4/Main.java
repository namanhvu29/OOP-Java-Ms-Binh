import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // nhap n khach hang
        System.out.println("nhap so khach hang can them vao danh sach: ");
        int n = sc.nextInt();
        sc.nextLine();

        // tao arraylist bien lai ( gom ca khach hang trong bien lai)
        ArrayList<BienLai> bienLaiList = new ArrayList<>();

        // nhap thong tin trong bien lai
        for ( int i = 0; i < n; i++) {
            System.out.println("nhap thong tin khach hang thu " + (i+1) + ": ");
            BienLai bienLai = new BienLai();
            bienLai.nhapThongTin();
            bienLaiList.add(bienLai);
        }

        // hien thi thong tin cua tung bien lai
        for ( BienLai bienLai : bienLaiList) {
            bienLai.hienThiThongTin();
        }
        sc.close();
    }
}
