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

    /**
     * hi.
     */
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
     * hi.
     */
    public boolean equals(Object object) {
        if (object instanceof Square) {
            boolean x = Math.abs(((Square) object).width - this.width) <= 0.001;
            boolean y = Math.abs(((Square) object).length - this.length) <= 0.001;
            return topLeft.equals(((Square) object).topLeft) && x && y;
        }
        return false;
    }

    /**
     * hi.
     */
    public String toString() {
        return String.format("Square[topLeft=%s,side=%.1f,color=%s,filled=%s]",
                topLeft.toString(), width, color, filled);
    }
}
 