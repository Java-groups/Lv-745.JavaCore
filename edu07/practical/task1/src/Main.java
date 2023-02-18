public class Main {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        createAnimal();
    }

    public static void createAnimal() {
        Animal animals[] = {new Cat("Lea", 2),
                new Cat("Miya", 1),
                new Dog("Oscar", 4),
                new Dog("Tim", 3),
        };
        for (Animal animal : animals) {
            if (animal instanceof Cat || animal instanceof Dog) {
                animal.voice();
                animal.feed();
            }
        }

    }
}