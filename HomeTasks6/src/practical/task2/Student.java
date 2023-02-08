package practical.task2;

public class Student extends Person{
    private final String TYPE_PERSON = "Student";

    public Student(String name, int age) {
        super(name, age);
    }

    @Override
    void print() {
        System.out.println("I am a " +TYPE_PERSON);
    }

    @Override
    public String toString() {
        return "Student{" +
                "TYPE_PERSON='" + TYPE_PERSON + '\'' +
                '}';
    }
}
