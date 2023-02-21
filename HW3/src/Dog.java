public class Dog {
    protected String name;
    protected Breed breed;
    protected int age;

    public enum Breed {
        LABRADOR,
        PUG,
        GOLDEN_RETRIEVER,
        GERMAN_SHEPHERD
    }

    public Dog(String name, Breed breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }
}
