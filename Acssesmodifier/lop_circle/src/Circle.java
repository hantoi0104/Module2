public class Circle {

    private double radius = 1.0;
    private String color = "red";

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public static double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }
}
