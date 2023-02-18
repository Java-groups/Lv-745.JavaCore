public class Student extends Person{
    private final String typePerson = ("My type person is - " + getClass().getSimpleName());

    public Student() {
        System.out.println(typePerson);
    }

    public Student(String name) {
        super(name);
    }

    @Override
    public void print() {
        System.out.println("My name is - " + getName() + ". " + typePerson +".");
    }
}
