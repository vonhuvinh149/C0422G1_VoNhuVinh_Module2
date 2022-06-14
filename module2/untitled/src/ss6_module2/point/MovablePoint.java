package ss6_module2.point;

public class MovablePoint extends  Point {
     private float xSpeed  ;
     private float ySpeed  ;

     public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
          super(x, y);
          this.xSpeed = xSpeed;
          this.ySpeed = ySpeed;
     }

     public MovablePoint(float xSpeed, float ySpeed) {
          this.xSpeed = xSpeed;
          this.ySpeed = ySpeed;
     }

     public MovablePoint() {
     }

     public float getXSpeed() {
          return xSpeed;
     }

     public void setXSpeed(float xSpeed) {
          this.xSpeed = xSpeed;
     }

     public float getYSpeed() {
          return ySpeed;
     }

     public void setYSpeed(float ySpeed) {
          this.ySpeed = ySpeed;
     }
     public void setSpeed(float xSpeed, float ySpeed){
          this.xSpeed = xSpeed;
     }
     public float[] getSpeed(){
          return new float[]{xSpeed,ySpeed};
     }

     @Override
     public String toString() {
          return "MovablePoint{" +
                  "xSpeed=" + xSpeed +
                  ", ySpeed=" + ySpeed +
                  ", x=" + x +
                  ", y=" + y +
                  '}';
     }
     public MovablePoint move(){
          x += xSpeed;
          y += ySpeed;
          return this;
     }
}
