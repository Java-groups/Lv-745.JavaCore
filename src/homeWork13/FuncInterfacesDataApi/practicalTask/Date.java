package homeWork13.FuncInterfacesDataApi.practicalTask;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Date {

    //Task 2

        public static void main(String[] args) {

            // ==== Task 1 which day today
            System.out.println("==========Task 1 =============");
            System.out.printf("Today is  %tA%n", LocalDateTime.now(),"%n");

            // ==== Task 2
            System.out.println("==========Task 2 =============");
            LocalDate today = LocalDate.now();
            LocalDate firstMonday = today.withDayOfMonth(1).with(DayOfWeek.MONDAY);
            System.out.println("The date of the first Monday for the current month is " + firstMonday);

            // ====== Task 3 sorting with lamda
            System.out.println("==========Task 3 =============");
            ArrayList<String> array = new ArrayList<String>();
            array.add("Chicago");
            array.add("Budapesht");
            array.add("Lviv");
            array.add("Texas");
            array.add("Almata");
            array.sort((s1, s2) -> s1.compareTo(s2));
            System.out.println("alfabeting sorting "  + array);

            // ======== Task 4
            System.out.println("==========Task 4 =============");



        }
    }


