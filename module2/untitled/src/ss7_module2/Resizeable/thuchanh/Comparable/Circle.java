package ss7_module2.Resizeable.thuchanh.Comparable;

public abstract class Circle {
    private String color ;
    private double radius ;

    public Circle(String color, double radius) {
        this.color = color;
        this.radius = radius;
    }

    public Circle() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "color='" + color + '\'' +
                ", radius=" + radius +
                '}';
    }
}
