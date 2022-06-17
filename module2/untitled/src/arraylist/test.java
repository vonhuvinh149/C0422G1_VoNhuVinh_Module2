package arraylist;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        danhsachsv danhsach = new danhsachsv();
        int luachon = 0;
        do {
            System.out.println("Menu -------------");
            System.out.println(
                    "1 . thêm sinh viên " +
                            "2   . xoá " +
                            "3  . thoát khỏi chương trình");
            luachon = Integer.parseInt(scanner.nextLine());


            switch (luachon) {
                case 1:
                    System.out.println("nhập mả sv ");
                    String ma = scanner.nextLine();
                    System.out.println("nhập tên");
                    String name = scanner.nextLine();
                    System.out.println("nhập ngày sinh");
                    int date = Integer.parseInt(scanner.nextLine());
                    System.out.println("nhập điểm trung bình");
                    double trungbinh = Double.parseDouble(scanner.nextLine());
                    sinhvien sv = new sinhvien(ma, name, date, trungbinh);
                    break;
                case 2 :
                    danhsach.indanhsach();
                    break;

            }
        } while (luachon != 0);
    }

}
