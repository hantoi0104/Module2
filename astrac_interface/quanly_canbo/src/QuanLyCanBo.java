import java.time.LocalDate;
import java.util.Scanner;

public class QuanLyCanBo {
    Scanner sc = new Scanner(System.in);
    CanBo[] array_Canbo = new CanBo[0];

    public void menu() {
        int choice = 0;
        System.out.println("1.Nhập thông tin mới");
        System.out.println("2.Tìm kiếm theo họ tên");
        System.out.println("3.Hiển Thị");
        try {
            choice = Integer.parseInt(sc.nextLine());
        }
       catch (Exception e) {
            menu();
       }

        switch (choice) {
            case 1:
                nhapThongTin();
                break;

            case 2:
                timKiemHo();
                break;
            case 3:
                hienThiNhanVien();
                break;
        }
    }

    public CanBo taoCanBo(boolean isCongNhan, boolean isKySu) {
        System.out.println("Nhập tên:");
        String ten = sc.nextLine();
        System.out.println("Nhập ngày sinh YYYY-MM-DD:");
        LocalDate ngaySinh =null;

        try {
            String date = sc.nextLine();
            ngaySinh = LocalDate.parse(date);
        } catch (Exception e) {

            System.out.println("Nhập sai ngày sinh: ");
            menu();
        }

        System.out.println("Nhâp giới tính");
        String gioTinh = sc.nextLine();
        System.out.println("Nhâp địa chỉ");
        String diaChi = sc.nextLine();

        if (isCongNhan) {
            System.out.println("Nhập bậc");
            double bac = Double.parseDouble(sc.nextLine());
            CanBo canbo = new CongNhan(ten, ngaySinh, gioTinh, diaChi, bac);
            System.out.println("là công nhân");
            return canbo;
        } else if (isKySu) {
            System.out.println("Nhập ngành");
            String nganh = sc.nextLine();
            CanBo canBo = new KySu(ten, ngaySinh, gioTinh, diaChi, nganh);
            return canBo;

        } else {
            System.out.println("Nhập công việc");
            String congViec = sc.nextLine();
            CanBo canBo = new NhanVien(ten, ngaySinh, gioTinh, diaChi, congViec);
            return canBo;

        }
    }

    public void them_array(CanBo canBo) {
        CanBo[] new_arr = new CanBo[array_Canbo.length + 1];
        for (int i = 0; i < array_Canbo.length; i++) {
            new_arr[i] = array_Canbo[i];
        }
        new_arr[new_arr.length - 1] = canBo;
        array_Canbo = new_arr;
    }

    public void nhapThongTin() {
        System.out.println("1. Công nhân");
        System.out.println("2. Kỹ sư");
        System.out.println("3. Nhân viên");
        int choice1 = Integer.parseInt(sc.nextLine());
        switch (choice1) {
            case 1:
                them_array(taoCanBo(true, false));
                break;
            case 2:
                them_array(taoCanBo(false, true));
                break;
            case 3:
                them_array(taoCanBo(false, false));
                break;
        }

    }

    public void timKiemHo() {
        System.out.println("Nhập vào họ tên muốn tìm kiếm:");
        String hoTen = sc.nextLine();
        for (int i = 0; i < array_Canbo.length; i++) {
            if (array_Canbo[i].getTen().equals(hoTen)) ;
            System.out.println(array_Canbo[i]);
        }
    }

    public void hienThiNhanVien() {
        for (int i = 0; i < array_Canbo.length; i++) {
            System.out.println(array_Canbo[i].toString());
        }
    }
}
