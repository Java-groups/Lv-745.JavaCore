package Dog;

public enum Breed {
    Rottweiler("Rottweiler"),
    Bulldog("Bulldog"),
    Pug("Pug");

    private final String breed;

    Breed(String breed) {
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

}