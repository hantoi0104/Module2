import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Nhanvien[] arr = new Nhanvien[0];
        int choice = -1;
        Scanner sc = new Scanner(System.in);
        while (choice != 0) {
            firstShow();
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    arr = add(Nhapnhanvien(), arr);
                    display(arr);
                    break;
                case 2:
                case 3:
                case 4:
                case 5:
                    System.exit(0);
            }
        }
    }

    public static Nhanvien Nhapnhanvien() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập ID nhân viên: ");
        byte id = sc.nextByte();
        sc.nextLine();
        System.out.print("Nhập tên nhân viên: ");
        String name = sc.nextLine();
        System.out.print("Nhập tuôi nhân viên: ");
        byte age = sc.nextByte();
        sc.nextLine();
        System.out.print("Nhập địa chỉ nhân viên: ");
        String address = sc.nextLine();
        Nhanvien nhanvien0 = new Nhanvien(id, name, age, address);
        return nhanvien0;
    }

    public static void firstShow() {
        System.out.println("Menu");
        System.out.println("1. Thêm");
        System.out.println("2. Sửa");
        System.out.println("3. Xóa");
        System.out.println("4. Hiển thị");
        System.out.println("5. Thoát");
        System.out.print("Enter your choice: ");
    }

    public static Nhanvien[] add(Nhanvien a, Nhanvien[] arr) {
        Nhanvien[] new_array = new Nhanvien[arr.length + 1];
        if (arr.length == 0) {
            new_array[0] = a;
            return new_array;
        }
        else {
            for (int i = 0; i < new_array.length; i++) {
                if (i < arr.length)
                    new_array[i] = arr[i];
                else new_array[i] = a;
            }
            return new_array;
        }

    }


    public static void display(Nhanvien[] arr) {
        System.out.println("-------------------- ");
        System.out.println("DANH SÁCH NHÂN VIÊN:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println( (i+1) +". Tên nhân viên: " + arr[i].getName());
            System.out.println("   ID: " + arr[i].getId());
            System.out.println("   Tuổi: " + arr[i].getName());
            System.out.println("   Địa chỉ " + arr[i].getName());
            System.out.println("   ----");
        }
    }
}

