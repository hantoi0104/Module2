public class Circle extends Shape implements Resize {
private double radius;

    public Circle() {
        super();
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return super.toString() +
                " radius = " + radius ;

    }

    @Override
    public void reSize(double percent) {
        this.radius = radius*percent;
    }

    @Override
    public double dienTich() {
        return Math.PI*radius*radius;
    }
}
