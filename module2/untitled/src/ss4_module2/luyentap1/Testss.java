package ss4_module2.luyentap1;

import java.util.Scanner;

public class Testss {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập a");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập b");
        int b = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập c");
        int c = Integer.parseInt(scanner.nextLine());
        PhuongTrinhBacHai d = new PhuongTrinhBacHai(a,b,c);
        System.out.println("delta = "+ d.getDelta());
        if (d.getDelta() < 0){
            System.out.println("phương trình vô nghiệm");
        }else if (d.getDelta() == 0 ){
            System.out.println("phương trình có  nghiệm kép x1 = x2 = " + d.getRoo1());
        }else{
            System.out.println("phương trình có 2 nghiệm phân biệt");
            System.out.println("x1 = "+ d.getRoot2());
            System.out.println("x2 = "+ d.getRoot3());
        }
    }
}
