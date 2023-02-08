package practical.task2;

public class Teachers extends Staff{
    private final String TYPE_PERSON = "Teacher";

    public Teachers(String name, int age) {
        super(name, age);
    }

    @Override
    void print() {
        System.out.println("I am a " +TYPE_PERSON);
    }

    @Override
    void salary() {
        System.out.println("Salary = 10_000");
    }

    @Override
    public String toString() {
        return "Teachers{" +
                "TYPE_PERSON='" + TYPE_PERSON + '\'' +
                '}';
    }
}
