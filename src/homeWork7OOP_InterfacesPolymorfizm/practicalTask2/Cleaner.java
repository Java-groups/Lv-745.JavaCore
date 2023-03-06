package homeWork7OOP_InterfacesPolymorfizm.practicalTask2;

public class Cleaner extends Person {
public static final String typePerson = "Cleaner";
    public Cleaner(String name) {
        super(name);
        System.out.println("I am a " + typePerson);
    }

    @Override
    void print() {
        System.out.println("I am a " + typePerson);
    }
    void salary (){
        System.out.println("My salary as a " + typePerson + "is 400$per month");

    }
}
