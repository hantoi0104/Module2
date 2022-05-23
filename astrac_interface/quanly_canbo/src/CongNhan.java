import java.time.LocalDate;
import java.util.Date;

public class CongNhan extends CanBo{
private  double bac;

    public CongNhan(String ten, LocalDate ngaySinh, String gioiTinh, String diaChi, double bac) {
        super(ten, ngaySinh, gioiTinh, diaChi);
        this.bac = bac;
    }

    public double getBac() {
        return bac;
    }

    public void setBac(double bac) {
        this.bac = bac;
    }

    @Override
    public String toString() {
        return super.toString() +
                " bac= " + bac + " Công Nhân";

    }
}
