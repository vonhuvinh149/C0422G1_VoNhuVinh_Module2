package luyentap.interface_abstract.on_tap;



import java.util.Scanner;

public class TestSV {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DanhSachSV ds = new DanhSachSV();
        int luaChon;
        do {
            System.out.println("----Menu----");
            System.out.println(" 1. thêm sinh viên vào danh sách\n" +
                    "  2. in danh sách sinh viên ra màng hình\n" +
                    "  3. kiểm tra danh sách có rỗng hay k\n" +
                    "  4. lấy ra số lượng sinh viên trong danh sách\n" +
                    "  5. làm rỗng danh sách sinh viên\n" +
                    "  6. kiểm tra sinh viên có tồn tại trong danh sách hay ko dựa trên mả sinh viên\n" +
                    "  7. xoá 1 sinh viên ra khỏi danh sách dựa trên mả sinh viên\n" +
                    "  8. tìm kiểm tất cả sinh viên dựa trên tên và nhập từ bàn phím\n" +
                    "  9. xuất ra danh sách sinh viên có điểm từ cao đến thấp "+
                    "  0. exit");
            System.out.println("chọn chức năng");
            luaChon = Integer.parseInt(scanner.nextLine());
            switch (luaChon){
                case 1:
                    // thêm mới 1 sinh viên
                    System.out.println("nhập thông tin sinh viên");
                    System.out.println("nhập mả sinh viên");
                    String id = scanner.nextLine();
                    System.out.println("nhập tên sinh viên");
                    String name = scanner.nextLine();
                    System.out.println("nhập năm sinh");
                    int year = Integer.parseInt(scanner.nextLine());
                    System.out.println("nhập diểm trung bình");
                    double diemTrungBinh = Double.parseDouble(scanner.nextLine());
                    SinhVien1 sv1 = new SinhVien1(id , name ,year , diemTrungBinh);
                    ds.addSV(sv1);
                    break;
                case 2:
                    ds.inSV();
                    break;
                case 3:
                    System.out.println(ds.kiemTra()?"danh sách  rỗng":"danh sách không rỗng");
                    break;
                case 4:
                    ds.soLuong();
                    break;
                case 5:
                    ds.xoaAll();
                    break;
                case 6:
                    System.out.println("nhập id muốn kiểm tra");
                    String id1 = scanner.nextLine();
                    SinhVien1 sv = new SinhVien1(id1);
                    System.out.println(ds.check(sv)?"có trong danh sách":"không có trong dnah sách");
                    break;
                case 7:
                    System.out.println("nhập mả sinh viên cần xáo");
                    String id2 = scanner.nextLine();
                    sv = new SinhVien1(id2);
                    ds.xoa1(sv);
                    break;
                case 8:
                    // tìm theo tên
                    System.out.println("nhập tên cần tìm");
                    name = scanner.nextLine();
                    ds.timTheoTen(name);
                    break;
                case 9:
                    ds.sapXep();
            }
        } while (luaChon != 0);
    }
}
