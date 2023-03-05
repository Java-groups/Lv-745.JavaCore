package pt2;

public class Cleaner extends Staff {
    public static final String TYPE_PERSON = "Cleaner";
    public Cleaner(String name) {
        super(name);
        System.out.println(TYPE_PERSON + " " + name + " created.");
    }
    public void print() {
        System.out.println("I am a " + TYPE_PERSON);
    }
    public void salary() {
        System.out.println("Salary of " + TYPE_PERSON + " " + name + " is $2000");
    }
}
