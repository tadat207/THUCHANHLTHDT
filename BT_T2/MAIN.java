public class MAIN {
    public static void main(String[] args) {
        SACH s = new SACH("S01", "Lap trinh Java", "Nguyen Van A", 2020, 10);
        s.xuat();

        s.setSoLuong(-5);        // bị chặn, in thông báo lỗi
        s.setNamXuatBan(3000);   // bị chặn vì lớn hơn năm hiện tại
        s.setSoLuong(15);        // hợp lệ
        s.setNamXuatBan(2022);   // hợp lệ

        s.xuat();
        System.out.println("Tieu de: " + s.getTieuDe());
    }
}