package home4;

public class Home4 {
    enum Breed {
        HUSKY, CORGI, CHICHUCHUA
    }
    public static void main(String[] args) {
    Dog dog1 = new Dog();
    dog1.setName("Rich");
    dog1.setAge(5);
    Breed myBreed1 = Breed.CORGI;
    //dog1.print();

    Dog dog2 = new Dog();
    dog2.setName("Rex");
    dog2.setAge(7);
    Breed myBreed2 = Breed.HUSKY;
    //dog2.print();

    Dog dog3 = new Dog();
    dog3.setName("Rich");
    dog3.setAge(6);
    Breed myBreed3 = Breed.CHICHUCHUA;
    //dog3.print();


        System.out.println("The oldest dog is " + myBreed1 + " " + dog2.getName());


        System.out.println(dog1.getName().equals(dog2.getName()));
        System.out.println(dog2.getName().equals(dog3.getName()));
        System.out.println(dog3.getName().equals(dog1.getName()));

        if(dog2.getAge() > dog1.getAge() && dog2.getAge() > dog3.getAge()) {
            System.out.println("The oldest dog is " + dog2.getName());
        }
    }

}
