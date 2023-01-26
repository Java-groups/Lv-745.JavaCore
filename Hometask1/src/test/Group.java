package test;

import lesson3.Student;

public class Group {
    public static void main(String[] args){

    Student student1 = new Student();
    student1.setName("Alex");
    student1.setRating(95);
    student1.print();
    System.out.println(student1.toString());

    Student student2 = new Student();
    student2.setName("Mila");
    student2.setRating(90);
    student2.print();

    Student student3 = new Student();
    student3.setName("Tina");
    student3.setRating(86);
    student3.print();



    if (95 >= 90) {
        System.out.println(true);
    } else {
        System.out.println(false);
    }

    //Student.setRating("95");
    //System.out.println(Student.getRating());

   // student.print("Hi, ", 95 );
   // student.setName("Mila");
    //student.print("Hi, ", 90 );
   // student.setName("Tina");
   // student.print("Hi, ", 86 );
    }

}
