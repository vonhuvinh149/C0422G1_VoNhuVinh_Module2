package ss6_module2.point;

public class Point {
    protected float x = 1.0f;
    protected float y = 2.0f;

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public float[] getXY(){
        return new float[2];
    }
    public void setXY(float x , float y){
        this.x = x ;
        this.y = y ;
    }
    @Override
    public String toString() {
        return "x=" + x + ", y=" + y ;
    }
}

