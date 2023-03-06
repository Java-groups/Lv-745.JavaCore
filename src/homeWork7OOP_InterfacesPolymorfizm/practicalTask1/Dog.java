package homeWork7OOP_InterfacesPolymorfizm.practicalTask1;

public class Dog implements Animal{
    @Override
    public void voice() {
        System.out.println("Woof");
    }

    @Override
    public void feed() {
        System.out.println("Feed me with bones");
    }
}
