public class SACH {
    public String masach;
    public String tieude;
    public String tacgia;
    public int namxuatban;
    public int soluong;

    public SACH(String masach, String tieude, String tacgia, int namxuatban, int soluong) {
        this.masach = masach;
        this.tieude = tieude;
        this.tacgia = tacgia;
        this.namxuatban = namxuatban;
        this.soluong = soluong;
    }

    public void inthongtin() {
        System.out.println("============");
        System.out.println("ma sach la: " + masach);
        System.out.println("tieu de sach la: " + tieude);
        System.out.println("tac gia cua cuon sach la: " + tacgia);
        System.out.println("nam xuat ban cua sach la: " + namxuatban);
        System.out.println("so luong cua cuon sach la: " + soluong);
    }
}