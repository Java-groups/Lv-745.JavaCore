package Homework3_If.Task4;

public class App {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Dolly", 2, Dog.breed.GERMAN_SHEPHERD);
        Dog dog2 = new Dog("Dolly", 1, Dog.breed.GOLDEN_RETRIEVER);
        Dog dog3 = new Dog("Ralf", 5, Dog.breed.FRENCH_BULLDOG);

        System.out.println("Are among these dogs two dogs with the same name? " + (dog1.equals(dog2) || (dog2.equals(dog3) || (dog1.equals(dog3)))));

        if ((dog1.getAge() > dog2.getAge()) && (dog1.getAge() > dog3.getAge())) {
            System.out.println(dog1.getName());
        } else if ((dog2.getAge() > dog1.getAge()) && (dog2.getAge() > dog3.getAge())) {
            System.out.println(dog2.getName());
        } else System.out.println("Oldest dog is " + dog3.getName() + ". He is " + dog3.getBreed().toLowerCase());
    }
}
