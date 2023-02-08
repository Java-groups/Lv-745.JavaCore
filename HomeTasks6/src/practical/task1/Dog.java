package practical.task1;

import practical.task1.Animal;

public class Dog implements Animal {

    private final String name;
    private final int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void voice() {
        System.out.println("Woof-Woof");
    }

    @Override
    public void feed() {
        System.out.println("Dog is eating");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
