import java.util.ArrayList;
import java.util.List;


public class Week11 {

    /**
     * Javadoc.
     * comment.
     */
    public static <T> List<T> sortGeneric(List<T> arr) {
        arr.sort((x, y) -> {
            if (x instanceof Integer) {
                return ((Integer) x).compareTo((Integer) y);
            } else if (x instanceof String) {
                return ((String) x).compareTo((String) y);
            } else if (x instanceof Person) {
                return ((Person) x).compareTo((Person) y);
            } else {
                return 0;
            }
        });
        return arr;
    }

    /**
     * javadoc.
     * comment.
     */
    public static void display() {
        List<Person> demo = new ArrayList<>();
        demo.add(new Person("Nguyen A", 22, "Ha Noi"));
        demo.add(new Person("Pham B", 21, "Hai Phong"));
        demo.add(new Person("Le C", 20, "Ho Chi Minh"));
        demo = sortGeneric(demo);

        for (Person person : demo) {
            String s = person.getName() + " " + person.getAge() + " " + person.getAddress();
            System.out.print(s);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        display();
    }
}