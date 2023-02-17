package home_tasks;

public class Student extends Person {

    private int course;

    public void setCourse(int course) {
        this.course = course;
    }

    public Student(int age, String firstName, String lastName, int course) {
        super(age, firstName, lastName);
        this.course = course;
    }


    // Overriding the Cloneable method

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


    // Overriding the parents methods
    @Override
    String activity() {
        return "Activity - on";
    }

    @Override
    public String info() {
        return super.info() + ", course: " + course;
    }

}
