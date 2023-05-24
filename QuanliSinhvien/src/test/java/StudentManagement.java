
import java.util.Arrays;


public class StudentManagement {
    private final Student[] students = new Student[100];

    /**
     * Comment.
     */
    public static boolean sameGroup(Student s1, Student s2) {

        return s1.getGroup().equals(s2.getGroup());
    }

    /**
     * addStudent.
     * function
     */
    public void addStudent(Student newStudent) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = newStudent;
                break;
            }
        }
    }

    /**
     * Comment.
     */

    public String studentsByGroup() {
        StringBuilder ans = new StringBuilder();
        String[] arraygroup = new String[100];
        int narraygroup = 1;
        arraygroup[0] = students[0].getGroup();

        for (Student student : students) {
            if (student == null) {
                break;
            }
            boolean found = false;
            String groupstudent = student.getGroup();
            for (int j = 0; j < narraygroup; j++) {
                if (arraygroup[j].equals(groupstudent)) {
                    found = true;
                    break;
                }
            }
            if (found == true) {
                continue;
            }
            arraygroup[narraygroup] = groupstudent;
            narraygroup = narraygroup + 1;
        }
        for (int i = 0; i < narraygroup; i++) {
            String groupcmp = arraygroup[i];
            ans.append(groupcmp).append("\n");
            for (Student student : students) {
                if (student == null) {
                    break;
                }
                String groupstudent = student.getGroup();
                if (groupcmp.equals(groupstudent)) {
                    ans.append(student.getInfo()).append("\n");
                }
            }
        }
        return ans.toString();
    }

    /**
     * remove student.
     * @param id is an id.
     */

    public void removeStudent(String id) {
        for (int i = 0; i < students.length; i++) {
            String idstudent = students[i].getId();
            if (idstudent.equals(id)) {
                for (; i < students.length - 1; i++) {
                    students[i] = students[i + 1];
                }
            }
        }
    }

    /**
     * Javadoc.
     */
    public static void main(String[] args) {
        Student person1 = new Student();
        person1.setName("Nguyen Van An");
        person1.setId("17020001");
        person1.setGroup("K62CC");
        person1.setEmail("17020001@vnu.edu.vn");
        // String ans = person1.getInfo();
        System.out.println(person1.getInfo());

        Student person2 = new Student();
        //ans = person2.getInfo();
        System.out.println(person2.getInfo());

        Student person3 = new Student("Nguyen Tan Minh", "20020081", "20020081@vnu.edu.vn");
        System.out.println(person3.getInfo());

        Student person4 = new Student(person1);
        System.out.println(person4.getInfo());

        boolean checkGroup = sameGroup(person1, person4);
        System.out.println(checkGroup);

        StudentManagement person5 = new StudentManagement();

        person5.addStudent(person1);
        person5.addStudent(person2);
        person5.addStudent(person3);
        person5.addStudent(person4);


        //String kq = person5.studentsByGroup();
        System.out.println(person5.studentsByGroup());
        person5.removeStudent("20020081");
        System.out.println(person5.studentsByGroup());
    }

}
