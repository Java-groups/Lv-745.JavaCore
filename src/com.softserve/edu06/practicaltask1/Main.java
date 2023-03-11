package com.softserve.edu06.practicaltask1;

public class Main {
    public static void main(String[] args) {

        System.out.println(
                """
                PRACTICAL TASK 1
                Create interface Animal with methods voice() and feed().
                Create two classes Cat and Dog, which implement this interface.
                 Create array of Animal and add some Cats and Dogs to it. 
                 Call voice() and feed() method for all of it                         
                 """);

        Animal[] animals = {
                new Cat("Bobtail"),
                new Cat("Curl"),
                new Dog("Rex"),
                new Cat("Retriever")
        };

        for (Animal animal: animals) {
            System.out.println(animal.voice() + "  " + animal.feed());
        }

    }
}