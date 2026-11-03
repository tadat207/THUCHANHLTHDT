import java.util.Scanner;

public class QUANLYSACH {

    // Các mảng lưu thông tin sách: vị trí i của mỗi mảng là của cùng một cuốn sách
    static String[] maSach;
    static String[] tenSach;
    static int[] soLuong;
    static double[] giaTien;
    static int n = 0; // số sách hiện có

    static Scanner sc = new Scanner(System.in);

    // ===== Bài 1: Nhập n sách bằng vòng lặp =====
    static void nhapSach() {
        System.out.print("Nhập số lượng đầu sách n: ");
        n = Integer.parseInt(sc.nextLine());

        // Tạo các mảng có đúng n phần tử
        maSach = new String[n];
        tenSach = new String[n];
        soLuong = new int[n];
        giaTien = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("--- Sách thứ " + (i + 1) + " ---");
            System.out.print("Mã sách: ");
            maSach[i] = sc.nextLine();
            System.out.print("Tên sách: ");
            tenSach[i] = sc.nextLine();
            System.out.print("Số lượng: ");
            soLuong[i] = Integer.parseInt(sc.nextLine());
            System.out.print("Giá tiền: ");
            giaTien[i] = Double.parseDouble(sc.nextLine());
        }
        System.out.println("Đã nhập xong " + n + " cuốn sách.");
    }

    // Hiển thị danh sách sách
    static void hienThiSach() {
        if (n == 0) {
            System.out.println("Danh sách đang trống, hãy chọn 1 để nhập sách.");
            return;
        }
        for (int i = 0; i < n; i++) {
            System.out.println("Mã: " + maSach[i] + " | Tên: " + tenSach[i]
                    + " | SL: " + soLuong[i] + " | Giá: " + giaTien[i]);
        }
    }

    // ===== Bài 2: Tính tổng số lượng và tổng giá trị =====
    static void tinhTong() {
        int tongSoLuong = 0;
        double tongGiaTri = 0;

        for (int i = 0; i < n; i++) {
            tongSoLuong = tongSoLuong + soLuong[i];
            tongGiaTri = tongGiaTri + soLuong[i] * giaTien[i];
        }
        System.out.println("Tổng số lượng sách: " + tongSoLuong);
        System.out.println("Tổng giá trị sách: " + tongGiaTri);
    }

    // ===== Bài 4: Tìm sách theo mã =====
    static void timTheoMa() {
        System.out.print("Nhập mã sách cần tìm: ");
        String ma = sc.nextLine();

        boolean timThay = false;
        for (int i = 0; i < n; i++) {
            if (maSach[i].equalsIgnoreCase(ma)) {
                System.out.println("Đã tìm thấy:");
                System.out.println("Mã: " + maSach[i] + " | Tên: " + tenSach[i]
                        + " | SL: " + soLuong[i] + " | Giá: " + giaTien[i]);
                timThay = true;
                break;
            }
        }
        if (timThay == false) {
            System.out.println("Không tìm thấy sách có mã: " + ma);
        }
    }

    // ===== Bài 3: Menu lặp đến khi chọn Thoát =====
    public static void main(String[] args) {
        int chon;
        do {
            System.out.println("\n========== QUẢN LÝ SÁCH ==========");
            System.out.println("1. Nhập danh sách sách");
            System.out.println("2. Hiển thị danh sách");
            System.out.println("3. Tính tổng số lượng và tổng giá trị");
            System.out.println("4. Tìm sách theo mã");
            System.out.println("0. Thoát");
            System.out.print("Chọn chức năng: ");
            chon = Integer.parseInt(sc.nextLine());

            switch (chon) {
                case 1: nhapSach(); break;
                case 2: hienThiSach(); break;
                case 3: tinhTong(); break;
                case 4: timTheoMa(); break;
                case 0: System.out.println("Tạm biệt!"); break;
                default: System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại.");
            }
        } while (chon != 0);
    }
}