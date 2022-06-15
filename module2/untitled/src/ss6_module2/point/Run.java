package ss6_module2.point;

public class Run {
    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint(2,2);
        System.out.println(movablePoint);
        System.out.println(movablePoint.move());
    }
}
