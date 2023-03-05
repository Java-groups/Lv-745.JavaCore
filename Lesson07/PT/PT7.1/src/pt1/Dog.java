package pt1;

public class Dog implements Animal {
    @Override
    public void voice() {
        System.out.println("The dog says: woof, woof");
    }

    @Override
    public void feed() {
        System.out.println("I am not hungry!");
    }
}
