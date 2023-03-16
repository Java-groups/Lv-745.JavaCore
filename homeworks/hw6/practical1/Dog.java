package com.softserve.edu06.practicaltask1;

public class Dog implements Animal{
    private String breed;
    public String getBreed() {
        return breed;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }
    public Dog(){}

    public Dog(String breed) {
        setBreed(breed);
    }
    @Override
    public String voice() {
        return getBreed() + " bark!";
    }

    @Override
    public String feed() {
        return getBreed() + " eat!";
    }

    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                '}';
    }
}
