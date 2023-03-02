package homeWork2.practicalTask;

import homeWork2.practicalTask.Person.Person;

public class Apply {

    public static void main(String[] args) {

        Person person1 = new Person();

        person1.setFirstName("Roman");
        person1.setLastName("Svyshch");
        person1.setBirhday(1999);

        Person person2 = new Person("Bogdan","Makar");
        person2.setBirhday(1999);

        Person person3 = new Person();
        person3.input();

        person1.output();
        person2.output();
        person3.output();

        person2.changeName("Igor","Vasylenko");
        person2.output();
    }
}
