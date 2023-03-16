package com.softserve.edu09.hwtask3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        System.out.println(
                """
                HW TASK 3
                Write class Student that provides information about the name of the student and his course.
                Class Student should consist of properties for access to these fields
                - constructor with parameters
                - method printStudents (List students, Integer course),
                   ..which receives a list of students and the course number and prints to the console the names of the students from the list,
                   ..which are taught in this course (use an iterator)
                - methods to compare students by name and by course
                In the main() method
                * declare List students and add to the list five different students
                * display the list of students ordered by name
                * display the list of students ordered by course.
                """);

        List<Student> students = new ArrayList<>();
        students.add(new Student("Alex", 3));
        students.add(new Student("Bob", 3));
        students.add(new Student("Rob", 1));
        students.add(new Student("Rex", 2));
        students.add(new Student("Dan", 2));

        System.out.println("Info about students: ");
        for (Student student : students) {
            System.out.println(student);
        }


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("\nEnter the course number(1-3): ");
        Student.printStudents(students, Integer.parseInt(br.readLine()));


        System.out.println("\nSorted students by name: ");
        students.sort(Student.compareByName());
        for (Student student : students) {
            System.out.println(student);
        }


        System.out.println("\nSorted students by course: ");
        students.sort(Student.compareByCourse());
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
