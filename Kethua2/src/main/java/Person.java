import java.util.Scanner;

public class Person {

    private String name;
    private String address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    /**
     *  hi.
     * @return string.
     */

    private void display() {
        System.out.print(toString());
    }

    /**
     *  hi.
     * @return string.
     */

    public String toString() {
        return "Person["
                + "name=" + name
                + ",address=" + address
                + ']';
    }

}