package practical;

public class Cat implements Animal{
    private String name;
    private int age;
    private int caughtMice;

    public Cat(){}
    public Cat(String name, int age, int caughtMice) {
        this.name = name;
        this.age = age;
        this.caughtMice = caughtMice;
    }

    @Override
    public String voice() {
        return "Meow meow";
    }

    @Override
    public String feed() {
        return "I'm full";
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

    public int getCaughtMice() {
        return caughtMice;
    }

    public void setCaughtMice(int caughtMice) {
        this.caughtMice = caughtMice;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", caughtMice=" + caughtMice +
                '}';
    }
}
