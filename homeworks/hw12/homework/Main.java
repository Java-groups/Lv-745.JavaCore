package com.softserve.edu12.hwtask34;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Year;

public class Main {
    public static boolean isLeapYear(int year) {
        return Year.of(year).isLeap();
    }
    public static void printDayOfWeek(LocalDate date) {
        System.out.println("Day of the week: " + date.getDayOfWeek());

        LocalDate afterSixMonths = date.plusMonths(6);
        DayOfWeek dayOfWeekAfterSixMonths = afterSixMonths.getDayOfWeek();
        System.out.println("Day of the week after 6 months: " + dayOfWeekAfterSixMonths);

        LocalDate afterTwelveMonths = date.plusMonths(12);
        DayOfWeek dayOfWeekAfterTwelveMonths = afterTwelveMonths.getDayOfWeek();
        System.out.println("Day of the week after 12 months: " + dayOfWeekAfterTwelveMonths);
    }
    public static void main(String[] args) {
        System.out.println(
                """
                PRACTICAL TASK
                3. Create method which take year as a parameter and return true if year is a leap
                4. Create variable LocalDate birthday and set to that variable date your birthday.
                Create method that take as a parameter object LocalDate and print the day of the week and what was the day of the week after 6 months
                and what was the day of the week after 12 months.
                """);

        int year = LocalDate.now().getYear();
        System.out.println(year + " is a leap year? " + isLeapYear(year));

        LocalDate birthday = LocalDate.of(2004, 1, 24);
        printDayOfWeek(birthday);
    }
}
