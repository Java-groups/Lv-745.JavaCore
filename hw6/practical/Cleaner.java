package practical;

public class Cleaner extends Staff{
    static final String TYPE_PERSON = "Cleaner";
    public Cleaner(){
        System.out.println(TYPE_PERSON);
    }
    public Cleaner(String name,double salary){
        this.name = name;
        this.setSalary(salary);
        System.out.println(TYPE_PERSON);
    }
    @Override
    public void salary() {
        System.out.println("My salary: "+this.getSalary());
    }
    public void print(){
        System.out.println("I am a Cleaner");
    }
}
