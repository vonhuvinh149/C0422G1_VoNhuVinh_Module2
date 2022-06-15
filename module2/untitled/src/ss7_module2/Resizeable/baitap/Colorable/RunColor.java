package ss7_module2.Resizeable.baitap.Colorable;

public class RunColor {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Circle("red" , true , 3);
        shapes[1] = new Circle("yelow" , false, 4);
        for (Shape x: shapes) {
            System.out.println(x);
        }
    }



}
