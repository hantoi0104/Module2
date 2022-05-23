import java.util.Scanner;
public class Tiente {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("nhap vao tien VND:");
        int vnd = sc.nextInt();
        int usd = vnd*23000;
        System.out.println(vnd +" VND bằng "+usd + " USD");
    }
}
