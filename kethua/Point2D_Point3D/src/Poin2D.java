public class Poin2D {
    public double x;
    public double y;

    public Poin2D() {
    }

    public Poin2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double[] getXY() {
        double[] arr = {x,y};
        return arr;
    }

    @Override
    public String toString() {
        return "poin2D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
