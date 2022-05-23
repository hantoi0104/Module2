public class Pan {
    private static final int SLOW = 1;
    private static final int MEDIUM = 2;
    private static final int FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public int getSpeed() {
        return speed;
    }

    public boolean isOn() {
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString(String a) {
        if (on == true)
            return "--->>Pan"+a+" {" +
                    "speed= " + speed +
                    ", on = " + on +
                    ", radius = " + radius +
                    ", color = '" + color + '\'' +
                    '}';
        else
            return "--->>Pan"+a+" {" +
                    "pan is off," +
                    " color = " + color +
                    ", radius = " + radius + '\'' +
                        "}";
    }
}
