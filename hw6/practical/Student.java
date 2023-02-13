package practical;

public class Student extends Person{
    static final String TYPE_PERSON = "Student";

    public Student(){
        System.out.println(TYPE_PERSON);
    }
    public Student(String name){
        this.name = name;
        System.out.println(TYPE_PERSON);
    }
    @Override
    void print() {
        System.out.println("I am a Student");
    }

}
