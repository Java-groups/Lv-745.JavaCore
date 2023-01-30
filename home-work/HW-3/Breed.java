enum Breed {
    GERMAN_SHEPARD("German Shepard"),
    BULLDOG("Bulldog"),
    LABRADOR_RETRIEVER("Labrador Retriever"),
    FRENCH_BULLDOG("French Bulldog"),
    CHIHUAHUA("CHIHUAHUA");


    private final String breed;

    Breed(String breed) {
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }
}