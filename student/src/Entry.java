import java.util.Scanner;
class Student {
    public String name;
    public int age;
    public void getInfor(){
        Scanner sc = new Scanner(System.in);
        name = sc.next();
        age = sc.nextInt();
    }
    public void display(){
        System.out.println("Name: " + name);
        System.out.print("Age: " + age);
    }

}
public class Entry {
    public static void main(String[] args){
        Student s = new Student();
        s.getInfor();
        s.display();
    }
}
