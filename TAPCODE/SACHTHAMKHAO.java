public class SACHTHAMKHAO extends SACH_CHA {
    public double thue;

    public SACHTHAMKHAO(String masach,int soluong,double dongia,double thue){
        super(masach,soluong,dongia);
        this.thue=thue;
    }
    public double thanhtienthamkhao(){
        return soluong*dongia+thue;
    }
    public void in(){
        super.in();
        System.out.println("thue cua cuon sach la: "+thue);
    }

}
