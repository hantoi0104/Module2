public class Poin3D extends Poin2D {
    public double z;

    public Poin3D() {
    }

    public Poin3D(double x, double y, float z) {
        super(x, y);
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double[] getXYZ() {
        double[] arr = {x, y, z};
        return arr;
    }

    @Override
    public String toString() {
        return "Poin3D{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}
