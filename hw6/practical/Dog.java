package practical;

public class Dog implements Animal {
    private String name;
    private int age;
    private int caughtCats;
    public Dog(){}
    public Dog(String name, int age, int caughtCats) {
        this.name = name;
        this.age = age;
        this.caughtCats = caughtCats;
    }

    @Override
    public String voice() {
        return "Woof woof";
    }

    @Override
    public String feed() {
        return "Thanks for the food";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCaughtCats() {
        return caughtCats;
    }

    public void setCaughtCats(int caughtCats) {
        this.caughtCats = caughtCats;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", caughtCats=" + caughtCats +
                '}';
    }
}
