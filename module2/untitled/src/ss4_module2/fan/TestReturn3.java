package ss4_module2.fan;

public class TestReturn3 {
    public static void main(String[] args) {
        Fan  fan = new Fan();
        fan.setSpeed(5);
        fan.setRadius(10);
        fan.setColor("red");
        fan.setOn(true);
        System.out.println(fan.toString());

    }

}
