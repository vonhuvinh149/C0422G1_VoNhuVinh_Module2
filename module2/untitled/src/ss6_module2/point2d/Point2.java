package ss6_module2.point2d;

public class Point2 {
    protected float x = 1.0f , y = 1.1f;

    public Point2(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Point2() {

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

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float[] getXY() {
   return new float[]{x,y};
    }

    @Override
    public String toString() {

        return     "x=" + x +", y=" + y ;

    }
}
