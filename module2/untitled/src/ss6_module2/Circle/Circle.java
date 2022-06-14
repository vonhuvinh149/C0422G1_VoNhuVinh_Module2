package ss6_module2.Circle;

import java.util.Scanner;

public class Circle {
    private String color;
    private double darius;
    Scanner scanner = new Scanner(System.in);

    public Circle() {

    }

    public Circle(String color, double darius) {
        this.color = color;
        this.darius = darius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getDarius() {
        return darius;
    }

    public void setDarius(double darius) {
        this.darius = darius;
    }
    public double getArea(){
        return Math.pow(darius,2) * 3.14 ;
    }
    public void getInput() {
        System.out.println("màu sắc ");
        this.color = scanner.nextLine();
        System.out.println("nhập bán kính hình tròn ");
        this.darius = Double.parseDouble(scanner.nextLine());

    }

    @Override
    public String toString() {
        return "màu: " + this.color + '\n' + "darius: " + this.darius + '\n'+ "diện tích hình tròn : "+ getArea() ;
    }
}
