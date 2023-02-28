public class Student extends Person implements Cloneable {
    private int course;

    public Student() {}

    public Student(FullName fullName, int age) {
        super(fullName, age);
    }

    public Student(FullName fullName, int age, int course) {
        super(fullName, age);
        this.course = course;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    public String info() {
        return super.info() + ", the course - " + this.course;
    }

    @Override
    public String active() {
        return "I studying.";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Student cloneStudent = (Student)super.clone();
        return cloneStudent;
    }


}
