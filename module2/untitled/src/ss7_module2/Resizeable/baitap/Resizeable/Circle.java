package ss7_module2.Resizeable.baitap.Resizeable;

public class Circle extends Shape {
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * 3.14;
    }

    @Override
    public void resize(double percent) {
        setRadius(getRadius() + getRadius() * percent / 100);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius = " + radius +
                " diện tích hình tròn : " + getArea() +
                '}';
    }
}
