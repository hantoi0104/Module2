import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Nhập vào chiều rộng: ");
        float width = sc.nextFloat();
        System.out.print(" Nhập vào chiều cao: ");
        float height = sc.nextFloat();
        Rectangle chuNhat1 = new Rectangle(width, height);
        System.out.println(" Diện tích hình chú nhật là: " + chuNhat1.getArea());
        System.out.println(" Chu vi hình chú nhật là: " + chuNhat1.getPerimeter());
        System.out.println("---> Vẽ hình chữ nhật là: " );
        chuNhat1.display();
    }
}
