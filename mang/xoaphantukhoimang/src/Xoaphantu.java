import java.util.Scanner;

public class Xoaphantu {

    public static void main(String[] args)
    {
        int[] arrays = {11,11,4, 5, 11, 7, 8};
        Scanner sc = new Scanner(System.in);
        System.out.print(" Nhập vào vị trí phần tử muốn xóa: ");
        int index = sc.nextInt();
        arrays = xoaPhanTu(index, arrays);
        System.out.print(" mảng ban đầu là: ");
        xuatMang(arrays);
        System.out.print(" mảng sau khi xóa là: ");
        xuatMang(arrays);

    }

    public static int[] xoaPhanTu(int index, int[] arr)
    {
        int[] new_array = new int[arr.length - 1];
        for (int i = 0; i < arr.length - 1; i++) {
            if (i < index)
                new_array[i] = arr[i];
            else
                new_array[i] = arr[i + 1];

        }

        return new_array;
    }

    public static void xuatMang(int[] arr)
    {
        for (int i = 0; i < arr.length; i++)
            System.out.print("\t" + arr[i]);
        System.out.println("\n");

    }

}
