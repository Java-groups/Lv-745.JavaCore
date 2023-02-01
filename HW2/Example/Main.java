package HW2;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Oleg", 86);
        Student student2 = new Student("Olena", 92);
        Student student3 = new Student("Pavlo", 73);

    System.out.println("Student1 is better than Student2 - " + student1.betterStudent(student2));
    System.out.println("Total rating: " + Student.getTotalRating());
    System.out.println("Average rating: " + Student.avgRating());







    }
}
