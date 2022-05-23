import java.util.Scanner;

public class Checksonguyento {
    public static void main(String[] args) {
        boolean check = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao num tu ban phim:");
        int num = sc.nextInt();
        if (num < 2)
            check = false;
        for (int i = 2; i < num / 2; i++) {
            if (num % i == 0)
                check = false;

        }
        if (check == true)
            System.out.println(num + " la so nguyen to");
        else System.out.println(num + " Khong phai la so nguyen to");
    }
}
