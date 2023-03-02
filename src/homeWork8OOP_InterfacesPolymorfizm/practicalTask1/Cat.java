package homeWork8OOP_InterfacesPolymorfizm.practicalTask1;

public class Cat implements Animal{
    @Override
    public void voice() {
        System.out.println("meow");
    }

    @Override
    public void feed() {
        System.out.println("Feed me with fish");
    }
}
