public class Circle {
    protected static final double PI = 3.141592;
    private double radius = 1.0;
    private String color = "red";

    public Circle() {
        Circle a = new Circle();
    }

    public Circle(double radius) {
        Circle b = new Circle();
    }

    public Circle(double radius, String color) {

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return radius * radius * PI;
    }

    /**
     * Javadoc.
     * @return string.
     */
    public String toString() {
        return "Circle[" + "radius=" + radius + ",color=" + color + "]";
    }

    public static void main(String[] args){

    }
}
