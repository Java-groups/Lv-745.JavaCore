public class Cat implements Animal {
    private String name;
    private int yearsOld;

    public Cat() {
    }

    public Cat(String name, int yearsOld) {
        this.name = name;
        this.yearsOld = yearsOld;
    }

    @Override
    public void voice() {
        System.out.println("My name is " + name + ". I am " + yearsOld + "years old.\n Myau - myau!");
    }

    @Override
    public void feed() {
        System.out.println("I want drink milk!");
    }
}
