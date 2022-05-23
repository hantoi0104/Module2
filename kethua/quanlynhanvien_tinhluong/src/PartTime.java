public class PartTime extends Nhanvien {

    private int soBuoiLam;

    public PartTime(int id, String name, int age, int soBuoiLam) {
        super(id, name, age);
        this.soBuoiLam = soBuoiLam;
    }

    public int getSoBuoiLam() {
        return soBuoiLam;
    }

    public void setSoBuoiLam(int soBuoiLam) {
        this.soBuoiLam = soBuoiLam;
    }

    @Override
    public double tinhLuong() {
        return soBuoiLam * 200;
    }

    @Override
    public String toString() {

        return super.toString() +
                " soBuoiLam = " + soBuoiLam + " Nhân viên PartTime " ;
    }
}
