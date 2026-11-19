

public class SACH {
    protected String masach;
    protected String ngaynhap;
    protected double dongia;
    protected int soluong;
    protected String nhaxuatban;

    public SACH(String masach,String ngaynhap,double dongia,int soluong,String nhaxuatban){
        this.masach=masach;
        this.ngaynhap=ngaynhap;
        this.dongia=dongia;
        this.soluong=soluong;
        this.nhaxuatban=nhaxuatban;
    }

    public void in(){
        System.out.println("Ma sach : "+masach);
        System.out.println("ngay nhap: "+ngaynhap);
        System.out.println("Don gia: "+dongia);
        System.out.println("so luong : "+soluong);
        System.out.println("nha xuat ban sach : "+nhaxuatban);
    }

}
