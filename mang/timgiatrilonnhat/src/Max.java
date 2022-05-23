public class Max {
    public static void main(String[] args) {
        int[] arr = { 1,2,9,3,4,5,6,7,8 };
        int Max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] >= Max)
                Max=arr[i];
        }
        System.out.println("Phần tử lớn nhất trong mảng là: "+ Max);
    }
}
