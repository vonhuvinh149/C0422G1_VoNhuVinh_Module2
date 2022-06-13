package ss5.baitap.Circle;

import java.util.Scanner;

public class Circle {
    private double radius;
    private String color;

    public Circle() {

    }
    public Circle(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return Math.pow(this.radius, 2) * 3.14;
    }
    public void getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập bán kính");
         radius = Double.parseDouble(scanner.nextLine());
        System.out.println("nhập màu");
         color = scanner.nextLine();
    }
    public void showCircle() {
        System.out.println("bán kính " + this.radius);
        System.out.println("màu : " + this.color);
        System.out.println("diện tích hình tròn: " + getArea());
    }
}
