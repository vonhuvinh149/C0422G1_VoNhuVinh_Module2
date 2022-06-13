package ss5.baitap.Circle;

import ss5.baitap.Circle.Circle;

import java.util.Scanner;

public class TestCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số lượng hình tròn cần tính ");
        int length = Integer.parseInt(scanner.nextLine());
        Circle[] circle = new Circle[length];
        for (int i = 0; i < circle.length; i++) {
            System.out.println("hình tròn thứ " + (i + 1));
            circle[i] = new Circle();
            circle[i].getInput();
            circle[i].showCircle();
        }
    }

}
