import java.lang.Math;

public class Square extends Rectangle {

    public Square() {
    }

    public Square(double side) {
        width = length = side;
    }

    /**
     * hi.
     */
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return super.getLength();
    }

    public void setSide(double side) {
        super.setLength(side);
        super.setWidth(side);
    }

    public void setWidth(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    public void setLength(double side) {
        super.setLength(side);
        super.setWidth(side);
    }

    /**
     * hi.
     */
    public String toString() {
        return "Square["
                + "side=" + this.width
                + ",color=" + this.color
                + ",filled=" + this.filled
                + ']';
    }

    public static void main(String[] args) {

    }
} 