package practick;

import java.util.Arrays;

public class Person {

    private String name;
    private Integer age;
    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
    public static int compareByName(Person a, Person b) {
        return a.name.compareTo(b.name); }
    public static int compareByAge(Person a, Person b) {
        return a.age.compareTo(b.age); }
// add getters, setters and toString()


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        Person[] persons = { new Person("Ivan", 34), new Person("Vasyl", 29),
                new Person("Olga", 26), new Person("Anna", 41) };
//2
        Arrays.sort(persons, (p1, p2) -> Person.compareByName(p1,p2));
        System.out.println(Arrays.toString(persons));
        System.out.println();
//3
        Arrays.sort(persons, Person::compareByAge);
        System.out.println(Arrays.toString(persons));

    }
}