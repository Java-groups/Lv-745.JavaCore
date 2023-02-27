package home_tasks.taks2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Appl {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        run();
    }

    private static void run(){
        printStudFollowCourse();
        sortByName(createStudentsList());
        sortByCourse(createStudentsList());
    }

    private static void printStudFollowCourse(){
        System.out.print("Enter which course do u wanna check: ");
        int checkCourse = sc.nextInt();
        Student.printStudents(createStudentsList(), checkCourse);
    }

    private static List<Student> createStudentsList() {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("NazzP", 3));
        studentList.add(new Student("Yurii", 3));
        studentList.add(new Student("Orest", 2));
        studentList.add(new Student("Andriy", 1));
        studentList.add(new Student("Andriy", 2));
        return studentList;
    }

    private static void sortByName(List<Student> studentList) {
        System.out.println("The list of students ordered by name: ");
        studentList.sort(Student.compareByName());
        printList(studentList);
    }

    private static void sortByCourse(List<Student> studentList) {
        System.out.println("The list of students ordered by course: ");
        studentList.sort(Student.compareByCourse());
        printList(studentList);
    }

    private static void printList(List<Student> studentList) {
        for (Student student : studentList) {
            System.out.println(student.getName() + " - " + student.getCourse());
        }
    }


}
