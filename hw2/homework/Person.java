package com.softserve.edu02.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.time.Year;

class Person{

    static {
        System.out.print("Enter info about Person, each from new line:\nfirstName(String)\nlastName(String)\nbirthYear(int):\n");
    }
private String firstName;
private String lastName;
private int birthYear;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }


    Person(BufferedReader br) throws IOException {
        this(br.readLine(),br.readLine(),Integer.parseInt(br.readLine()));
    }

    Person(String firstName,String lastName,int birthYear){
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
    }

    public int getAge(){
        return (Year.now().getValue() - birthYear);
    }

    @Override
    public String toString() {
        return "Person " + firstName + " " + lastName + " was born in " + birthYear;
    }

}
