import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class Main {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println("Today is " + today.getDayOfWeek());

        System.out.println("The date of the first Monday for the current month is " + today.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY)));
    }
}