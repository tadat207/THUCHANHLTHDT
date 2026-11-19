
public class SACHTHAMKHAO extends SACH {
        public double thue;

        public SACHTHAMKHAO(String masach, String ngaynhap, double dongia, int soluong, String nhaxuatban, double thue){
            super(masach,ngaynhap,dongia,soluong,nhaxuatban);
            this.thue=thue;
        }
        public double thanhtien(){
            return soluong*dongia+thue;
        }
        public void in(){
            super.in();
            System.out.println("Thue : "+thue);
        }
    }


