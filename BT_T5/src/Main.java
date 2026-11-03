import java.util.*;
public class Main {
    private String maSach;
    private String tenSach;
    private int soLuong;
    private double giaTien;

    // Hàm khởi tạo: gán giá trị cho các thuộc tính khi tạo đối tượng
    public Main(String maSach, String tenSach, int soLuong, double giaTien) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.soLuong = soLuong;
        this.giaTien = giaTien;
    }

    // Các hàm getter: cho phép bên ngoài đọc giá trị thuộc tính private
    public String getMaSach() {
        return maSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public double getGiaTien() {
        return giaTien;
    }

    // Giá trị của riêng cuốn này = số lượng x giá tiền
    public double getThanhTien() {
        return soLuong * giaTien;
    }

    // In thông tin một cuốn sách ra màn hình
    public void hienThi() {
        System.out.printf("Mã: %-8s | Tên: %-20s | SL: %-4d | Giá: %,.0f | Thành tiền: %,.0f%n",
                maSach, tenSach, soLuong, giaTien, getThanhTien());
    }
}