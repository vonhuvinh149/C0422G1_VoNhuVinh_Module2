package ss1_module2.baitap;

import java.util.Scanner;

public class chuyendoitiente {
    public static void main(String[] args) {
        System.out.println("Chuyển Đổi Tiền Tệ USD Sang VNĐ");
        double num, money;
        Scanner ip = new Scanner(System.in);
        System.out.println("Nhập Số Tiền USD Cần Chuyển Đổi");
        num = ip.nextDouble();
        money = num * 23000;
        System.out.println("Giá Trị Tiền Việt Là : " + money + " VNĐ");
    }
}
