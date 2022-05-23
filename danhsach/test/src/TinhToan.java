public class TinhToan {
    public  static int c=2;
    public static int d=10;
    private int a;
    private int b;

    public TinhToan() {
    }

    public TinhToan(int a, int b, int c, int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int sum1(){
        return a+b;
    }

    public static int Sum(){
        return c+d;
    }
}
