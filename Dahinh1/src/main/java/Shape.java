import java.lang.Math;

public abstract class Shape {

    protected String color;
    protected boolean filled;

    public Shape() {
    }

    /**
     * hi.
     */
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        boolean flag = filled;
        return flag;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    /**
     * toString.
     */
    public String toString() {
        return "Shape["
                + "color=" + this.color
                + ",filled=" + this.filled
                + ']';
    }

    public static void main(String[] args) {

    }

    public void display() {
        System.out.print(toString());
    }
} 