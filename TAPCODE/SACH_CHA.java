public class SACH_CHA {
    protected String masach;
    protected int soluong;
    protected double dongia;

    public SACH_CHA(String masach,int soluong,double dongia) {
        this.masach = masach;
        this.soluong = soluong;
        this.dongia = dongia;
    }
    public void in(){
        System.out.println("Ma sach la: "+ masach);
        System.out.println("so luong sach la: "+ soluong);
        System.out.println("don gia cua cuon sach la: "+ dongia);
    }

}
