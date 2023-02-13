package practical;

public class Main {
    public static void main(String[] args) {
        System.out.println("--------FIRST TASK----------");
        taskOne();
        System.out.println("\n\n--------SECOND TASK----------");
        taskTwo();
    }

    public static void taskOne(){
        Animal [] animals = {new Dog("Snoopy",5,0),new Dog("Fluffy",3,1),
                new Cat("Tom",4,0), new Cat("Luna",6,4)};
        for (Animal animal:animals) {System.out.println(animal.toString());}
    }

    public static void taskTwo(){
        Person [] persons = {new Student("Mike"),new Teacher("Line",43212),
                new Cleaner("Bob",23000)};
        for (Person person:persons) {
            person.print();
            if (person instanceof Staff) {
                ((Staff) person).salary();
            }
        }
    }
}

