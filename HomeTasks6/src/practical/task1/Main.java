package practical.task1;

import practical.task1.Animal;
import practical.task1.Cat;
import practical.task1.Dog;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Cat("Tomas", 2));
        animals.add(new Dog("Jonny", 4));
        doSmth(animals.get(0));
        doSmth(animals.get(1));
    }

    public static void doSmth(Animal animal) {
        System.out.println(animal.toString());
        animal.voice();
        animal.feed();
    }
}
