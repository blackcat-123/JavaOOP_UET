public class Student {
    private int id;
    private String name;
    private int age;
    private String address;
    private int score;

    public Student() {

    }

    /**
     * Javadoc.
     * Comment.
     */

    public Student(int id, String name, int age, String address, int score) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Javadoc.
     * Comment.
     */

    public int getScore() {
        if (score < 0) {
            return 0;
        } else if (score > 10) {
          return 10;
        } else {
            return score;
        }
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
