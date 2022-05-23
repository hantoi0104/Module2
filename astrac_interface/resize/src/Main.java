public class Main {


    public static void main(String[] args) {
        Shape circle1 = new Circle("red", true,10);
        Shape recTangle1 = new Rectangle("red", true, 10,10);
        Shape square1 = new Square("red", true, 10) ;
        Shape[] array_Shape = { circle1, recTangle1,square1};
        System.out.println("---Diện tích cách hình trước khi thay đổi");
        xuatDienTich(circle1,recTangle1,square1);
        System.out.println("---Diện tích cách hình sau khi thay đổi");
        chance(circle1,recTangle1,square1);
        xuatDienTich(circle1,recTangle1,square1);

    }

    public static void xuatDienTich(Shape circle, Shape recTangle, Shape square){
        System.out.println("Diện tích circle 1: " + circle.dienTich());
        System.out.println("Diện tích rectangle1 : " + recTangle.dienTich());
        System.out.println("Diện tích square 1: " + square.dienTich());
    }
    public static void chance(Shape circle, Shape reTangle, Shape square){
        ((Circle)circle).reSize(Math.random());
        System.out.println(((Circle) circle).getRadius());
        ((Rectangle)reTangle).reSize(Math.random());
        System.out.println(((Rectangle) reTangle).getWidth());
        ((Square)square).reSize(Math.random());
        System.out.println(((Square) square).getSide());

    }
}
