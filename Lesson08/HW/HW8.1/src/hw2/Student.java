package hw2;

public class Student extends Person implements Cloneable {
    int course;

    public Student(FullName fullName, int age, int course) {
        super(fullName, age);
        this.course = course;
    }

    @Override
    public String info() {
        return super.info() + ", Course: " + course;
    }

    @Override
    public String activity() {
        return "I study at university";
    }
    @Override
    protected Student clone() throws CloneNotSupportedException {
       return (Student) super.clone();}
}
