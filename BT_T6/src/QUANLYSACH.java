import java.util.ArrayList;
import java.util.Scanner;

public class QUANLYSACH {

    static Scanner sc = new Scanner(System.in);

    // Bài 2: danh sách mã sách
    static ArrayList<String> dsMa = new ArrayList<>();

    // Bài 3 + 4: mỗi phần tử là thông tin một cuốn sách, viết liền thành 1 chuỗi:
    // "mã|tên|số lượng|giá"   ví dụ: "S01|Lap trinh Java|5|120000"
    static ArrayList<String> danhSachSach = new ArrayList<>();

    // =====================================================
    //  BÀI 1: Mảng int[] soLuong cho 5 cuốn sách
    // =====================================================
    static void bai1() {
        int[] soLuong = new int[5];

        // Nhập số lượng của 5 cuốn
        for (int i = 0; i < soLuong.length; i++) {
            System.out.print("Nhập số lượng cuốn sách thứ " + (i + 1) + ": ");
            soLuong[i] = Integer.parseInt(sc.nextLine());
        }

        // Hiển thị số lượng
        System.out.println("Số lượng các cuốn sách:");
        for (int i = 0; i < soLuong.length; i++) {
            System.out.println("Cuốn " + (i + 1) + ": " + soLuong[i]);
        }

        // Tính tổng và tìm số lượng lớn nhất
        int tong = 0;
        int max = soLuong[0];
        for (int i = 0; i < soLuong.length; i++) {
            tong = tong + soLuong[i];
            if (soLuong[i] > max) {
                max = soLuong[i];
            }
        }
        System.out.println("Tổng số lượng: " + tong);
        System.out.println("Số lượng lớn nhất: " + max);
    }

    // =====================================================
    //  BÀI 2: ArrayList<String> lưu mã sách
    //  (thêm, hiển thị, tìm, xóa)
    // =====================================================
    static void bai2() {
        int chon;
        do {
            System.out.println("\n--- BÀI 2: QUẢN LÝ MÃ SÁCH ---");
            System.out.println("1. Thêm mã sách");
            System.out.println("2. Hiển thị mã sách");
            System.out.println("3. Tìm mã sách");
            System.out.println("4. Xóa mã sách");
            System.out.println("0. Quay lại");
            System.out.print("Chọn: ");
            chon = Integer.parseInt(sc.nextLine());

            if (chon == 1) {
                System.out.print("Nhập mã sách cần thêm: ");
                String ma = sc.nextLine().trim();
                dsMa.add(ma);
                System.out.println("Đã thêm mã " + ma);

            } else if (chon == 2) {
                if (dsMa.isEmpty()) {
                    System.out.println("Danh sách mã đang trống.");
                } else {
                    for (int i = 0; i < dsMa.size(); i++) {
                        System.out.println((i + 1) + ". " + dsMa.get(i));
                    }
                }

            } else if (chon == 3) {
                System.out.print("Nhập mã cần tìm: ");
                String ma = sc.nextLine().trim();
                int viTri = -1;
                for (int i = 0; i < dsMa.size(); i++) {
                    if (dsMa.get(i).equalsIgnoreCase(ma)) {
                        viTri = i;
                        break;
                    }
                }
                if (viTri == -1) {
                    System.out.println("Không tìm thấy mã " + ma);
                } else {
                    System.out.println("Tìm thấy mã " + ma + " ở vị trí số " + (viTri + 1));
                }

            } else if (chon == 4) {
                System.out.print("Nhập mã cần xóa: ");
                String ma = sc.nextLine().trim();
                int viTri = -1;
                for (int i = 0; i < dsMa.size(); i++) {
                    if (dsMa.get(i).equalsIgnoreCase(ma)) {
                        viTri = i;
                        break;
                    }
                }
                if (viTri == -1) {
                    System.out.println("Không tìm thấy mã " + ma + " để xóa.");
                } else {
                    dsMa.remove(viTri);
                    System.out.println("Đã xóa mã " + ma);
                }

            } else if (chon != 0) {
                System.out.println("Lựa chọn không hợp lệ.");
            }
        } while (chon != 0);
    }

    // =====================================================
    //  BÀI 3: ArrayList<String> danhSachSach
    //  (thêm, hiển thị, tìm, xóa, sửa)
    // =====================================================

    // Tìm vị trí của sách theo mã trong danh sách, không có thì trả về -1
    static int timViTri(String ma) {
        for (int i = 0; i < danhSachSach.size(); i++) {
            String[] p = danhSachSach.get(i).split("\\|"); // tách chuỗi thành các phần
            if (p[0].equalsIgnoreCase(ma)) {
                return i;
            }
        }
        return -1;
    }

    // In một cuốn sách từ chuỗi "mã|tên|số lượng|giá"
    static void inSach(String s) {
        String[] p = s.split("\\|");
        System.out.printf("Mã: %-8s | Tên: %-20s | SL: %-4s | Giá: %,.0f%n",
                p[0], p[1], p[2], Double.parseDouble(p[3]));
    }

    // Thêm sách
    static void themSach() {
        System.out.print("Mã sách: ");
        String ma = sc.nextLine().trim().replace("|", " ");
        if (timViTri(ma) != -1) {
            System.out.println("Mã sách đã tồn tại, không thể thêm.");
            return;
        }
        System.out.print("Tên sách: ");
        String ten = sc.nextLine().trim().replace("|", " ");
        System.out.print("Số lượng: ");
        int soLuong = Integer.parseInt(sc.nextLine());
        System.out.print("Giá tiền: ");
        double gia = Double.parseDouble(sc.nextLine());

        // Ghép 4 thông tin thành 1 chuỗi rồi thêm vào danh sách
        danhSachSach.add(ma + "|" + ten + "|" + soLuong + "|" + gia);
        System.out.println("Đã thêm sách.");
    }

    // Hiển thị sách
    static void hienThiSach() {
        if (danhSachSach.isEmpty()) {
            System.out.println("Danh sách sách đang trống.");
            return;
        }
        for (int i = 0; i < danhSachSach.size(); i++) {
            System.out.print((i + 1) + ". ");
            inSach(danhSachSach.get(i));
        }
    }

    // Tìm sách theo mã
    static void timSach() {
        System.out.print("Nhập mã sách cần tìm: ");
        String ma = sc.nextLine().trim();
        int viTri = timViTri(ma);
        if (viTri == -1) {
            System.out.println("Không tìm thấy sách có mã " + ma);
        } else {
            System.out.println("Đã tìm thấy:");
            inSach(danhSachSach.get(viTri));
        }
    }

    // Xóa sách theo mã
    static void xoaSach() {
        System.out.print("Nhập mã sách cần xóa: ");
        String ma = sc.nextLine().trim();
        int viTri = timViTri(ma);
        if (viTri == -1) {
            System.out.println("Không tìm thấy sách có mã " + ma);
        } else {
            danhSachSach.remove(viTri);
            System.out.println("Đã xóa sách có mã " + ma);
        }
    }

    // Sửa sách theo mã (giữ nguyên mã, nhập lại tên, số lượng, giá)
    static void suaSach() {
        System.out.print("Nhập mã sách cần sửa: ");
        String ma = sc.nextLine().trim();
        int viTri = timViTri(ma);
        if (viTri == -1) {
            System.out.println("Không tìm thấy sách có mã " + ma);
            return;
        }
        System.out.println("Nhập thông tin mới:");
        System.out.print("Tên sách mới: ");
        String ten = sc.nextLine().trim().replace("|", " ");
        System.out.print("Số lượng mới: ");
        int soLuong = Integer.parseInt(sc.nextLine());
        System.out.print("Giá tiền mới: ");
        double gia = Double.parseDouble(sc.nextLine());

        // set(vị trí, giá trị mới): thay phần tử cũ bằng chuỗi mới
        String maGoc = danhSachSach.get(viTri).split("\\|")[0];
        danhSachSach.set(viTri, maGoc + "|" + ten + "|" + soLuong + "|" + gia);
        System.out.println("Đã sửa sách.");
    }

    static void bai3() {
        int chon;
        do {
            System.out.println("\n--- BÀI 3: QUẢN LÝ SÁCH ---");
            System.out.println("1. Thêm sách");
            System.out.println("2. Hiển thị sách");
            System.out.println("3. Tìm sách");
            System.out.println("4. Xóa sách");
            System.out.println("5. Sửa sách");
            System.out.println("0. Quay lại");
            System.out.print("Chọn: ");
            chon = Integer.parseInt(sc.nextLine());

            switch (chon) {
                case 1: themSach(); break;
                case 2: hienThiSach(); break;
                case 3: timSach(); break;
                case 4: xoaSach(); break;
                case 5: suaSach(); break;
                case 0: break;
                default: System.out.println("Lựa chọn không hợp lệ.");
            }
        } while (chon != 0);
    }

    // =====================================================
    //  BÀI 4: Menu hoàn chỉnh (thêm 2 chức năng tính tổng)
    // =====================================================
    static void tongSoLuong() {
        int tong = 0;
        for (int i = 0; i < danhSachSach.size(); i++) {
            String[] p = danhSachSach.get(i).split("\\|");
            tong = tong + Integer.parseInt(p[2]);
        }
        System.out.println("Tổng số lượng sách: " + tong);
    }

    static void tongGiaTri() {
        double tong = 0;
        for (int i = 0; i < danhSachSach.size(); i++) {
            String[] p = danhSachSach.get(i).split("\\|");
            tong = tong + Integer.parseInt(p[2]) * Double.parseDouble(p[3]);
        }
        System.out.printf("Tổng giá trị sách: %,.0f%n", tong);
    }

    static void bai4() {
        int chon;
        do {
            System.out.println("\n========== QUẢN LÝ SÁCH ==========");
            System.out.println("1. Thêm sách");
            System.out.println("2. Hiển thị sách");
            System.out.println("3. Tìm sách");
            System.out.println("4. Xóa sách");
            System.out.println("5. Sửa sách");
            System.out.println("6. Tính tổng số lượng");
            System.out.println("7. Tính tổng giá trị");
            System.out.println("8. Thoát");
            System.out.print("Chọn chức năng: ");
            chon = Integer.parseInt(sc.nextLine());

            switch (chon) {
                case 1: themSach(); break;
                case 2: hienThiSach(); break;
                case 3: timSach(); break;
                case 4: xoaSach(); break;
                case 5: suaSach(); break;
                case 6: tongSoLuong(); break;
                case 7: tongGiaTri(); break;
                case 8: System.out.println("Tạm biệt!"); break;
                default: System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại.");
            }
        } while (chon != 8);
    }

    // =====================================================
    //  main: chọn bài muốn chạy
    // =====================================================
    public static void main(String[] args) {
        int bai;
        do {
            System.out.println("\n===== CHỌN BÀI TẬP =====");
            System.out.println("1. Bài 1: Mảng số lượng");
            System.out.println("2. Bài 2: ArrayList mã sách");
            System.out.println("3. Bài 3: ArrayList thông tin sách");
            System.out.println("4. Bài 4: Menu hoàn chỉnh");
            System.out.println("0. Thoát chương trình");
            System.out.print("Chọn bài: ");
            bai = Integer.parseInt(sc.nextLine());

            switch (bai) {
                case 1: bai1(); break;
                case 2: bai2(); break;
                case 3: bai3(); break;
                case 4: bai4(); break;
                case 0: System.out.println("Kết thúc."); break;
                default: System.out.println("Không có bài này.");
            }
        } while (bai != 0);
    }
}