import java.util.Scanner;

public class Giaiptb1 {
    public static void main(String[] args) {
        System.out.println("Giai pt bac 1");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập a:");
        float a= scanner.nextFloat();
        System.out.println("nhập b:");
        float b = scanner.nextFloat();
        if(a==0 && b==0){
            System.out.println("Phương trình vô số nghiệm");
        }
        else if(a==0 && b!=0 ){
            System.out.println("Phương trình vô nghiệm");
        }
        else System.out.printf(" nghiệm của phương trình là x1=%f", (-b/a) );
    }
}