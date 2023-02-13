package practical;

public class Teacher extends Staff{
    static final String TYPE_PERSON = "Teacher";
    public Teacher(){
        System.out.println(TYPE_PERSON);
    }
    public Teacher(String name,double salary){
        this.name = name;
        this.setSalary(salary);
        System.out.println(TYPE_PERSON);
    }
    @Override
    public void salary() {
        System.out.println("My salary: "+this.getSalary());
    }
    public void print(){
        System.out.println("I am a Teacher");
    }
}
