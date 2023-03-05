package pt2;

public class Student extends Person {
    public static final String TYPE_PERSON = "Student";
    public Student(String name) {
        super(name);
        System.out.println(TYPE_PERSON + " " + name + " created.");
    }
    public void print() {
        System.out.println("I am a " + TYPE_PERSON);
    }
}
