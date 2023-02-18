public class Dog implements Animal{
    private String name;
    private int yearsOld;

    public Dog() {
    }

    public Dog(String name, int yearsOld) {
        this.name = name;
        this.yearsOld = yearsOld;
    }

    @Override
    public void voice() {
        System.out.println("My name is " + name + ". I am " + yearsOld + "years old.\nWoof-woof!");
    }

    @Override
    public void feed() {
        System.out.println("I want eat meat!");
    }
}
