import java.util.Scanner;

public class Timphantu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap vao chuoi can kiem tra: ");
        boolean check = false;
        String str = sc.nextLine();
        String[] arr = {"Christian", "Michael", "Camila", "Sienna", "Tanya",
                "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(str)) {
                check = true;
                break;
            }
        }
        if (check) System.out.print(str + " nằm trong mảng " + arr);
        else System.out.print(str + " không nằm trong mảng " + arr);
    }

}
