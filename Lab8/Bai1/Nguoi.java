import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Scanner;

import javax.swing.text.DateFormatter;

public class Nguoi {

    // Declare
    protected String hoTen;
    protected LocalDate ngaySinh;
    protected String ngheNghiep;


    // Contructor
    public Nguoi() {

    }
    public Nguoi(String hoTen, LocalDate ngaySinh, String ngheNghiep) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.ngheNghiep = ngheNghiep;
    }

    // Setter and Getter
    public String getHoTen() {
        return hoTen;
    }
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
    public LocalDate getNgaySinh() {
        return ngaySinh;
    }
    public void setNgaySinh(LocalDate ngaySinh) {
        this.ngaySinh = ngaySinh;
    }
    public String getNgheNghiep() {
        return ngheNghiep;
    }
    public void setNgheNghiep(String ngheNghiep) {
        this.ngheNghiep = ngheNghiep;
    }


    // Nhap thong tin ca nhan
    public void nhapThongTin(Scanner sc) {
        System.out.println("nhap ho va ten: ");
        hoTen = sc.nextLine();

        System.out.println("nhap ngay sinh (dd/MM/yyyy): ");
        String ngaySinhStr = sc.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        ngaySinh = LocalDate.parse(ngaySinhStr, formatter);

        System.out.println("nhap nghe nghiep: ");
        ngheNghiep = sc.nextLine();
    }


    // Hien thi thong tin ca nhan
    public void hienThongTin() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("ho ten: " + hoTen);
        System.out.println("ngay sinh: " + ngaySinh);
        System.out.println("nghe nghiep: " + ngheNghiep);
    }


    // Kiem tra mung tho 80 tuoi
    public boolean coThuongTho() {
        int tuoi = LocalDate.now().getYear() - ngaySinh.getYear();
        return tuoi == 80;
    }

    

    



}