package Bai2;
import java.util.*;
public class KhachSan {

    private static class PhongTro {
        // declare
        private Nguoi nguoi;
        private int soNgayTro;
        private double giaPhongTro;
        private String loaiPhongTro;

        // contructor
        public PhongTro(Nguoi nguoi, int soNgayTro, String loaiPhongTro, double giaPhongTro) {
            this.nguoi = nguoi;
            this.soNgayTro = soNgayTro;
            this.loaiPhongTro = loaiPhongTro;
            this.giaPhongTro = giaPhongTro;
        }

        // getter
        public Nguoi getNguoi(){
            return nguoi;
        }

        // tinh tien
        public double tinhTien(){
            
            if(loaiPhongTro.equals("tieu chuan")){
                giaPhongTro = 50;
            }
            else if (loaiPhongTro.equals("cao cap")){
                giaPhongTro = 70;
            }
            return soNgayTro * giaPhongTro;
        }

        // loai phong

        // Hien thi thong tin phong tro
        public void hienThiThongTin() {
            nguoi.hienThiThongTin();
            System.out.println("so ngay tro: " + soNgayTro);
            System.out.println("loai phong: " + loaiPhongTro);
            System.out.println("gia phong tro: " + giaPhongTro);
            System.out.println("tong so tien can tra: " + tinhTien());
        }
    }

    private ArrayList<PhongTro> danhSachTro;

    // contructor
    public KhachSan() {
        this.danhSachTro = new ArrayList<>();

    }

    // nhap thong tin khach tro
    public void nhapThongTinKhachTro(Scanner sc){
            System.out.println("nhap so luong khach tro");
            int n = sc.nextInt();
            sc.nextLine();
    
            for ( int i = 0; i < n; i++) {
                System.out.println("nhap thong tin khach hang thu " + (i+1));
                System.out.println("ho va ten: ");
                String hoTen = sc.nextLine();
                
                System.out.println("ngay sinh: ");
                String ngaySinh = sc.nextLine();
    
                System.out.println("cccd: ");
                int cccd = sc.nextInt();
    
                System.out.println("so ngay o tro: ");
                int soNgayTro = sc.nextInt();
                sc.nextLine();
    
                System.out.println("loai phong (1: tieu chuan) (2: cao cap): ");
                System.out.println("tieu chuan: 50k/ngay --- cao cap: 70k/ngay");
                String loaiPhongTro = sc.nextLine().trim().toLowerCase();
    
            // String loaiPhongTro = "";
            double giaPhongTro = 0;
    
            if(loaiPhongTro.equals("tieu chuan")){
                loaiPhongTro = "tieu chuan";
                giaPhongTro = 50.000;
            }
            else if (loaiPhongTro.equals("cao cap")){
                loaiPhongTro = "cao cap";
                giaPhongTro = 70.000;
            }


            Nguoi nguoi = new Nguoi(hoTen, ngaySinh, cccd);
            PhongTro phongTro = new PhongTro(nguoi, soNgayTro, loaiPhongTro, giaPhongTro);
            danhSachTro.add(phongTro);
        }

    }

    // hien thi thong tin khach tro
    public void hienThiThongTin() {
        for (PhongTro phongTro : danhSachTro) {
            phongTro.hienThiThongTin();
            System.out.println("----------------------------");
        }   
    }

    // Tim kiem thong tin khach hang bang id
    public void timKiemKhachHang(Scanner sc) {
        System.out.println("nhap so cccd cua khach: ");
        int n = sc.nextInt();
        for (PhongTro phongTro : danhSachTro) {
            if ( n == phongTro.getNguoi().getCccd()) {
                System.out.println("Khach hang da duoc tim thay");
                phongTro.hienThiThongTin();
            }
        }
    }

}