import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();
        if (isLeapYear(year)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }

    public static boolean isLeapYear(int year) {
        LocalDate date = LocalDate.of(year, Month.JANUARY, 1);
        LocalDate lastDayOfYear = date.with(TemporalAdjusters.lastDayOfYear());
        return lastDayOfYear.getDayOfYear() == 366;
    }
}