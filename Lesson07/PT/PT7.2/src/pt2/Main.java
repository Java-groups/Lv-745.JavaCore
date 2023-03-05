package pt2;

public class Main {
    public static void main(String[] args) {
        Person[] persons = { new Teacher("John"), new Cleaner("Mike"), new Student("Kate") };
        for (Person person : persons) {
            person.print();
            if (person instanceof Staff) {
                ((Staff) person).salary();
            }
        }
    }
}
