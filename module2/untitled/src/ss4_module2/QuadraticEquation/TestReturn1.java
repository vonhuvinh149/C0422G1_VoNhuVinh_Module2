package ss4_module2.QuadraticEquation;

import java.util.Scanner;
public class TestReturn1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số a : ");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập số b : ");
        int b = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập số c : ");
        int c = Integer.parseInt(scanner.nextLine());
        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        System.out.println(" quadraticEquation "+ quadraticEquation.getDiscriminant());
        if ( quadraticEquation.getDiscriminant() < 0){
            System.out.println("phương trình cô nghiệm :");
        }else if(quadraticEquation.getDiscriminant() == 0){
            System.out.println("x1= x2 = "+ (- quadraticEquation.getB() / 2*a ));
        }else {
            System.out.println("phương trình có 2 nghiệm phân biệt :" );
            System.out.println("x1 = "+ quadraticEquation.getRoot1() );
            System.out.println("x2 = "+ quadraticEquation.getRoot2() );
        }

    }
}
