package work2;

import work1.Person;

public class Work {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setFirstName("Olga");
        person1.setLastName("Koval");
        person1.setAge(1978);
        person1.print();

        Person person2 = new Person();
        person2.setFirstName("Tim");
        person2.setLastName("Fair");
        person2.setAge(1980);
        person2.print();

        Person person3 = new Person();
        person3.setFirstName("Kate");
        person3.setLastName("Moon");
        person3.setAge(1990);
        person3.print();

        Person person4 = new Person();
        person4.setFirstName("Tony");
        person4.setLastName("Sun");
        person4.setAge(1983);
        person4.print();

        Person person5 = new Person();
        person5.setFirstName("Eva");
        person5.setLastName("Flower");
        person5.setAge(2000);
        person5.print();

        //person1.print();
        print(person1);
        person1.print();
    }

    static void print(Person person1) {
        person1.setFirstName("Roy");
        System.out.println(person1.getFirstName());
    }

}
