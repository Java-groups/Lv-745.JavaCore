import java.util.*;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Lucky", Dog.Breed.LABRADOR, 5);
        Dog dog2 = new Dog("Cesar", Dog.Breed.PUG, 3);
        Dog dog3 = new Dog("Lucy", Dog.Breed.GOLDEN_RETRIEVER, 7);

        List<Dog> dogs = Arrays.asList(dog1, dog2, dog3);

        Set<String> names = new HashSet<>();
        for (Dog dog : dogs) {
            if (names.contains(dog.name)) {
                System.out.println("There are two dogs with the same name!");
                return;
            }
            names.add(dog.name);
        }
        
        Dog oldestDog = Collections.max(dogs, Comparator.comparing(d -> d.age));
        System.out.println("The oldest dog is " + oldestDog.name + oldestDog.age + " (" + oldestDog.breed + ")");
    }
}
