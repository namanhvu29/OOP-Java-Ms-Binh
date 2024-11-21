public class TamGiac extends DaGiac {

    public int KiemTraTamGiac() {
        int check = 0;
        if ( soCanh == 3) {
            if ( (kichThuocCacCanh[0] + kichThuocCacCanh[1] > kichThuocCacCanh[2]) || ( kichThuocCacCanh[1] + kichThuocCacCanh[2] > kichThuocCacCanh[0]) || ( kichThuocCacCanh[0] + kichThuocCacCanh[2] > kichThuocCacCanh[1])) {
                System.out.println("Da giac la tam giac!");
                check = 1;
                
            }
            else {
                System.out.println("Khong phai la tam giac");
            }
        }
        else {
            System.out.println("Khong phai la tam giac");
        }
        System.out.println("-----------------------------");
        return check;
    }

    public void Area(){

        if ( KiemTraTamGiac() == 1 ){
            // double p = ((kichThuocCacCanh[0] + kichThuocCacCanh[1] + kichThuocCacCanh[2])*1.0)/3;
            // double area = p*(p-kichThuocCacCanh[0]*1.0)*(p-kichThuocCacCanh[1]*1.0)*(p-kichThuocCacCanh[2]*1.0);
            // System.out.println("Dien tich tam giac la: " + area) ;
            double p = 1.0*(kichThuocCacCanh[0] + kichThuocCacCanh[1] + kichThuocCacCanh[2]) / 2;
            double p1 = p - kichThuocCacCanh[0]*1.0;
            double p2 = p - kichThuocCacCanh[1]*1.0;
            double p3 = p - kichThuocCacCanh[2]*1.0;

            double area = Math.sqrt(p*p1*p2*p3);
            System.out.println("Dien tich tam giac la:  " + area);
        }
        System.out.println("-----------------------------");
    }

    @Override
    public void Perimeter() {

        if ( KiemTraTamGiac() == 1 ){
            System.out.println("Chu vi tam giac la: " + (kichThuocCacCanh[0] + kichThuocCacCanh[1] + kichThuocCacCanh[2]));
        }
        System.out.println("-----------------------------");
    }
}
