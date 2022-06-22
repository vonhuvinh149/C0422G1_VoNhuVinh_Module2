package luyentap.interface_abstract.Array;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        // phân tách chuỗi thành mảng
        String s = "xin chào , các bạn";
        String[] a = s.split(" ");
        System.out.println(Arrays.toString(a));
        String[] b = s.split(",");
        System.out.println(Arrays.toString(b));

        // cắt dụa trên dấu chấm và dáu phẩy
        String s2 = "xin chào , mình là lập . trình viên" ;
        String[] c = s2.split("\\.|\\,");
        System.out.println(Arrays.toString(c));

        // cắt phần tử cuối cùng trong mảng
        String s3 = "võ như vinh" ;
        String[] d = s3.split(" ");
        System.out.println(Arrays.toString(d));
        System.out.println("tên : " + d[d.length - 1 ]);


    }
}
