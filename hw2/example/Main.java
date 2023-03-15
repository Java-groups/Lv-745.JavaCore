package example;

import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {

        DecimalFormat ft = new DecimalFormat("#####.##");

        Student exmpl = new Student();
        Student oleg = new Student("Oleg", 9.2);
        Student vasyl = new Student("Vasyl", 10.4);

        System.out.println("Average: " + ft.format(Student.avgRating(exmpl.getRating(), oleg.getRating(), vasyl.getRating())) + "\nTotal Rating: " + Student.totalRating);
    }
}
