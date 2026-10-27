import java.util.Scanner;

public class QLTHUVIEN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập mã sách: ");
        String maSach = sc.nextLine();

        System.out.print("NHẬP TÊN SÁCH");
        String tenSach = sc.nextLine();

        System.out.print("NHẬP TÁC GIẢ");
        String tacGia= sc.nextLine();

        System.out.print("NHẬP NĂM SẢN XUẤT");
        String namXuatBan = sc.nextLine();

        System.out.print("NHẬP ĐƠN GIÁ");
        double donGia=sc.nextDouble();

        System.out.print("NHẬP SỐ LƯỢNG");
        int soLuong=sc.nextInt();


        double thanhTien = donGia * soLuong;
        double phiVanChuyen = thanhTien * 0.05;
        double tongTienNhap = thanhTien + phiVanChuyen;

        System.out.println("\n===== THÔNG TIN SÁCH =====");
        System.out.println("Mã sách       : " + maSach);
        System.out.println("Tên sách      : " + tenSach);
        System.out.println("Tác giả       : " + tacGia);
        System.out.println("Năm xuất bản  : " + namXuatBan);
        System.out.println("Đơn giá       : " + donGia);
        System.out.println("Số lượng      : " + soLuong);
        System.out.println("Thành tiền    : " + thanhTien);
        System.out.println("Phí vận chuyển: " + phiVanChuyen);
        System.out.println("Tổng tiền nhập: " + tongTienNhap);

        sc.close();
    }
}
