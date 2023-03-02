package homeWork9.NestedInnerClasses.HomeWork;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Students {
    private String name;
    private int course;

    public Students(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }

    public void printStudents(List<Students> students, int course) {
        Iterator<Students> iterator = students.iterator();
        while (iterator.hasNext()) {
            Students student = iterator.next();
            if (student.course == course) {
                System.out.println(student.name);
            }
        }
    }

    public static Comparator<Students> nameComparator() {
        return new Comparator<Students>() {
            @Override
            public int compare(Students o1, Students o2) {
                return o1.name.compareTo(o2.name);
            }


        };
    }

        public static Comparator<Students> courseComparator() {
            return new Comparator<Students>() {
                @Override
                public int compare(Students o1, Students o2) {
                    return Integer.compare(o1.course, o2.course);
                }


            };
        }
    }





