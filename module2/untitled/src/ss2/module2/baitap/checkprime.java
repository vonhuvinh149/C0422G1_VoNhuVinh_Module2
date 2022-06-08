package ss2.module2.baitap;

import java.sql.SQLOutput;
import java.util.Scanner;

public class checkprime {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("nhập số bất kì");
        int a = num.nextInt();
        boolean flag = true ;
        int i;
        if (a < 2) {
            flag = false;
        } else {
            for (i = 2; i < a; i++) {
                if(a % i == 0) {
                    flag = false;
                    break;
                } else {
                    flag = true;
                    break;
                }
            }
        }
        if (flag) {
            System.out.println(a + " là số nguyên tố ");
        } else {
            System.out.println(a + " ko là số nguyên tố");
        }
    }
}
