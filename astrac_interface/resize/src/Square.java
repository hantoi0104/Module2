public class Square extends Shape  implements Resize{
    private double side;

    public Square() {
        super();
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return super.toString() +
                " side =" + side ;
    }

    @Override
    public void reSize(double percent) {
        this.side = side*percent;
    }

    @Override
    public double dienTich() {
        return side*side;
    }
}
