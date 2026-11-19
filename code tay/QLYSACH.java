public class QLYSACH {
    public String masach;
    public String tensach;
    public int soluong;

    public QLYSACH(String masach,String tensach,int soluong){
            this.masach=masach;
            this.tensach=tensach;
            this.soluong=soluong;
    }
    public void in(){
        System.out.println("========");
        System.out.println("MA SACH LA: "+masach);
        System.out.println("TEN SACH LA: "+tensach);
        System.out.println("SO LUONG SACH LA: "+soluong);

    }
}

