import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

    Person person1 = new Person();
    person1.setFirstName("Maks");
    person1.setSecondName("Yurkiv");
    person1.setBirthYear(2005);
    person1.print();

    Person person2 = new Person();
    person2.input();
    Person person3 = new Person();
    person3.input();

    person2.print();
    person3.print();
    }
}
