// import your libraries

public class Circle extends Shape {

    protected double radius;

    public Circle() {

    }

    /**
     * Javadoc.
     * Comment.
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        double area = this.radius * this.radius * Math.PI;
        return area;
    }

    public double getPerimeter() {
        double peri = 2 * this.radius * Math.PI;
        return peri;
    }

    /**
     * Javadoc.
     * Comment.
     */

    public String toString() {
        return "Circle["
                + "radius=" + this.radius
                + ",color=" + this.color
                + ",filled=" + this.filled
                + ']';
    }

    public static void main(String[] args) {

    }
} 