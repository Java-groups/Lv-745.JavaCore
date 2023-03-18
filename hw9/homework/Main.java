import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static <T> Set<T> union(Set<T> set1, Set<T> set2) {
        Set<T> result = new HashSet<>(set1);
        result.addAll(set2);
        return result;
    }

    public static <T> Set<T> intersect(Set<T> set1, Set<T> set2) {
        Set<T> result = new HashSet<>(set1);
        result.retainAll(set2);
        return result;
    }
    public static void main(String[] args) throws IOException {

        System.out.println(
                """
                HOMEWORK TASKS
                1)Write parameterized methods union(Set set1, Set set2) and intersect(Set set1, Set set2),
                 realizing the operations of union and intersection of two sets.
                 Test the operation of these techniques on two pre-filled sets.\s
                                  
                2)Create map personMap and add to it ten persons of type <String, String> (lastName, firstName).
                Output the entities of the map on the screen.\s
                There are at less two persons with the same firstName among these 10 people?
                Remove from the map person whose firstName is ”Orest” (or other). Print result. \s
              
                3)Write class Student that provides information about the name of the student and his course.
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


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        //HOMEWORK TASK 1
        Set<Integer> set1 = new HashSet<>(Arrays.asList(5, 7, 9, 1, 4));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(4, 5, 7, 2, 3));
        Set<Integer> union = union(set1, set2);
        Set<Integer> intersect = intersect(set1, set2);
        System.out.println("Set1: " + set1 + "\nSet2: " + set2 + "\nUnion: " + union + "\nIntersection: " + intersect);


        //HOMEWORK TASK 2
        Map<String, String> personMap = new HashMap<>();
        personMap.put("Nunez", "Orest");
        personMap.put("Heather", "Bob");
        personMap.put("Myers", "Andrea");
        personMap.put("Houston", "Alex");
        personMap.put("Johnson", "Oleg");
        personMap.put("Luna", "Alexandria");
        personMap.put("Sidney", "Inaya");
        personMap.put("Keith", "Orest");
        personMap.put("Case", "Lily-May");
        personMap.put("Walton", "Nil");
        System.out.println("\n=============\nPerson in map: ");
        for (Map.Entry element : personMap.entrySet()) {
            System.out.println(element.getKey() + " " + element.getValue());
        }

        boolean hasDuplicateFirstName = personMap.values().stream().distinct().count() < personMap.values().size();
        System.out.println("\n=============\nAre in map same firstName? " + hasDuplicateFirstName);

        System.out.println("\n=============\nMap after removing person called `Orest`: ");
        personMap.values().removeIf(firstName -> firstName.equals("Orest"));
        for (Map.Entry element : personMap.entrySet()) {
            System.out.println(element.getKey() + " " + element.getValue());
        }


        //HOMEWORK TASK 3
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alex", 3));
        students.add(new Student("Bob", 3));
        students.add(new Student("Rob", 1));
        students.add(new Student("Rex", 2));
        students.add(new Student("Dan", 2));

        System.out.println("\n=============\nInfo about students: ");
        for (Student student : students) {
            System.out.println(student);
        }

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
