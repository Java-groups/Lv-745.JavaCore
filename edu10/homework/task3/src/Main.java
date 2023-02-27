import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        run();
    }
    public static void run(){
        List<Student> students = new ArrayList<>();
        students.add(new Student("Katya", 2));
        students.add(new Student("Andriy", 2));
        students.add(new Student("Oleg", 1));
        students.add(new Student("Orest", 3));
        students.add(new Student("Marina", 3));
        System.out.println("Original list of students: ");
        for (Student student : students) {
            System.out.println(student.getName() + " - " + student.getCourse());
        }
        System.out.println("Students ordered by name: ");
        Collections.sort(students, Student.compareByName());
        for (Student student : students) {
            System.out.println(student.getName() + " - " + student.getCourse());
        }
        System.out.println("Students ordered by course: ");
        Collections.sort(students, Student.compareByCourse());
        for (Student student : students) {
            System.out.println(student.getName() + " - " + student.getCourse());
        }
    }
}