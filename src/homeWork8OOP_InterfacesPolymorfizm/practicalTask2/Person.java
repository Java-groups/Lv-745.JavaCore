package homeWork8OOP_InterfacesPolymorfizm.practicalTask2;

public abstract class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }
    abstract void print();
}
