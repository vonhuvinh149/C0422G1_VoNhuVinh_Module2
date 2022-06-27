package luyentap.interface_abstract.quanli_sinhvien;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int luaChon;
        DanhSachSV dssv = new DanhSachSV();

        do {
            System.out.println("--------Menu---------");
            System.out.println("1.thêm sinh viên vào danh sách" + "\n" +
                    "2. in danh sách sinh viên ra màng hình" + "\n" +
                    "3. kiểm tra danh sách có rỗng hay k" + "\n" +
                    "4. lấy ra số lượng sinh viên trong danh sách" + "\n" +
                    "5. làm rỗng danh sách sinh viên" + "\n" +
                    "6. kiểm tra sinh viên có tồn tại trong danh sách hay ko dựa trên mả sinh viên" + "\n" +
                    "7. xoá 1 sinh viên ra khỏi danh sách dựa trên mả sinh viên" + "\n" +
                    "8. tìm kiểm tất cả sinh viên dựa trên tên và nhập từ bàn phím" + "\n" +
                    "9 . xuất ra danh sách sinh viên có điểm từ cao đến thấp);" + "\n" +
                    "10. lưu danh sách sinh viên xuống tập tin\n"+
                    "0. exit");
            System.out.println("lựa chọn chức năng");
            luaChon = Integer.parseInt(sc.nextLine());
            switch (luaChon) {
                // thêm sinh viên vào danh sách
                case 1:
                    System.out.println("nhập mả sinh viên");
                    String id = sc.nextLine();
                    System.out.println("nhập tên sinh viên");
                    String name = sc.nextLine();
                    System.out.println("nhập ngày sinh");
                    int date = Integer.parseInt(sc.nextLine());
                    System.out.println("nhâp điểm trung bình ");
                    double trungBinh = Double.parseDouble(sc.nextLine());
                    SinhVien sv = new SinhVien(id, name, date, trungBinh);
                    dssv.add(sv);
                    break;
                case 2:
                    // in ra sach sách sinh viên
                    System.out.println("danh sách sinh viên");
                    dssv.inDSSV();
                    break;
                case 3:
                    // danh sách sinh viên có rỗng hay k
                    System.out.println(dssv.kiemtra()?"danh sách rỗng":"danh sách ko rỗng");
                    break;
                case 4:
                    // in ra số lượng sinh viên tron danh sách
                    System.out.println("số lượng sinh viên trong danh sách "+dssv.laySoLuong());
                    break;
                case 5:
                    // làm rỗng danh sách sinh viên
                    dssv.lamRongDanhSach();
                    break;
                case 6:
                    // kiểm tra sinh viên có tônd tại trong danh sách hay không dựa trên mả sinh viên
                    System.out.println("nhập mả sinh viên");
                    String maSinhVien = sc.nextLine();
                    SinhVien sinhvien= new SinhVien(maSinhVien);
                    System.out.println("kiểm tra danh sách sinh viên có tồn tại " + dssv.kiemTraTonTai(sinhvien));
                    break;
                case 7:
                    // xoá snh viên theo id
                    System.out.println("nhập mả sinh viên");
                    String masinhvien = sc.nextLine();
                    SinhVien sinhvien1 = new SinhVien(masinhvien);
                    System.out.println("xoá sinh viên theo danh sách" + dssv.xoaSinhVien(sinhvien1));
                    break;
                case 8:
                    // tìm kiếm sinh viên theo tên
                    System.out.println("nhập tên");
                    String name1 = sc.nextLine();
                    System.out.println("kết quả tìm kiếm");
                    dssv.timSinhVien(name1);
                    break;
                case 9:
                    dssv.sapXep();
                    dssv.inDSSV();
            }
        } while (luaChon != 0);
    }
}
