import java.lang.Math;

public class Point {

    private double pointX;
    private double pointY;

    public Point(double pointX, double pointY) {
        this.pointX = pointX;
        this.pointY = pointY;
    }

    /**
     * getter, setter.
     * pointX.
     */
    public double getPointX() {
        return pointX;
    }

    public void setPointX(double pointX) {
        this.pointX = pointX;
    }

    /**
     * getter, setter.
     * pointY.
     */
    public double getPointY() {
        return pointY;
    }

    public void setPointY(double pointY) {
        this.pointY = pointY;
    }

    /**
     * Javdoc.
     * Comment.
     */
    public double distance(Point other) {
        double posX = pointX - other.pointX;
        double posY = pointY - other.pointY;
        return Math.sqrt(Math.pow(posX, 2) + Math.pow(posY, 2));
    }
} 