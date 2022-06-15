package ss7_module2.Resizeable.baitap.Resizeable;

public class Square extends Shape {
    private double longs;

    public double getLongs() {
        return longs;
    }

    public void setLongs(double longs) {
        this.longs = longs;
    }

    public Square() {

    }

    public Square(int longs) {
        this.longs = longs;
    }


    public double getArea() {
        return Math.pow(getLongs(), 2);
    }

    @Override
    public void resize(double percent) {
        super.resize(percent);
        setLongs(getLongs() + getLongs() * percent / 100);
    }


    @Override
    public String toString() {
        return " Square{" +
                " longs=" + longs +
                " diện tích :" + getArea() +
                '}';
    }
}
