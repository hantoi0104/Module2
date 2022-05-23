public class Rectangle {
    float width;
    float height;


    public Rectangle(float width, float height) {
        this.width = width;
        this.height = height;
    }

    public float getArea() {
        float area = width * height;
        return area;
    }

    public float getPerimeter() {
        float perimeter = 2 * (width + height);
        return perimeter;
    }

    public void display() {
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= width; j++) {
                if (i  == 1 || i == height)
                    System.out.print("*   ");
                else if (j==1 || j== width)
                    System.out.print("*    ");
                else System.out.print("    ");
            }
            System.out.println("\n");
        }

    }
}
