public class FullTime extends Nhanvien {
    private float heSo;

    public FullTime(int id, String name, int age, float heSo) {
        super(id, name, age);
        this.heSo = heSo;
    }

    public float getHeSo() {
        return heSo;
    }

    public void setHeSo(float heSo) {
        this.heSo = heSo;
    }


    @Override
    public double tinhLuong() {
        return heSo * 30 * 500;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", heSo = " + heSo +" Nhân viên FullTime " ;
    }
}
