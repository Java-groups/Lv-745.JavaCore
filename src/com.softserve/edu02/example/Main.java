package com.softserve.edu02.example;

import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {

        DecimalFormat ft = new DecimalFormat("#####.##");

        Student firstStudent = new Student();
        Student secondStudent = new Student("Oleg", 9.2);
        Student thirdStudent = new Student("Vasyl", 10.4);

        System.out.println("Average: " + ft.format(Student.avgRating(firstStudent.getRating(), secondStudent.getRating(), thirdStudent.getRating())) + "\nTotal Rating: " + Student.totalRating);
    }
}
