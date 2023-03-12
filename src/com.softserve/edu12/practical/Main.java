package com.softserve.edu12.practical;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(
                """
                PRACTICAL TASK
                1)Show which today is a day of a week
                2)Show a date of first Monday for current month
                3)Write a method for sorting list of Strings using Java 8
                """);

        System.out.println(LocalDate.now().getDayOfWeek());


        LocalDate localDate = LocalDate.now();
        TemporalAdjuster firstMondayInMonth = TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY);
        System.out.println("Date of first monday in " + localDate.getMonth()+ " : " + localDate.with(firstMondayInMonth));


        List<String> string = Arrays.asList("Victoria", "Oleksandr", "Oleg", "Natalia");
        string.sort((s1,s2)->s1.compareTo(s2));
        System.out.println(string);
    }
}

