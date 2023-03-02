package homeWork2.practicalTask.Person;

import java.time.LocalDate;
import java.util.Scanner;

public class Person {
       private String firstName ;
        private String lastName ;
        private int birhday;

        public Person(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public Person(){
}
        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public int getBirhday() {
            return birhday;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public void setBirhday(int birhday) {
            this.birhday = birhday;


        }
        public int getAge(){
            return LocalDate.now().getYear()-birhday;

        }
        public void input(){
            Scanner sc = new Scanner(System.in);
            System.out.println("What is your name");
            firstName = sc.nextLine();

            System.out.println("What is your last name");
            lastName = sc.nextLine();

            System.out.println("What is your birhday");
            birhday = sc.nextInt();

        }
        public void output(){
            System.out.println("last name " + lastName);

            System.out.println("first name " + firstName);

            System.out.println("your age " + getAge());


        }

        public  void changeName(String firstName,String lastName){
            this.firstName = firstName;
            this.lastName = lastName;
        }

    }
