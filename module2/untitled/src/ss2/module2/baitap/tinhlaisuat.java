package ss2.module2.baitap;

import java.util.Scanner;

public class tinhlaisuat {
    public static void main(String[] args) {
        Scanner lai = new Scanner(System.in);
        System.out.println("nhập só tiền cho vay");
        double a = lai.nextDouble();
        System.out.println("nhập tỉ lệ lãi xuất");
        double b = lai.nextDouble();
        System.out.println("nhập số tháng cho vay");
        int c = lai.nextInt();
        double sum = 0;
        if (c <= 12) {
            sum = a * b / 12 * c;
            if (c <= 9) {
                sum = a * b / 12 * c;
                if (c <= 6) {
                    sum = a * b / 12 * c;
                }
            }
        }
        else {
            System.out.println("thu hồi tài sản");
        }
        System.out.println("số tiền lãi thu được : " + sum);

    }
}
