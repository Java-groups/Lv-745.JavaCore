package com.softserve.edu07.hw;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        System.out.println(
                """
                HW TASK
                Develop a FullName class with the firstName and lastName fields of type String, which would correspond to the principle of encapsulation.
                Create an abstract Person class with fullName field of type FullName and age of type int.
                In the Person class, create a constructor public Person(FullName fullName, int age) and a method called info(), which will return a string in the format
                "First name: <firstName>, Last name: <lastName>, Age: <age>"
                and an abstract public activity() method with a String return type.
                Develop a Student class with an int field that matches the course the student is taking.
                In the Student class, create a constructor with parameters to initialize all fields in the class,
                and override the info() method (which would also add course information to the previous line), and the activity() method from the Person class.
                The activity() method should return a string value that is the type of activity for the corresponding Person subtype,
                for example for a student - this could be the value "I study at university".
                In the main(...) method, create two instances of the Student class and output information about them by calling the appropriate methods info() and activity()
                Create one more instance of Student class by cloning the first student, change a course for this object and output full information about all of created students
                """);

        Student[] students ={
                new Student(new FullName("Alex","Bravo"),17,1),
                new Student(new FullName("Eric", "Franko"),19,2)
        };

        System.out.println("Info and activity about students: ");
        for (Student student: students) {
            System.out.println(student.info() + "  " + student.activity());
        }

        System.out.println("\nCloned first student and changed course: ");
        Student cloneFirstStudent = (Student)students[0].clone();
        cloneFirstStudent.setCourse(5);
        System.out.println(cloneFirstStudent.info());

        System.out.println("\nOriginal info about students: ");
        for (Student student: students) {
            System.out.println(student.info());
        }

    }
}

