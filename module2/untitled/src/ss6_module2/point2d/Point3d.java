package ss6_module2.point2d;

public class Point3d extends Point2 {
    float z = 2.0f;

    public Point3d() {
    }

    public Point3d(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        super.setXY(x, y);
        this.z = z;
    }
    public float[] getXYZ() {
      return new float[]{x,y,z};
    }

    @Override
    public String toString() {
        return super.toString() + " z = " + z;
    }
}
