public class Checksonguyento {

    static boolean check(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i < num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
   public static void main(String[] args) {

    }
    }
}