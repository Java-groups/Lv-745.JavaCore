import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Inputting info for constructors
        Student stud1 = new Student(50);
        Student stud2 = new Student(20);
        Student stud3 = new Student("alex", 20);

        Scanner sc = new Scanner(System.in); // Scanner

        // Entering the name of students for setter
        System.out.print("Set the name of 1st Student: ");
        stud1.setName(sc.nextLine());

        System.out.print("Set the name of 2st Student: ");
        stud2.setName(sc.nextLine());

        // Outputting the average rating
        System.out.println("avg = " +stud3.avgRating());

        // Using toString for outputting info
        System.out.println("Info about stud1" +stud1.toString());
        System.out.println("Info about stud2" +stud1.toString());
        System.out.println("Info about stud3" +stud1.toString());

    }
}
