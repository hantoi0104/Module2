import java.time.LocalDate;

public class KySu extends CanBo{
    private String nganh;

    public KySu(String ten, LocalDate ngaySinh, String gioiTinh, String diaChi, String nganh) {
        super(ten, ngaySinh, gioiTinh, diaChi);
        this.nganh = nganh;
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }

    @Override
    public String toString() {
        return super.toString() + " nganh ='" + nganh + " Kỹ Sư";
    }
}
