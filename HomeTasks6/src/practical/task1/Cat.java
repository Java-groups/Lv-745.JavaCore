package practical.task1;

import practical.task1.Animal;

public class Cat implements Animal {

    private final String name;
    private final int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void voice() {
        System.out.println("Meow-Meow");
    }

    @Override
    public void feed() {
        System.out.println("Cat is eating");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
