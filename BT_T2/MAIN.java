import java.util.ArrayList;

public class MAIN {
    public static void main() {
        // tao doi tuong tu lop SACH
        SACH toan = new SACH("S001", "Toan cao cap", "Nguyen Van A", 2022, 10);
        SACH ly = new SACH("S002", "Vat ly dai cuong", "Tran Thi B", 2020, 5);
        SACH hoa = new SACH("S003", "Hoa hoc co ban", "Le Van C", 2019, 8);

        System.out.println("thong tin 1 cuon sach:");
        toan.inthongtin();

        // tao danh sach SACH bang ArrayList
        ArrayList<SACH> danhsach = new ArrayList<>();
        danhsach.add(toan);
        danhsach.add(ly);
        danhsach.add(hoa);

        System.out.println("\ndanh sach co " + danhsach.size() + " cuon sach:");
        for (SACH s : danhsach) {
            s.inthongtin();
        }

        // sua so luong sach co ma S002
        for (SACH s : danhsach) {
            if (s.masach.equals("S002")) {
                s.soluong = 20;
            }
        }

        // xoa sach co ma S001
        for (int i = 0; i < danhsach.size(); i++) {
            if (danhsach.get(i).masach.equals("S001")) {
                danhsach.remove(i);
                break;
            }
        }

        System.out.println("\ndanh sach sau khi sua S002 va xoa S001:");
        for (SACH s : danhsach) {
            s.inthongtin();
        }
    }
}