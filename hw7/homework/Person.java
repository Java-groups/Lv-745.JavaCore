
public abstract class Person {
    private int age;
    private FullName fullName;

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
    public Person(){}
    public Person( FullName fullName, int age) {
        setFullName(fullName);
        setAge(age);
    }
    public String info() {
        return getFullName() + ", Age: "+ getAge();
    }
    public abstract String activity();
}

