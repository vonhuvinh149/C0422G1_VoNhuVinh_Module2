package ss18_module2.baitap;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        String regex = "^((\\+84)|0)\\d{9}$";
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số diện thoại");
        String phone = scanner.nextLine();
        boolean marches = phone.matches(regex);
        if (marches) {
            System.out.println("số điện thoại của bạn là : " + phone);
        } else {
            System.out.println("số điện thoại ko hợp lệ");
        }
    }


}
