package pt2;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Отримаємо сьогоднішню дату
        LocalDate today = LocalDate.now();

        // Отримаємо перше число поточного місяця
        LocalDate firstDayOfMonth = today.withDayOfMonth(1);

        // Знайдемо перший понеділок поточного місяця
        LocalDate firstMonday = firstDayOfMonth;
        while (firstMonday.getDayOfWeek() != DayOfWeek.MONDAY) {
            firstMonday = firstMonday.plusDays(1);
        }

        // Друкуємо дату першого понеділка поточного місяця
        System.out.println("The date of the first Monday for the current month is: " + firstMonday);
    }
}
