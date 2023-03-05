package hw4;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Встановити мій день народження
        LocalDate birthday = LocalDate.of(1985, 9, 2);

        // Викликаю метод із параметром Д.Н.
        printDayOfWeek(birthday);
    }

    public static void printDayOfWeek(LocalDate date) {
        // Надрукувати день тижня до вказаної дати
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        System.out.println("Day of the week: " + dayOfWeek);

        // Надрукувати день тижня після 6 місяців від вказаної дати
        LocalDate afterSixMonths = date.plusMonths(6);
        DayOfWeek dayOfWeekAfterSixMonths = afterSixMonths.getDayOfWeek();
        System.out.println("Day of the week after 6 months: " + dayOfWeekAfterSixMonths);

        // Надрукувати день тижня після 12 місяців від вказаної дати
        LocalDate afterTwelveMonths = date.plusMonths(12);
        DayOfWeek dayOfWeekAfterTwelveMonths = afterTwelveMonths.getDayOfWeek();
        System.out.println("Day of the week after 12 months: " + dayOfWeekAfterTwelveMonths);
    }
}
