package Homework2_Classes;

import java.time.Year;
import java.util.Scanner;

public class Person {
    private String firstName;
    private String lastName;
    private int birthYear = 0;

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBirthYear() {
        return this.birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public Person() {
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String toString() {
        return "Person (firstName='" + this.firstName + "', lastName='" + this.lastName + "', birthYear=" + this.birthYear + ")";
    }

    public int getAge() {
        int year = Year.now().getValue();
        return year - this.birthYear;
    }

    public void input(Scanner sc) {
        System.out.print("Please enter person's name: ");
        this.firstName = sc.nextLine();
        System.out.print("Please enter person's surname: ");
        this.lastName = sc.nextLine();
        System.out.print("Please enter person's year of birth: ");
        this.birthYear = sc.nextInt();
        sc.nextLine();
    }

    public void output() {
        System.out.println(this);
    }

    public void changeName(String fn, String ln) {
        String a = fn.trim();
        String b = ln.trim();
        if (a.length() > 0) {
            this.setFirstName(a);
        }

        if (b.length() > 0) {
            this.setLastName(b);
        }
    }
}
