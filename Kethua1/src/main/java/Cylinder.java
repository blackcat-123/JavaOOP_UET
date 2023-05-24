public class Cylinder extends Circle {
    private double height = 1.0;

    public Cylinder() {

    }

    public Cylinder(double radius) {

    }

    public Cylinder(double radius, double height) {

    }

    public Cylinder(double radius, double height, String color) {

    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        double v = getArea() * height;
        return v;
    }

    /**
     * Javadoc.
     * @return string.
     */
    public String toString() {
        return "Cylinder[" + super.toString() + ",height=" + height + "]";
    }

}
