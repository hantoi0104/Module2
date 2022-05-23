import java.time.LocalDate;

public class CanBo {
    private String ten;
    private LocalDate  ngaySinh;
    private String gioiTinh;
    private  String diaChi;

    public CanBo() {
    }

    public CanBo(String ten, LocalDate ngaySinh, String gioiTinh, String diaChi) {
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public LocalDate getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(LocalDate ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    @Override
    public String toString() {
        return  " ten= " + ten + ", ngaySinh= " + ngaySinh +
                ", gioiTinh= " + gioiTinh +
                ", diaChi= " + diaChi ;
    }
}
