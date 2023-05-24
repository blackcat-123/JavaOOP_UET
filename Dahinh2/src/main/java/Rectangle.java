public class Rectangle extends Shape {

    protected double width;
    protected double length;
    protected Point topLeft;

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

    /**
     * hi.
     */
    public Rectangle(Point topLeft, double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
        this.topLeft = topLeft;
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

    public Point getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(Point topLeft) {
        this.topLeft = topLeft;
    }

    /**
     * hi.
     */
    public boolean equals(Object object) {
        if (object instanceof Rectangle) {
            double pointx = Math.abs(((Rectangle) object).width - this.width); //<= 0.001;
            double pointy = Math.abs(((Rectangle) object).length - this.length); //<= 0.001;

            boolean a = (pointx <= 0.001);
            boolean b = (pointy <= 0.001);
            return topLeft.equals(((Rectangle) object).topLeft) && a && b;
        }
        return false;
    }

    public int hashCode() {
        return 0;
    }

    /**
     * Javadoc.
     */

    public String toString() {
        return String.format("Rectangle[topLeft=%s,width=%.1f,length=%.1f,color=%s,filled=%s]",
                topLeft.toString(), width, length, color, filled);
    }

    public static void main(String[] args) {

    }
} 