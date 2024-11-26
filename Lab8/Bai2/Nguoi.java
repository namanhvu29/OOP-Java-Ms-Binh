package Bai2;
import java.util.*;
import java.time.*;

public class Nguoi {

    // Declare
    protected String hoTen;
    protected String ngaySinh;
    protected int cccd;

    // Setter and Getter
    public String getHoTen() {
        return hoTen;
    }
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
    public String getNgaySinh() {
        return ngaySinh;
    }
    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }
    public int getCccd() {
        return cccd;
    }
    public void setCccd(int cccd) {
        this.cccd = cccd;
    }


    // Comtructor
    public Nguoi() {

    }
    public Nguoi(String hoTen, String ngaySinh, int cccd) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.cccd = cccd;
    }


    // Display
    public void hienThiThongTin() {
        System.out.println("Ho va ten: " + hoTen);
        System.out.println("Ngay sinh: " + ngaySinh);
        System.out.println("So CCCD: " + cccd);
    }
    


    
}
