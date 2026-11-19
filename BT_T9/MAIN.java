public class MAIN {
    public static void main(String[] args) {
        // Tao danh sach 4 cuon sach
        SACH[] ds = new SACH[4];
        ds[0] = new SACHGIAOKHOA("001", "14/11/2026", 20000, 3, "TaDat", "moi");
        ds[1] = new SACHGIAOKHOA("002", "15/11/2026", 30000, 2, "KimDong", "cu");
        ds[2] = new SACHTHAMKHAO("003", "16/11/2026", 50000, 1, "TaDat", 5000);
        ds[3] = new SACHTHAMKHAO("004", "17/11/2026", 70000, 2, "KimDong", 8000);

        // Yeu cau 1: Tinh trung binh cong don gia cac sach tham khao
        double tong = 0;
        int dem = 0;
        for (int i = 0; i < ds.length; i++) {
            if (ds[i] instanceof SACHTHAMKHAO) {
                tong = tong + ds[i].dongia;
                dem = dem + 1;
            }
        }
        if (dem > 0) {
            System.out.println("Trung binh cong don gia sach tham khao: " + tong / dem);
        } else {
            System.out.println("Khong co sach tham khao nao");
        }

        // Yeu cau 2: Xuat ra cac sach giao khoa cua nha xuat ban X
        String x = "TaDat";
        System.out.println("Cac sach giao khoa cua nha xuat ban " + x + ":");
        for (int i = 0; i < ds.length; i++) {
            if (ds[i] instanceof SACHGIAOKHOA && ds[i].nhaxuatban.equalsIgnoreCase(x)) {
                ds[i].in();
                System.out.println("-------------");
            }
        }
    }
}