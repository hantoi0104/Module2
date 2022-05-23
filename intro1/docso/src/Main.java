import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    static String read1(int num) {

        switch (num) {
            case 0:
                return "zero";

            case 1:
                return "one";

            case 2:
                return "two";

            case 3:
                return "three";

            case 4:
                return "four";

            case 5:
                return "five";

            case 6:
                return "six";

            case 7:
                return "seven";

            case 8:
                return "eight";

            case 9:
                return "nine";

        };

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào sô cần đọc:");
        int so = sc.nextInt();
        if (so < 10 && so >= 0) {
            read1(so);
        }
    }
}



