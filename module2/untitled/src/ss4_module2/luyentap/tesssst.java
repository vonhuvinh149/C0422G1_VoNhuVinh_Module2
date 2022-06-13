package ss4_module2.luyentap;

import java.util.Scanner;

public class tesssst {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập chiều rộng");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập chiều dài");
        int b = Integer.parseInt(scanner.nextLine());
       Rectangle rectangle = new Rectangle(a,b);
        System.out.println("chu vi là : "+rectangle.getChuVi());
        System.out.println("diện tích là :" + rectangle.getDienTich());
    }
}
