package ss7_module2.Resizeable.baitap.Resizeable;

public class ReTangLe extends Shape {
    private double width;
    private double height;

    public ReTangLe() {
    }

    public ReTangLe(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return height * width;
    }

    @Override
    public void resize(double percent) {
        setHeight(getHeight() + getHeight() * percent / 100);
        setWidth(getWidth() + getWidth() * percent / 100);
    }

    @Override
    public String toString() {
        return "Circle{" +
                " width = " + width +
                ", height = " + height +
                ", diện tích : " + getArea() +
                '}';
    }
}
