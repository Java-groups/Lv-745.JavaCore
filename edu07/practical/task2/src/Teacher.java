public class Teacher extends Staff{
    private final String typePerson = ("My type person is - " + getClass().getSimpleName());

    private int salary;

    public Teacher() {
        System.out.println(typePerson);
    }
    public Teacher(String name, int salary) {
        super(name);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


    @Override
    public void print() {
        System.out.println("My name is - " + getName() + ". My salary is - " + salary() + "₴. " + typePerson +".");
    }

    @Override
    public int salary() {
        return salary;
    }
}
