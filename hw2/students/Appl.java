package students;
public class Appl {
    public static void main(String[] args) {
        Student st1 = new Student("Ira", 4);
        Student st2 = new Student("Pasha", 3);
        Student st3 = new Student("Vasya", 5);
        System.out.println("STUDENTS INFO:");
        System.out.println("Students count:  " + Student.getStudentsCount());
        System.out.println("Total rating:    " + Student.getTotalRating());
        System.out.println("Average rating:  " + Student.avgRating());
        System.out.println("St1 to string:   " + st1);
        System.out.println("st2 better st3:  " + st2.betterStudent(st3));
    }

}
