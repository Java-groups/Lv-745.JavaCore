package practical.task2;

public abstract class Staff extends Person{

    public Staff(String name, int age) {
        super(name, age);
    }

    abstract void salary();
}
