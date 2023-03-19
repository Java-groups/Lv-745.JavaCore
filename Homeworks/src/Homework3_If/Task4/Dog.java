package Homework3_If.Task4;

import java.util.Objects;

public class Dog {
    private String name;
    private int age;

    public enum breed {
        LABRADOR_RETRIEVER, FRENCH_BULLDOG, GOLDEN_RETRIEVER, GERMAN_SHEPHERD
    }

    private breed Breed;

    public Dog(String name, int age, breed Breed) {
        this.name = name;
        this.age = age;
        this.Breed = Breed;
    }

    public String getBreed() {
        return Breed.name();
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "Breed=" + Breed +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dog dog)) return false;
        return name.equals(dog.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}


