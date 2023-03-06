package homeWork10Collections;

import java.util.*;

public class Main {
    public static void main(String[] args) {


        System.out.println("second task");
        secondTask();
        System.out.println();
        System.out.println("====third task");
        System.out.println();
        thirdTask();


//   public static void firstTask(){
//        Set<Integer> set1 = new HashSet<>();
//        set1.add(1);
//        set1.add(2);
//        set1.add(3);
//
//        Set<Integer> set2 = new HashSet<>();
//        set2.add(2);
//        set2.add(3);
//        set2.add(4);
//
//        Set<Integer> union = union(set1,set2)
//


    }
    //==========  Second Task
    public static void secondTask() {
        Map<String, String> personsMap = new HashMap<>();
        personsMap.put("Pavlo", "Mysnyk");
        personsMap.put("Makar", "Bogdan");
        personsMap.put("Bob", "Myroslav");
        personsMap.put("Kaban", "Serhiy");
        personsMap.put("Svych", "Orest");
        personsMap.put("Bubka", "Serhiy");
        personsMap.put("Bandera", "Stepan");
        personsMap.put("Svych", "Orest");
        personsMap.put("Kudryaviy", "Mykola");
        personsMap.put("Pohilko", "Anatoliy");
        System.out.println("output");
        for (Map.Entry contain : personsMap.entrySet()) {
            System.out.println(contain.getKey() + " " + contain.getValue());
        }
///         ===== Task remove orest


        System.out.println();
        Iterator<String> iterator = personsMap.values().iterator();
        while (iterator.hasNext()) {
            String current = iterator.next();
            System.out.println("element " + current);
            if (current.contains("Orest")) {
                iterator.remove();
            }

        }
    }


//              =====Third Task
    public static void thirdTask() {
        List<Students> students = new LinkedList<>();
        students.add(new Students("Yaroslav", 4));
        students.add(new Students("Vladyslav", 5));
        students.add(new Students("Yaromyr", 1));
        students.add(new Students("Adam", 2));
        students.add(new Students("Bratyslav", 4));
        students.add(new Students("Grigoriy", 3));

        System.out.println("====== UNSORTED LIST=======");
        for (Students student : students){
            System.out.println(student.getName() +" study on "+ student.getCourse() + " course" );
        }
        System.out.println("======= SORTED LIST BY NAME =====");
        Collections.sort(students,Students.nameComparator());
         for (Students student : students){
             System.out.println(student.getName() + " " + student.getCourse());
         }

        System.out.println("======== Sorted by course =======");
         Collections.sort(students,Students.courseComparator());
         for (Students student : students){
             System.out.println(student.getName() + " " + student.getCourse() ) ;
         }
    }

}

