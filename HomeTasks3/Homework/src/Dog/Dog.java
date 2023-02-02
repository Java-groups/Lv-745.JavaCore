package Dog;

public class Dog {
    private final String name;
    private final Breed breed;
    private final int age;

    public Dog(String name, int age, Breed breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String printOldestDog() {
        return "Oldest dog -- [ name -- " + name + " , kind -- " + breed + " ]"; //not working
    }

}
