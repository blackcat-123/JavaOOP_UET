import java.util.ArrayList;
import java.util.Arrays;

public class Person implements Comparable<Person> {
    private String name;
    private int age;
    private String address;

    public Person() {

    }

    public Person(String name, int age) {

    }

    public Person(int age, String address) {

    }

    public Person(String name, String address) {

    }

    /**
     * Person.
     * Javadoc.
     */
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public int compareTo(Person p) {
        if (this.name.equals(p.name)) {
            return Integer.compare(this.age, p.age);
        }
        return this.name.compareTo(p.name);
    }
}

