package pt1;

public class Cat implements Animal {
    @Override
    public void voice() {

        System.out.println("The cat says: miu, miu");
    }

    @Override
    public void feed() {

        System.out.println("I'm hungry!");
    }
}
