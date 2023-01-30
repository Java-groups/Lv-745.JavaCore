public class Dog {

    private String name;
    private String breed;
    private int age;

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public int getAge() {
        return age;
    }

    public Dog(String name, String breed, int age) {
        this.name = name;
        this.breed = switch (breed.toLowerCase()) {
            case "shepard" -> Breed.GERMAN_SHEPARD.getBreed();
            case "bulldog" -> Breed.BULLDOG.getBreed();
            case "retreiver" -> Breed.LABRADOR_RETRIEVER.getBreed();
            case "french" -> Breed.FRENCH_BULLDOG.getBreed();
            case "chihuahua" -> Breed.CHIHUAHUA.getBreed();
            default -> "Wrong Name";
        };
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String output() {
        return "Name - " + name + " -- " + "Breed - " + breed + " -- " + "Age - " + age;
    }
}

