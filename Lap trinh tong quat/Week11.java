import java.util.ArrayList;
import java.util.List;


public class Week11 {

    /**
     * hi.
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
     * hi.
     */
    public static void main(String[] args) {
        List<Person> demo = new ArrayList<>();
        demo.add(new Person("Nguyen A", 22, "Ha Noi"));
        demo.add(new Person("Pham B", 21, "Hai Phong"));
        demo.add(new Person("Le C", 20, "Ho Chi Minh"));
        demo = sortGeneric(demo);
        for (Person person : demo) {
            System.out.println(person.getName() + " " + person.getAge() + " "
                    + person.getAddress());
        }
    }
} 