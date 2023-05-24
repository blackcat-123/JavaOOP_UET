public class Square extends Rectangle {

    public Square() {

    }

    public Square(double side) {
        width = length = side;
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }


    public Square(Point topLeft, double side, String color, boolean filled) {
        super(topLeft, side, side, color, filled);
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
     * boolean.
     */
    public boolean equals(Object object) {
        if (object instanceof Square) {
            double x = Math.abs(((Square) object).width - this.width);
            double y = Math.abs(((Square) object).length - this.length);
            boolean a = (x <= 0.001);
            boolean b = (y <= 0.001);
            return topLeft.equals(((Square) object).topLeft) && a && b;
        }
        return false;
    }

    /**
     * String.
     */
    public String toString() {
        return String.format("Square[topLeft=%s,side=%.1f,color=%s,filled=%s]",
                topLeft.toString(), width, color, filled);
    }

    public static void main(String[] args) {

    }
}
 