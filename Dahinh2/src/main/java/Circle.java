public class Circle extends Shape {

    protected double radius;
    protected Point center;

    public Circle() {

    }

    /**
     * Javadoc.
     * Comment.
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    /**
     * Javadoc.
     * Comment.
     */

    public Circle(Point center, double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
        this.center = center;
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
        double perimeter = 2 * this.radius * Math.PI;
        return perimeter;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    /**
     * javadoc.
     * comment.
     */

    public boolean equals(Object object) {
        if (object instanceof Circle) {
            double pointx = Math.abs(((Circle) object).radius - this.radius);
            boolean a = pointx <= 0.001;
            return center.equals(((Circle) object).center) && a;
        }
        return false;
    }

    public int hashCode() {
        return 0;
    }

    /**
     * toString.
     * string.
     */

    public String toString() {
        return String.format("Circle[center=%s,radius=%.1f,color=%s,filled=%s]",
                center.toString(), radius, color, filled);
    }

    public static void main(String[] args) {

    }
}
 