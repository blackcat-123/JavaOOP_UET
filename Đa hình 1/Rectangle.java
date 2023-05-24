public class Rectangle extends Shape {

    protected double width;
    protected double length;

    public Rectangle() {
    }

    /**
     * hi.
     */
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
        return this.width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return this.length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return this.width * this.length;
    }

    public double getPerimeter() {
        return (this.width + this.length) * 2;
    }

    /**
     * hi.
     */
    public String toString() {
        return "Rectangle["
                + "width=" + width
                + ",length=" + length
                + ",color=" + color
                + ",filled=" + filled
                + ']';
    }
} 