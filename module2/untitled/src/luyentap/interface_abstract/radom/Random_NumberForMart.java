package luyentap.interface_abstract.radom;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Random_NumberForMart {
    /*
     *một người chơi sẽ có tài khoản . người chơi có quyền đặt cược số tiền ít hơn số tiền họ đang có
     * có 3 viên xúc sắc . mỗi lần ta sẽ ra một kết quả
     * Mỗi vien xúc sắc có 6 mặt từ 1 đến 6
     */
    public static void main(String[] args) {
        double taiKhoangNguoiChoi = 5000;
        Scanner scanner = new Scanner(System.in);
        Locale lc = new Locale("vi", "VN");
        NumberFormat numf = NumberFormat.getCurrencyInstance(lc);

        int luachon = 1;
        do {
            System.out.println("mời bạn lựa chọn");
            System.out.println("1 - tiếp tục chơi");
            System.out.println("2 - exit");
            luachon = Integer.parseInt(scanner.nextLine());
            if (luachon == 1) {
                System.out.println("bắt đàu chơi");
                System.out.println("tài khoản của bạn là : " + numf.format(taiKhoangNguoiChoi) + " nhập số tiề cược");
                double datCuoc = 0;
                do {
                    System.out.println("đặt cược lớn 0 < số iền cược <= " + taiKhoangNguoiChoi);
                    datCuoc = Double.parseDouble(scanner.nextLine());
                } while (datCuoc <= 0 || datCuoc > taiKhoangNguoiChoi);
                int luachontaixiu;
                do {
                    System.out.println("1- tài <--> 2- xỉu");
                    luachontaixiu = Integer.parseInt(scanner.nextLine());
                } while (luachontaixiu != 1 && luachontaixiu != 2);

                Random xucxac1 = new Random();
                Random xucxac2 = new Random();
                Random xucxac3 = new Random();


                int gaitri1 = xucxac1.nextInt(5) + 1;
                int gaitri2 = xucxac2.nextInt(5) + 1;
                int gaitri3 = xucxac3.nextInt(5) + 1;
                int tong = gaitri1 + gaitri2 + gaitri3;
                System.out.println(gaitri1);
                System.out.println(gaitri2);
                System.out.println(gaitri3);
                System.out.println(tong);
                if (tong == 3 || tong == 18) {
                    System.out.println("bạn đã thua");
                    taiKhoangNguoiChoi -= datCuoc;
                    System.out.println("tai khoan cua ban la " + taiKhoangNguoiChoi);
                } else if (tong >= 4 && tong <= 10) {
                    System.out.println("xỉu");
                    if (luachon == 2) {
                        System.out.println("bạn đã thắng");
                        taiKhoangNguoiChoi += datCuoc;
                        System.out.println("tài khoản của bạn là " + taiKhoangNguoiChoi);
                    } else {
                        System.out.println("bạn đã thua");
                        taiKhoangNguoiChoi -= datCuoc;
                        System.out.println("tài khoản của bạn là " + taiKhoangNguoiChoi);
                    }
                } else {
                    if (luachon == 1) {
                        System.out.println("bạn đã thắng");
                        taiKhoangNguoiChoi += datCuoc;
                        System.out.println("tài khoản của bạn là " + taiKhoangNguoiChoi);
                    } else {
                        System.out.println("bạn đã thua");
                        taiKhoangNguoiChoi -= datCuoc;
                        System.out.println("tài khoản của bạn là " + taiKhoangNguoiChoi);
                    }
                }
            }
        } while (luachon != 1);
    }

}
