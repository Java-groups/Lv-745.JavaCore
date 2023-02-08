package practical.task2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Student("NazzP",18));
        people.add(new Teachers("Vasyl",37));
        people.add(new Cleaners("Alex",28));

        doSmth(people.get(0));
        doSmth(people.get(1));
        doSmth(people.get(2));
    }

    private static void doSmth(Person person) {
        System.out.println(person.toString());
        person.print();
        if (person instanceof Staff) {
            ((Staff) person).salary();
        }
    }
}
