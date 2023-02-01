package HW3;

public class Dog {
   private  String name;
    private  String breed;
    private  int age;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Dog(String name, String breed, int age){
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

}

enum Breed{
    breed1("english setter"), breed2("afghan hound"),breed3("beagle");
    private String breedDogs;

    Breed(String breeds){
        this.breedDogs = breeds;
    }

    public String getBreedDogs() {
        return breedDogs;
    }
}