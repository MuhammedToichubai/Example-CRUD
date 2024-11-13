package java16;

public class Student {
    private long id;
    private String name;
    private char gender;
    private int age;

    private static long generateStaticId = 0;

    public Student() {
        this.id = ++generateStaticId;
    }

    public Student(String name, char gender, int age) {
        this.id = ++generateStaticId;
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}
