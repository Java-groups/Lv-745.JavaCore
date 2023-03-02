package homeWork3.homeWork;

public class App {

    public static void main(String[] args) {
        Breed breed = null;
        breed = Breed.AKITA;
        Dog dog = new Dog(breed, 7, "Xatico");
        dog.age = 7;
        dog.name = "Xatico";
        dog.setBreed(breed);

        Breed breed1 = null;
        breed = Breed.ROTVEILER;
        Dog dog1 = new Dog(breed, 10, "Khaiter");
        dog.age = 10;
        dog.name = "Khaiter";
        dog.setBreed(breed);

        Breed breed2 = null;
        breed = Breed.SENTBERNAR;
        Dog dog2 = new Dog(breed, 8, "Nessi");
        dog.age = 8;
        dog.name = "Nessi";
        dog.setBreed(breed);

        System.out.println(dog1.breed == dog2.breed);

        if (dog.age > dog1.age ) {
            System.out.println("Xatico the  oldest dog ." +"Hi is " + dog.age + " years old");
        } else if (dog1.age > dog2.age) {
            System.out.println("Khaiter the  oldest dog ." + "He is " + dog1.age + " years old");
        } else {
            System.out.println("Nessi the oldest dog ." + "He is " + dog2.age + " years old");
        }
    }
}
