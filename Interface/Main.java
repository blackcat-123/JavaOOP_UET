import java.util.ArrayList;
import java.util.List;

public class Main {
    
    /**
     * hi.
     */
    public static void main(String[] args) {
        Circle c1 = new Circle(new Point(1.5, 2), 3);
        System.out.println(c1.getInfo());

        Point p1 = new Point(1, 1);
        Point p2 = new Point(1, 2);
        Point p3 = new Point(2, 4);
        Triangle t1 = new Triangle(p1, p2, p3);
        System.out.println(t1.getInfo());

        List<GeometricObject> list = new ArrayList<>();
        list.add(c1);
        list.add(t1);

        ShapeUtil s1 = new ShapeUtil();
        System.out.println(s1.printInfo(list));

        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());

        System.out.println(t1.getArea());
        System.out.println(t1.getPerimeter());

        Point p4 = new Point(1, 2);
        Point p5 = new Point(1, 2);
        Point p6 = new Point(1, 2);
        Triangle t2 = new Triangle(p4, p5, p6);
        System.out.println(t2.getArea());
    }
} 