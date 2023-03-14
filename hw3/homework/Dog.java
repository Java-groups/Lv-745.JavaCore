package com.softserve.edu03.homework;

import java.util.Objects;

public class Dog {
    String name;
    Breed breed;
    int age;

    public Dog(String name, Breed breed, int age) {
        setName(name);
        setBreed(breed);
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
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

    public boolean isDogsNameEqual(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return Objects.equals(name, dog.name);
    }

    public Object nameKindOldestDog(Object o) {
        if (this == o) return o;
        if (o == null || getClass() != o.getClass()) return o;
        Dog product = (Dog) o;
        if (age > product.age) {
            return this;
        } else {
            return o;
        }
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed=" + breed +
                '}';
    }
}

enum Breed {
    POODLE, BULLDOG, ROTTWEILER
}