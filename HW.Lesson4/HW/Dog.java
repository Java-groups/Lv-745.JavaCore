public class Dog {


public enum breed {POODLES("poodles"), SPANIEL("spaniel"), TERRIERS("terriers"), COCKAPOO("cockapoo"), BOXER("boxer");
                   /*Enum do not have getters because this is enum, reread more information about enum. THIS class enum is not correct*/
    private String displayName;
    breed(String displayName) {
        this.displayName = displayName;
    }
    public String getDisplayName (){
        return displayName;
    }
}
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    private int age;
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private breed breed;

    public void setBreed(breed breed) {
        this.breed = breed;
    }
    public breed getBreed() {
        return breed;
    }

    public Dog() {};

    public Dog(String name, breed breed, int age) {
        this.name=name;
        this.breed=breed;
        this.age=age;
        };
}
