package pt2;

public class Teacher extends Staff {
    public static final String TYPE_PERSON = "Teacher";
    public Teacher(String name) {
        super(name);
        System.out.println(TYPE_PERSON + " " + name + " created.");
    }
    public void print() {
        System.out.println("I am a " + TYPE_PERSON);
    }
    public void salary() {
        System.out.println("Salary of " + TYPE_PERSON + " " + name + " is $5000");
    }
}
