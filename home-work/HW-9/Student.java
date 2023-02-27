import java.util.*;

class Student {
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
        Iterator<Student> it = students.iterator();
        System.out.println("Students taking course " + course + ":");
        while (it.hasNext()) {
            Student s = it.next();
            if (s.getCourse() == course) {
                System.out.println(s.getName());
            }
        }
    }

    public static Comparator<Student> compareByName() {
        return new Comparator<Student>() {
            public int compare(Student s1, Student s2) {
                return s1.getName().compareTo(s2.getName());
            }
        };
    }

    public static Comparator<Student> compareByCourse() {
        return new Comparator<Student>() {
            public int compare(Student s1, Student s2) {
                return Integer.compare(s1.getCourse(), s2.getCourse());
            }
        };
    }
}