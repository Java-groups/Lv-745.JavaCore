import java.time.DayOfWeek;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate birthday = LocalDate.of(1992, 4, 29);
        printDayOfWeek(birthday);
    }
    public static void printDayOfWeek(LocalDate date) {
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        System.out.println("The day of the week for " + date + " is " + dayOfWeek);

        LocalDate sixMonthsLater = date.plusMonths(6);
        DayOfWeek dayOfWeekSixMon = sixMonthsLater.getDayOfWeek();
        System.out.println("The day of the week for " + sixMonthsLater + " is " + dayOfWeekSixMon);

        LocalDate twelveMonthsLater = date.plusMonths(12);
        DayOfWeek dayOfWeekTwelveMon = twelveMonthsLater.getDayOfWeek();
        System.out.println("The day of the week for " + twelveMonthsLater + " is " + dayOfWeekTwelveMon);
    }
}