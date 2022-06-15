package ss7_module2.Resizeable.baitap.Resizeable;

public class RunGeometry {
    public static void main(String[] args) {
        Shape[] shape = new Shape[3];
        shape[0] = new Circle(3);
        shape[1] = new ReTangLe(3, 4);
        shape[2] = new Square(3);
        for (Shape x : shape) {
            System.out.println(x);
        }
        for (Shape y : shape) {
            if (y instanceof Circle) {
                ((Circle) y).resize(50);
            } else if (y instanceof ReTangLe){
                ((ReTangLe) y).resize(40);
            }else{
                ((Square) y).resize(30);
            }
        }
        for (Shape z: shape) {
            System.out.println(z);
        }

    }
}
