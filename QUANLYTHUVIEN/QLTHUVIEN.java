import java.util.Scanner;

public class QLTHUVIEN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập mã sách: ");
        String maSach = sc.nextLine();

        System.out.print("NHẬP TÊN SÁCH: ");
        String tenSach = sc.nextLine();

        System.out.print("NHẬP TÁC GIẢ: ");
        String tacGia= sc.nextLine();

        System.out.print("NHẬP NĂM SẢN XUẤT: ");
        int namXuatBan = sc.nextInt();

        System.out.print("NHẬP ĐƠN GIÁ: ");
        double donGia=sc.nextDouble();

        System.out.print("NHẬP SỐ LƯỢNG: ");
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

        System.out.println("\n===== BÀI 1: KIỂM TRA DỮ LIỆU =====");
        boolean hopLe = true;

        if (donGia <= 0) {
            System.out.println("Lỗi: Giá phải lớn hơn 0");
            hopLe = false;
        }
        if (soLuong < 0) {
            System.out.println("Lỗi: Số lượng phải lớn hơn hoặc bằng 0");
            hopLe = false;
        }
        if (namXuatBan < 1900 || namXuatBan > 2026) {
            System.out.println("Lỗi: Năm xuất bản không hợp lệ");
            hopLe = false;
        }
        if (hopLe) {
            System.out.println("Dữ liệu hợp lệ");
        }

        // ===== BÀI 2: PHÂN LOẠI GIÁ =====
        System.out.println("\n===== BÀI 2: PHÂN LOẠI GIÁ =====");
        if (donGia < 50000) {
            System.out.println("Sách giá thấp");
        } else if (donGia <= 100000) {
            System.out.println("Sách giá trung bình");
        } else if (donGia <= 200000) {
            System.out.println("Sách giá cao");
        } else {
            System.out.println("Sách giá đặc biệt");
        }

        // ===== BÀI 3: PHÂN LOẠI TỒN KHO =====
        System.out.println("\n===== BÀI 3: PHÂN LOẠI TỒN KHO =====");
        if (soLuong == 0) {
            System.out.println("Hết sách");
        } else if (soLuong <= 5) {
            System.out.println("Sắp hết");
        } else if (soLuong <= 20) {
            System.out.println("Còn ít");
        } else {
            System.out.println("Còn nhiều");
        }

        // ===== BÀI 4: CHỌN LOẠI SÁCH (switch) =====
        System.out.println("\n===== BÀI 4: LOẠI SÁCH =====");
        System.out.println("1. Sách giáo khoa");
        System.out.println("2. Sách tham khảo");
        System.out.println("3. Sách chuyên ngành");
        System.out.println("4. Sách khác");
        System.out.print("Chọn loại sách (1-4): ");
        int loai = sc.nextInt();

        switch (loai) {
            case 1:
                System.out.println("Bạn chọn: Sách giáo khoa");
                break;
            case 2:
                System.out.println("Bạn chọn: Sách tham khảo");
                break;
            case 3:
                System.out.println("Bạn chọn: Sách chuyên ngành");
                break;
            case 4:
                System.out.println("Bạn chọn: Sách khác");
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ");
        }

        sc.close();
    }
}