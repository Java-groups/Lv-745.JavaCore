package homeWork3.homeWork;

import java.util.Objects;

public class Dog {

    Breed breed;
    int age;
    String name;

   // public AboutDogs.Animal.Dog(){}
    public Dog(Breed breed, int age, String name) {
        this.breed = breed;
        this.age = age;
        this.name = name;
    }

    public Breed getBreed() {
        return breed;
    }

    public void setBreed(Breed breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return age == dog.age && breed == dog.breed && Objects.equals(name, dog.name);

    }

    @Override
    public int hashCode() {
        return Objects.hash(breed, age, name);
    }
}
