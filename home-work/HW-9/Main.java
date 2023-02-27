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

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        set1.add(1);
        set1.add(2);
        set1.add(3);

        set2.add(2);
        set2.add(3);
        set2.add(4);

        Set<Integer> unionSet = union(set1, set2);
        System.out.println("Union: " + unionSet);

        Set<Integer> intersectSet = intersect(set1, set2);
        System.out.println("Intersection: " + intersectSet);

        Map<String, String> personMap = new HashMap<>();
        personMap.put("Melnyk", "Oleh");
        personMap.put("Olha", "Stetsenko");
        personMap.put("Dilan", "Bob");
        personMap.put("Zakrevska", "Janna");
        personMap.put("Chorny", "Petro");
        personMap.put("Poplavsky", "Mykhailo");
        personMap.put("Dark", "Janna");
        personMap.put("Gvadelupa", "Pineda");
        personMap.put("Michael", "Jackson");
        personMap.put("Petrovich", "Orest");

        System.out.println("Initial map: " + personMap);

        boolean hasDuplicateFirstName = false;
        for (String firstName : personMap.values()) {
            if (personMap.values().stream().filter(name -> name.equals(firstName)).count() > 1) {
                hasDuplicateFirstName = true;
                break;
            }
        }
        System.out.println("Has duplicate first name: " + hasDuplicateFirstName);

        personMap.values().removeIf(name -> name.equals("Orest"));

        System.out.println("Map after removing person with first name Orest: " + personMap);

        List<Student> students = new ArrayList<>();
        students.add(new Student("John", 2));
        students.add(new Student("Mary", 1));
        students.add(new Student("Alice", 3));
        students.add(new Student("Bob", 1));
        students.add(new Student("David", 2));

        Collections.sort(students, Student.compareByName());
        System.out.println("Students ordered by name:");
        for (Student s : students) {
            System.out.println(s.getName() + " (course " + s.getCourse() + ")");
        }

        Collections.sort(students, Student.compareByCourse());
        System.out.println("Students ordered by course:");
        for (Student s : students) {
            System.out.println(s.getName() + " (course " + s.getCourse() + ")");
        }

        students.get(0).printStudents(students, 1);

    }
}