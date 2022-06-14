package ss6_module2.point2d;

import java.util.Arrays;

public class TestPoint {
    public static void main(String[] args) {
        Point3d point3d = new Point3d() ;
        System.out.println("float = "+Arrays.toString( point3d.getXYZ()));
        System.out.println(point3d);
    }
}
