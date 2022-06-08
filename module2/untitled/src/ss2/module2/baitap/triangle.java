package ss2.module2.baitap;

import java.sql.SQLOutput;
import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {
        displayMenu();
    }

    public static void displayMenu() {
        boolean flag = true;
        do {
            System.out.println("all hình" +
                    "\n 1.hình chữ nhật" +
                    "\n 2.hình tam giác vuông" +
                    "\n 3.hình tam giác vuông ngược" +
                    "\n 4.hình tam giác vuông (right)" +
                    "\n 5.hình tam giác vuông đảo ngược(right)" +
                    "\n 6.hình tam giác cân" +
                    "\n 7.exit");
            Scanner m = new Scanner(System.in);
            System.out.println("chọn hình muốn in");
            int n = m.nextInt();
            int i;
            int j;
            int k;
            switch (n) {
                case 1:
                    // hình chữ nhật
                    System.out.println("nhập chiều rộng hình chữ nhật");
                    int a = m.nextInt();
                    System.out.println("nhập chiều dài hình chữ nhật3");
                    int b = m.nextInt();
                    for (i = 0; i < a; i++) {
                        for (j = 0; j < b; j++) {
                            System.out.print(" * ");
                        }
                        System.out.println("\n");
                    }
                    break;
                case 2:
                    // tam giác vuông
                    System.out.println("nhập chiều cao hình tam giác");
                    int h = m.nextInt();
                    for (i = 0; i < h; i++) {
                        for (j = 0; j <= i; j++) {
                            System.out.print(" * ");
                        }
                        System.out.print("\n");
                    }
                    break;
                case 3:
                    // tam giác vuông ngược
                    System.out.println("nhập chiều cao");
                    h = m.nextInt();
                    System.out.println("tam giác vuông đảo ngược");
                    for (i = h; i >= 1; i--) {
                        for (j = 0; j < i; j++) {
                            System.out.print(" * ");
                        }
                        System.out.print("\n");
                    }
                    break;
                case 4:
                    System.out.println("nhập chiều cao");
                    h = m.nextInt();
                    for (i = h; i > 0; i--) {
                        for (k = 0; k < i; k++) {
                            System.out.print("   ");
                        }
                        for (j = 5 - i; j > 0; j--) {
                            System.out.print(" * ");
                        }
                        System.out.print("\n");
                    }
                    break;
                case 5:
                    System.out.println("nhập chiều cao");
                    h = m.nextInt();
                    for (i = 0; i < h; i++) {
                        for (k = 0; k < i; k++) {
                            System.out.print("   ");
                        }
                        for (j = h - i; j > 0; j--) {
                            System.out.print(" * ");
                        }
                        System.out.print("\n");

                    }
                    break;

                case 6:
                    // in tam giác cân
                    System.out.println("nhập chiều cao");
                    h = m.nextInt();
                    System.out.println("tam giác cân");
                    for (i = 0; i <= h; i++) {
                        for (k = h; k > i; k--) {
                            System.out.print("   ");
                        }
                        for (j = 0; j < 2 * i - 1; j++) {
                            System.out.print(" * ");
                        }
                        System.out.print("\n");
                    }
                    break;
                default:
                    System.out.println("exit");
                    flag = false;
            }
        } while (flag);
    }
}
