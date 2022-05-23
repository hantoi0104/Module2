import java.util.Scanner;

public class Inngay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào tháng cần kiểm tra:");
        byte month = scanner.nextByte();
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.print("Tháng " + month + " có 31 ngày");
                break;
            case 2:
                System.out.print("Tháng 2 có 28 hoặc 29 ngày");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.print("Tháng" + month + " có 30 ngày");
                break;
            default:
                System.out.print("tháng nhập vào bị sai");
                break;
        }
    }
}
