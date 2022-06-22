package baitap_lamthem;

import java.util.Scanner;

public class TestPT {
    public static void main(String[] args) {
        DanhSachOTo ds1 = new DanhSachOTo();
        DanhSachXeTai ds2 = new DanhSachXeTai();
        DanhSachXeMay ds3 = new DanhSachXeMay();
        Scanner scanner = new Scanner(System.in);
        int luachon;
        int luachon1;

        do {
            System.out.println("------chọn chức năng-------");
            System.out.println(
                    "1. Thêm mới phương tiện. \n" +
                            "2. Hiện thị phương tiện \n" +
                            "3. Xóa phương tiện \n" +
                            "4. Tìm kiếm theo biển kiểm soát \n" +
                            "5. Thoát \n");
            System.out.println("nhập chức năng");
            luachon = Integer.parseInt(scanner.nextLine());
            switch (luachon) {
                case 1:
                    System.out.println("chọn xe muốn thêm");
                    do {
                        System.out.println("chọn loại xe muốn thêm");
                        System.out.println("1.oto \n" +
                                "2.xe tải \n" +
                                "3. xe máy\n" +
                                "0. exit \n");
                        System.out.println("nhập loại xe muốn thêm");
                        luachon1 = Integer.parseInt(scanner.nextLine());
                        if (luachon1 == 1) {
                            System.out.println("nhập thông tin xe oto");
                            System.out.println("nhập biển số");
                            String bienSo = scanner.nextLine();
                            System.out.println("nhập hảng sản xuất");
                            String hangSX = scanner.nextLine();
                            System.out.println("nhập năm sản xuất");
                            String namSX = scanner.nextLine();
                            System.out.println("nhâp tên chủ sở hữu");
                            String name = scanner.nextLine();
                            System.out.println("nhập số chỗ ngồi");
                            String choNgoi = scanner.nextLine();
                            System.out.println("nhập kiểu xe");
                            String kieuXe = scanner.nextLine();
                            OTo oto = new OTo(bienSo, hangSX, namSX, name, choNgoi, kieuXe);
                            ds1.addOTo(oto);
                        }
                        if (luachon1 == 2) {
                            System.out.println("nhập thông tĩne tải");
                            System.out.println("nhập biển số");
                            String bienSo = scanner.nextLine();
                            System.out.println("nhập hảng sản xuất");
                            String hangSX = scanner.nextLine();
                            System.out.println("nhập năm sản xuất");
                            String namSX = scanner.nextLine();
                            System.out.println("nhâp tên chủ sở hữu");
                            String name = scanner.nextLine();
                            System.out.println("nhập tải  trọng");
                            String taiTrong = scanner.nextLine();
                            XeTai xeTai = new XeTai(bienSo, hangSX, namSX, name, taiTrong);
                            ds2.addXT(xeTai);
                        }
                        if (luachon1 == 3) {
                            System.out.println("nhập thông tin xe tải");
                            System.out.println("nhập biển số");
                            String bienSo = scanner.nextLine();
                            System.out.println("nhập hảng sản xuất");
                            String hangSX = scanner.nextLine();
                            System.out.println("nhập năm sản xuất");
                            String namSX = scanner.nextLine();
                            System.out.println("nhâp tên chủ sở hữu");
                            String name = scanner.nextLine();
                            System.out.println("nhập công suất");
                            String congSuat = scanner.nextLine();
                            XeMay xeMay = new XeMay(bienSo, hangSX, namSX, name, congSuat);
                            ds3.addXM(xeMay);
                        }
                    } while (luachon1 != 0);
                    break;
                case 2:
                    /// in thông tin xe
                    do {
                        System.out.println("Chọn loại xe muốn in");
                        System.out.println("1. xe oto \n" +
                                "2. xe tải \n" +
                                "3. xe máy \n" +
                                "0. exit \n");
                        System.out.println("nhập xe muốn in");
                        luachon1 = Integer.parseInt(scanner.nextLine());
                        switch (luachon1) {
                            case 1:
                                ds1.inOTo();
                                break;
                            case 2:
                                ds2.inXT();
                                break;
                            case 3:
                                ds3.inXM();
                                break;
                        }
                    } while (luachon1 != 0);
                    break;
                case 3:
                    // xoá phương tiện
                    System.out.println("nhập biển số xe cần xoá");
                    String bienSo1 = scanner.nextLine();
                        OTo phuongTien = new OTo(bienSo1);
                        XeTai phuongTien1 = new XeTai(bienSo1);
                        XeMay phuongTien2 = new XeMay(bienSo1);
                        System.out.println(" bạn có muốn xoá phương tiện không ");
                        System.out.println("1. yes \n" +
                                "2.No \n");
                        System.out.println("nhập lựa chọn");
                        luachon1 = Integer.parseInt(scanner.nextLine());
                        if (luachon1 == 1) {
                            ds1.xoa(phuongTien);
                            ds2.xoa(phuongTien1);
                            ds3.xoa(phuongTien2);
                            System.out.println(" đã xoá thành công");
                            break;
                        } else if (luachon1 == 2) {
                            break;
                        }
                       break;
                case 4:
                    // tìm kiếm theo biển kiểm soát
                    System.out.println("nhập biển số xe cần tìm");
                    String bienSo2 = scanner.nextLine();
                    ds1.searchOTo(bienSo2);
                    ds2.searchXT(bienSo2);
                    ds3.searchXM(bienSo2);

            }
        } while (luachon != 0);

    }

}
