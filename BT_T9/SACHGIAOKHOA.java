
public class SACHGIAOKHOA extends SACH {
    public String tinhtrang;

    public SACHGIAOKHOA(String masach,String ngaynhap,double dongia,int soluong,String nhaxuatban,String tinhtrang){
        super(masach,ngaynhap,dongia,soluong,nhaxuatban);
        this.tinhtrang=tinhtrang;
    }
    public double thanhtien(){
        if(tinhtrang.equalsIgnoreCase("moi"))
            return soluong*dongia;
        else
            return soluong*dongia*0.5;
    }
    public void in(){
        super.in();
        System.out.println("tinh trang : "+tinhtrang);
    }
}
