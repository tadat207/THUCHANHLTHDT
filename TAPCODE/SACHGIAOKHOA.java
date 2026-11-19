public class SACHGIAOKHOA extends SACH_CHA {
    public String tinhtrang;

    public SACHGIAOKHOA(String masach,int soluong,double dongia,String tinhtrang){
        super(masach,soluong,dongia);
        this.tinhtrang=tinhtrang;
    }

    public double thanhtiengiaokhoa(){
        if(tinhtrang.equalsIgnoreCase("moi"))
            return soluong*dongia;
        else
            return soluong*dongia*0.5;
    }
    public void in(){
        super.in();
        System.out.println("Tinh trang sach la: "+tinhtrang);
    }
}
