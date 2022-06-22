package luyentap.interface_abstract.date;

import java.util.concurrent.TimeUnit;

public class Date {
    public static void main(String[] args) {


        // thời gian hiện tại
        long t1 = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            System.out.println("test");
        }
        long t2 = System.currentTimeMillis();
        System.out.println("trước khi chạy for " + t1);
        System.out.println("sau khi chạy for " + t2);
        System.out.println("tg : " + (t2 - t1));

        // TimeUnit
        System.out.println("3000 năm = " + TimeUnit.DAYS.toSeconds(3000 * 365));
        System.out.println("23h = " + TimeUnit.HOURS.toSeconds(23));

    }
}
