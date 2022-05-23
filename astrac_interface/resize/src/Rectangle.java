public class Rectangle extends Shape implements Resize {
    private double width;
    private double height;

    public Rectangle() {
        super();
    }

    public Rectangle(String color, boolean filled, double width, double height) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return super.toString() +
                " width = " + width +
                ", height = " + height;
    }

    @Override
    public void reSize(double percent) {
        this.width = width * percent;
        this.height = height * percent;
    }

    @Override
    public double dienTich() {

        return width * height;
    }
}
