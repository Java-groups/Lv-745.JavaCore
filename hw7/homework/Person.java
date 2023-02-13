package homework;
public abstract class Person {
    private int age;
    private FullName fullName;

    public abstract String active();

    public Person(){}
    public Person(int age, FullName fullName) {
        this.age = age;
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public FullName getFullName() {
        return fullName;
    }

    public void setFullName(FullName fullName) {
        this.fullName = fullName;
    }
    public String info() {
        return this.fullName.info()+", Age: "+this.age;
    }
}
