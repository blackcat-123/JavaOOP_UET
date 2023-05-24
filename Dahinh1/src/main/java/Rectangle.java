import java.lang.Math;

public class Rectangle extends Shape {

    protected double width;
    protected double length;

    public Rectangle() {

    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    /**
     * hi.
     */
    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        double w = this.width;
        return w;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        double l = this.length;
        return l;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        double area = this.width * this.length;
        return area;
    }

    public double getPerimeter() {
        double peri = (this.width + this.length) * 2;
        return peri;
    }

    /**
     * Javadoc.
     * Comment.
     */
    public String toString() {
        return "Rectangle["
                + "width=" + width
                + ",length=" + length
                + ",color=" + color
                + ",filled=" + filled
                + ']';
    }

    public static void main(String[] args) {

    }
} 