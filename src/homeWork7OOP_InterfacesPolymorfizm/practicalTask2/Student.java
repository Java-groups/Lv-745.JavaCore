package homeWork7OOP_InterfacesPolymorfizm.practicalTask2;

public class Student extends Person{
    public static final String typePerson = "Student";

    public Student(String name) {
        super(name);
        System.out.println("I am a student");
    }

    @Override
    void print() {
        System.out.println("I am a " + typePerson);
    }
    void salary(){
        System.out.println("I dont hava salary" + typePerson+ "its sad");
    }
}
