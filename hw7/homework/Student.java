
public class Student extends Person implements Cloneable{
    private int course;

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }
    public Student(){}
    public Student(FullName fullName, int age, int course) {
        super(fullName,age);
        setCourse(course);
    }
    @Override
    public String info() {
        return super.info() + ", Course: "+ getCourse();
    }
    @Override
    public String activity() {
        return "I study at university";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Student copyOfStudent = (Student) super.clone();
        return copyOfStudent;
    }
}
