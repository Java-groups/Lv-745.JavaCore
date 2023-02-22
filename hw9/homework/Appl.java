import java.util.*;

public class Appl {
    public static void main(String[] args) {
        System.out.println("--------FIRST TASK. Fill myCollection with 10 integers ----------");
        taskOne();
        System.out.println("--------SECOND TASK. Create map personMap and add to it ten persons of type <String, String>----------");
        taskTwo();
        System.out.println("--------THIRD TASK. Insert a random three-digit number before the first negative element of the list----------");
        taskThree();
    }

    public static void taskOne() {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        Set<Integer> set2 = new HashSet<>();
        set2.add(2);
        set2.add(3);
        set2.add(4);

        Set<Integer> union = union(set1, set2);
        Set<Integer> intersect = intersect(set1, set2);

        System.out.println("Set1: " + set1);
        System.out.println("Set2: " + set2);
        System.out.println("Union: " + union);
        System.out.println("Intersection: " + intersect);
    }
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

    public static void taskTwo(){
        Map<String, String> personMap = new HashMap<>();
        personMap.put("Devito", "Deni");
        personMap.put("Cruize", "Tom");
        personMap.put("Depp", "Johnny");
        personMap.put("DeNiro", "Robert");
        personMap.put("Johnson", "Orest");
        personMap.put("Garcia", "Sophia");
        personMap.put("Smith", "Will");
        personMap.put("Jackson", "Emma");
        personMap.put("Crowe", "Russel");
        personMap.put("Kovalchuk", "Orest");
        System.out.println("---------------Output the entities of the map on the screen.--------------------");
        for (Map.Entry m : personMap.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
        boolean hasDuplicateFirstName = personMap.values().stream().distinct().count() < personMap.values().size();
        System.out.println("-----There are at less two persons with the same firstName among these 10 people?-----");
        System.out.println(hasDuplicateFirstName);
        System.out.println("-----Remove from the map person whose firstName is ”Orest”. Print result.-----");
        personMap.values().removeIf(firstName -> firstName.equals("Orest"));
        for (Map.Entry m : personMap.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
    public static void taskThree(){
        List<Student> students = new ArrayList<>();
        students.add(new Student("Vasya", 1));
        students.add(new Student("Olga", 2));
        students.add(new Student("Nata", 1));
        students.add(new Student("Dima", 3));
        students.add(new Student("Kolya", 2));
        System.out.println("---------------Unsorted students.--------------------");
        for (Student student : students) {
            System.out.println(student.getName() + " - " + student.getCourse());
        }
        System.out.println("---------------Sort students by name.--------------------");
        Collections.sort(students, Student.getByNameComparator());
        for (Student student : students) {
            System.out.println(student.getName() + " - " + student.getCourse());
        }
        System.out.println("---------------Sort students by course--------------------");
        Collections.sort(students, Student.getByCourseComparator());
        for (Student student : students) {
            System.out.println(student.getName() + " - " + student.getCourse());
        }
        System.out.println("---------------Print students in course 2--------------------");
        Student student = new Student("", 2);
        student.printStudents(students, 2);
    }


}
