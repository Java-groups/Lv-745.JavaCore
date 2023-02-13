package homework;
public class Student extends Person implements Cloneable{
    private int course;

    public Student(){}
    public Student(int age, FullName fullName, int course) {
        super(age, fullName);
        this.course = course;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    public String active() {
        return "I study at university";
    }
    @Override
    public String info() {
        return super.info()+", Course: "+this.course;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Student copyOfStudent = (Student) super.clone();
        return copyOfStudent;
    }
}
