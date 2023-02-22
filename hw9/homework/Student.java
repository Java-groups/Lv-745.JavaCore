import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Student {
    private String name;
    private int course;

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

    public void printStudents(List<Student> students, int course) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.course == course) {
                System.out.println(student.name);
            }
        }
    }

    public static Comparator<Student> getByNameComparator() {
        return new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.name.compareTo(s2.name);
            }
        };
    }

    public static Comparator<Student> getByCourseComparator() {
        return new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return Integer.compare(s1.course, s2.course);
            }
        };
    }
}
