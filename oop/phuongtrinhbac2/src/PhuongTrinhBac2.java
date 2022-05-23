public class PhuongTrinhBac2 {
    private double a;
    private double b;
    private double c;

    public PhuongTrinhBac2(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        return Math.pow(b,2) - 4 * a * c;
    }

    public double getRoot1(){

        return -b + Math.sqrt(Math.pow(b ,2)*4*a*c);
    }

    public double getRoot2(){

        return -this.b - Math.sqrt(Math.pow(b ,2)*4*a*c);
    }
}
