public class Circle extends Shape {

    protected double radius;

    public Circle() {
    }

    /**
     * hi.
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * hi.
     */
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
        return this.radius * this.radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * this.radius * Math.PI;
    }

    /**
     * hi.
     */
    public String toString() {
        return "Circle["
                + "radius=" + this.radius
                + ",color=" + this.color
                + ",filled=" + this.filled
                + ']';
    }
} 