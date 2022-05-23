import java.util.Scanner;

public class Main {

    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double fahrenheit;
        double celsius;
        int choice;

        do {
            System.out.println("Menu.");
            System.out.println("1. Chuyển F --> C");
            System.out.println("2. Chuyển C --> F");
            System.out.println("0. Exit");
            System.out.print("Nhập vào chức năng bạn muốn chuyển đổi: ");
            choice = input.nextInt();

            switch (choice) {
                case 1: {
                    System.out.println("Bạn đã chọn chức năng chuyển độ F --> C: ");
                    System.out.print("Nhập vào độ F: ");
                    fahrenheit = input.nextDouble();
                    System.out.println( "Kết quả -->  " + fahrenheit + " độ F bằng " + fahrenheitToCelsius(fahrenheit) + " độ C");
                    break;
                }
                case 2: {
                    System.out.println("Bạn đã chọn chức năng chuyển độ C --> F: ");
                    System.out.print("Nhập vào độ C: ");
                    celsius = input.nextDouble();
                    System.out.println( "Kết quả -->  " + celsius + " độ C bằng " + celsiusToFahrenheit(celsius) + " độ F");
                    break;
                }
                case 0:
                    System.exit(0);
            }
        }
        while (choice != 0);
    }

}