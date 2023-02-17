package home_tasks;

import java.util.ArrayList;

public class Main implements Cloneable{
    public static void main(String[] args) {

        // Creating an Arraylist of Students

        ArrayList<Student> students= new ArrayList<>();
       students.add(new Student(18,"Ivan", "Ivanov", 2));
       students.add(new Student(20,"Egor", "Graves", 3));

       // Getting info and activity by using foreach

        for (Student student : students) {
            System.out.println(student.info());
            System.out.println(student.activity());
        }

        // Creating a clone of a Student
        Student copyOfStudent = students.get(1);
        copyOfStudent.setCourse(1);

        //  Getting info and activity about cloned student

        System.out.println(copyOfStudent.info());
        System.out.println(copyOfStudent.activity());

    }

    @Override
    public Main clone() {
        try {
            return (Main) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
