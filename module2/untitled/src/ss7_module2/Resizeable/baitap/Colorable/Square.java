package ss7_module2.Resizeable.baitap.Colorable;

public class Square extends Shape {

    private double longs ;

    public Square( String color,boolean filled ,double longs) {
       super(color ,filled);
        this.longs = longs;
    }


    public double getLongs() {
        return longs;
    }

    public void setLongs(int longs) {
        this.longs = longs;
    }

    public Square() {
    }
public int getArea(){
        return (int) Math.pow(longs,2);
}

@Override
    public String toString() {
        return "Square{" + super.toString()+
                "longs=" + longs +
                '}';
    }
}
