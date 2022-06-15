package ss7_module2.Resizeable.baitap.Colorable;

public class Circle extends Shape{
    private double radius ;

    public Circle() {

    }
    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return Math.pow(radius,2) * 3.14;
    }

    @Override
    public String toString() {
        return "Circle{" + super.toString()+
                "radius=" + radius +
                '}';
    }
}
