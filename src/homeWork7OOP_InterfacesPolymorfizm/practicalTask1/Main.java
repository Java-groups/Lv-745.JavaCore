package homeWork7OOP_InterfacesPolymorfizm.practicalTask1;

public class Main implements Animal {
    public static void main(String[] args) {
        Animal[] animals = new Animal[4];
        animals[0] = new Dog();
        animals[1] = new Cat();
        animals[2] = new Dog();
        animals[3] = new Cat();

       for (Animal animal : animals){
           animal.voice();
           animal.feed();
        }
    }

    @Override
    public void voice() {

    }

    @Override
    public void feed() {

    }
}
