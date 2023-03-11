package com.softserve.edu06.practicaltask1;

public class Cat implements Animal{
    private String breed;
    public String getBreed() {
        return breed;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }
    public Cat(){}

    public Cat(String breed) {
        setBreed(breed);
    }
    @Override
    public String voice() {
        return getBreed() + " meow!";
    }

    @Override
    public String feed() {
        return   getBreed() + " eat!";
    }

    @Override
    public String toString() {
        return "Cat{" +
                "breed='" + breed + '\'' +
                '}';
    }
}
