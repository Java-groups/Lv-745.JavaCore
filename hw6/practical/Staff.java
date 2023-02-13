package practical;

public abstract class Staff extends Person{
    static final String TYPE_PERSON = "Staff";
    private double salary;
    public abstract void salary();
    public void Staff(){
        System.out.println(TYPE_PERSON);
    }
    public void Staff(String name, double salary){
        this.name=name;
        this.salary=salary;
        System.out.println(TYPE_PERSON);
    }

    @Override
    void print() {
        System.out.println("I am a Staff");
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
