public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle("red", 10);
        Cylinder cylinder1 = new Cylinder("blue", 10, 10);
        System.out.println(cylinder1);
        double theTich1 = cylinder1.theTich();
        System.out.println("Thể tích hình cylinder: " + theTich1 );
    }

}
