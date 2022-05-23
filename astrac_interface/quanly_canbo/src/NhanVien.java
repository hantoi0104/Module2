import java.time.LocalDate;

public class NhanVien  extends CanBo{
    private String congViec;

    public NhanVien(String ten, LocalDate ngaySinh, String gioiTinh, String diaChi, String congViec) {
        super(ten, ngaySinh, gioiTinh, diaChi);
        this.congViec = congViec;
    }

    public String getCongViec() {
        return congViec;
    }

    public void setCongViec(String congViec) {
        this.congViec = congViec;
    }

    @Override
    public String toString() {
        return super.toString() + " congViec = " + congViec + " Nhân Viên";
    }
}
