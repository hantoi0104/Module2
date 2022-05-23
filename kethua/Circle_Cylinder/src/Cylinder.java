public class Cylinder extends Circle {
    double height;



    public Cylinder(String color, double radius, double height) {
        super(color, radius);
        this.height = height;
    }

    public double theTich (){
        return  Math.PI * (radius * radius);
    }
}
