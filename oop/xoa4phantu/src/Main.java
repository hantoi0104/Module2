
    import java.util.Scanner;

    public class Main {

        public static void main(String[] args)
        {
            int[] arrays = {11,11,4, 5, 11, 7, 8};
            Scanner sc = new Scanner(System.in);
            System.out.print(" mảng ban đầu là: ");
            xuatMang(arrays);
            arrays = xoaPhanTu(arrays);
            System.out.print(" mảng sau khi xóa là: ");
            xuatMang(arrays);

        }

        public static int[] xoaPhanTu( int[] arr)
        {
            int[] new_array = new int[arr.length-4];
            for (int i = 0; i < new_array.length; i++) {
                    new_array[i] = arr[i+2];

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


