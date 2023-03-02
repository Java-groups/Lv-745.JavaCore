//package practick;
//
//import java.util.Arrays;
//import java.util.Comparator;
//
//public class Main extends Person {

//    public Main(String name, Integer age) {
//        super(name, age);
//    }
//
//    public static void main(String[] args) {
//        Person[] persons = { new Person("Ivan", 34), new Person("Vasyl", 29),
//                new Person("Olga", 26), new Person("Anna", 41) };
////1
//        Arrays.sort(persons, new Comparator<Person>(){
//            public int compare(Person o1, Person o2) {
//                return o1.getAge() - o2.getAge();
//            } });
//        System.out.println(Arrays.toString(persons));