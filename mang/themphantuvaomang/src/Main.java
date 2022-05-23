import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] arrays = {1, 2, 3, 4, 5, 6, 7, 8};
        Scanner sc = new Scanner(System.in);
        System.out.print(" Nhập vào vị trí phần tử muốn thêm: ");
        int index = sc.nextInt();
        System.out.print(" Nhập vào giá trị thêm vào: ");
        int value = sc.nextInt();
        System.out.print(" mảng ban đầu là: ");
        xuatMang(arrays);
        arrays = themPhanTu(index, value, arrays);
        System.out.print(" mảng sau khi thêm là: ");
        xuatMang(arrays);
    }


    public static int[] themPhanTu(int index, int value, int[] arr) {
        int[] new_array = new int[arr.length + 1];
        for (int i = 0; i < new_array.length; i++) {
            if (i < index)
                new_array[i] = arr[i];
            else if (i == index)
                new_array[i] = value;
            else
                new_array[i] = arr[i - 1];
        }
        return new_array;
    }


    public static void xuatMang(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            System.out.print("\t" + arr[i]);
        System.out.println("\n");

    }

}
