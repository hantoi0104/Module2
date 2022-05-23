import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập a: ");
        double a = sc.nextDouble();
        System.out.print("Nhập b: ");
        double b = sc.nextDouble();
        System.out.print("Nhập c: ");
        double c = sc.nextDouble();
        PhuongTrinhBac2 giaipt = new PhuongTrinhBac2(a, b, c);
        if (giaipt.getDiscriminant() == 0)
            System.out.println("Phương trình có nghiệm kép x1 = x1 = " + giaipt.getRoot1());
        else if (giaipt.getDiscriminant() < 0)
            System.out.println("Phương trình vô nghiệm ");
        else System.out.println("Phương trình có 2 nghiêm x1= " + giaipt.getRoot1() + " , x2= " + giaipt.getRoot2());

    }

}
