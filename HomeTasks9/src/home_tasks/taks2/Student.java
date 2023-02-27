package home_tasks.taks2;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Student {
    private final String name;
    private final int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }

    public static void printStudents(List<Student> students, Integer course) {
        Iterator<Student> iterator = students.iterator();

        System.out.print("On " + course + "course: ");

        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (course == student.getCourse()) {
                System.out.print(student.getName() + " ");
            }
        }
    }

    public static Comparator<Student> compareByName() {
        return Comparator.comparing(Student::getName);
    }

    public static Comparator<Student> compareByCourse() {
        return Comparator.comparingInt(Student::getCourse);
    }
}