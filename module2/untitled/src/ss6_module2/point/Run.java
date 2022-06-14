package ss6_module2.point;

public class Run {
    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint();
        System.out.println(movablePoint);
        movablePoint.setSpeed(1, 1);
        System.out.println(movablePoint.move());
    }

}
