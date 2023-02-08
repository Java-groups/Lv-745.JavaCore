package practical.task2;

public class Cleaners extends Staff{
    private final String TYPE_PERSON = "Cleaner";

    public Cleaners(String name, int age) {
        super(name, age);
    }

    @Override
    void print() {
        System.out.println("I am a " +TYPE_PERSON);
    }

    @Override
    void salary() {
        System.out.println("Salary = 8000");
    }

    @Override
    public String toString() {
        return "Cleaners{" +
                "TYPE_PERSON='" + TYPE_PERSON + '\'' +
                '}';
    }
}
