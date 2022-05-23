import javax.swing.*;
import java.util.Scanner;

public class Manager {
    Scanner sc = new Scanner(System.in);
    Nhanvien[] array = new Nhanvien[0];

    // Menu chọn chức năng
    public void menu() {
        System.out.println("Menu");
        System.out.println("1. Thêm");
        System.out.println("2. Sửa");
        System.out.println("3. Xóa");
        System.out.println("4. Tính lương");
        System.out.println("5. Hiển Thị");
        System.out.println("0. Thoát");
        System.out.println("Nhập vào lựa chọn: ");
        int choice = Integer.parseInt(sc.nextLine());
        switch (choice) {
            case 0:
                System.exit(0);
                break;
            case 1:
                themNhanVien();
                break;
            case 2:
                suaNhanVien();
                break;
            case 3:
                xoaNhanVien();
                break;
            case 4:
                tinhLuongNhanVien();
                break;
            case 5:
                hienThiNhanVien();
                break;
        }
    }

    public void themNhanVien() {
        System.out.println("1. Thêm nhân Viên Full time: ");
        System.out.println("2. Thêm nhân Viên Part time: ");
        int choice1 = Integer.parseInt(sc.nextLine());
        switch (choice1) {
            case 1:
                them_array(createNhanVien(true));
                break;
            case 2:
                them_array(createNhanVien(false));
        }
    }

    //Tạo đối tượng nhân viên theo FullTime - PartTime
    public Nhanvien createNhanVien(boolean isFullTime) {
        int id;
        do {
            System.out.print("Nhập id: ");
            id = Integer.parseInt(sc.nextLine());
        }
        while (checkId(id) == true);
        System.out.print("Nhập name: ");
        String name = sc.nextLine();
        System.out.print("Nhập age: ");
        int age = Integer.parseInt(sc.nextLine());

        if (isFullTime) {
            System.out.print("Nhập hệ số: ");
            float heso = Float.parseFloat(sc.nextLine());
            Nhanvien nhanvien = new FullTime(id, name, age, heso);
            return nhanvien;
        } else {
            System.out.print(" Nhập vào số buổi làm");
            int soBuoiLam = Integer.parseInt(sc.nextLine());
            Nhanvien nhanvien = new PartTime(id, name, age, soBuoiLam);
            return nhanvien;
        }
    }

    public void them_array(Nhanvien nhanvien) {
        Nhanvien[] new_arr = new Nhanvien[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            new_arr[i] = array[i];
        }
        new_arr[new_arr.length - 1] = nhanvien;
        array = new_arr;
    }

    public boolean checkId(int id) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].getId() == id)
                return true;
        }
        return false;
    }

    //Thêm nhân viên


    public void suaNhanVien() {
        System.out.println("Nhập id nhân viên muốn sửa :");
        int id = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < array.length; i++) {
            if (array[i].getId() == id)
                array[i] = createNhanVien(array[i] instanceof FullTime);
        }
    }

    public void xoaNhanVien() {
        Nhanvien[] new_array = new Nhanvien[array.length - 1];
        int id;
        int index = -1;
        do {
            System.out.println("Nhập vào ID cần xóa");
            id = Integer.parseInt(sc.nextLine());
        }
        while (checkId(id) == false);
        for (int i = 0; i < array.length; i++) {
            if (array[i].getId() == id)
                index = i;
        }
        for (int i = 0; i < new_array.length; i++) {
            if (i < index)
                new_array[i] = array[i];
            else
                new_array[i] = array[i + 1];
        }
        array = new_array;
    }

    public void tinhLuongNhanVien() {
        System.out.println("1. FullTime");
        System.out.println("2. PartTime");
        int choice2 = Integer.parseInt(sc.nextLine());
        switch (choice2) {
            case 1:
                for (Nhanvien a : array) {
                    if (a instanceof FullTime)
                        System.out.println("Lương của nhân viên: " + a.getName() + " = " + a.tinhLuong());
                }
                break;
            case 2:
                for (Nhanvien a : array) {
                    if (a instanceof PartTime)
                        System.out.println(a.getName() + " = " + a.tinhLuong());
                }
                break;
        }
    }


    public void hienThiNhanVien() {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i].toString());
        }
    }
}
