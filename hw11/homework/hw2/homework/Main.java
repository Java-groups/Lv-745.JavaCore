package hw2.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.Year;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args)  {
        System.out.println(
                """
                 HOMEWORK
                 • Create Console Application and add class Person to the project.
                 • Class Person should consist of
                     a) - three private fields: firstName, lastName and birthYear (the birthday year)
                     b) - properties for access to these fields
                     c) - default constructor and constructor with 2 parameters (first and last names)
                     d) - methods:
                        • getAge() - to calculate the age of person
                        • input() - to input information about person
                        • output() - to output information about person
                        • changeName(String fn, String ln) - to change the first name or/and last name
                        • In the method main() create 5 objects of Person type and input information about them.
                 """);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            Person person = new Person(br);

            Matcher matcherFirstName = Pattern.compile("[a-zA-Z]+").matcher(person.getFirstName());
            Matcher matcherLastName = Pattern.compile("[a-zA-Z]+").matcher(person.getFirstName());

            if(!matcherFirstName.find() || !matcherLastName.find()) {
                throw new NoTextException("Invalid input! Enter only text without spaces, specific symbols!");
            }

            if (Year.now().getValue() - person.getBirthYear() < 0){
                throw new OutOfRangeException(person.getBirthYear() + " is out of range!");
            }
            System.out.println(person.getAge());
            System.out.println(person);

        }catch(IOException  e ){
            System.err.println("Problem with input!");
        } catch (OutOfRangeException | NoTextException e) {
            throw new RuntimeException(e);
        }

    }
}
