package homeWork2.homeWork;

import java.util.Scanner;

public class Appl {
    public static void main(String[] args) {
        Person[] people = new Person[5];

        for (int i = 0; i < people.length; i++) {
            System.out.println("Enter information for person #" + (i + 1) + ":");
            Person person = new Person();
            person.input();
            people[i] = person;
        }
        for (int i = 0; i < people.length; i++) {
            System.out.println("information for person " + (i + 1) + "");
            people[i].ouput();
            System.out.println();
        }
    }
}

     class Person{
        private String firstName;
        private String surname;
        private int birthYear;

        public Person() {
        }

        public Person(String firstName, String surname) {
            this.firstName = firstName;
            this.surname = surname;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getSurname() {
            return surname;
        }

        public void setSurname(String surname) {
            this.surname = surname;
        }

        public int getBirthYear() {
            return birthYear;
        }

        public void setBirthYear(int birthYear) {
            this.birthYear = birthYear;
        }
        public int getAge(){
            return java.time.LocalDate.now().getYear() - birthYear;
        }
        public void input(){
            Scanner scanner = new Scanner(System.in);
            System.out.println("first name :");
            firstName = scanner.nextLine();
            System.out.println("Last name :");
            surname = scanner.nextLine();
            System.out.println("BirthYear :");
            birthYear = scanner.nextInt();
        }
        public void ouput(){
            System.out.println(firstName + " First name ");
            System.out.println(surname + " Last name ");
            System.out.println(birthYear + "birthyear ");

        }
        public void changeName(String fn,String ln){
            firstName = fn;
            surname = ln;
        }
    }

