import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main {

    public static int count (int[] array, Predicate<Integer> condition){
        int counter = 0;
        for (Integer element : array){
            if (condition.test(element)) {
                counter++;
            }
        }
        return counter;
    }
    public static void main(String[] args) {
        System.out.println(
                """
                PRACTICAL TASKS
                1)Show which today is a day of a week
                2)Show a date of first Monday for current month
                3)Write a method for sorting list of Strings using Java 8
                4)Create array Integers which has 10 elements,
                create method count() that takes an array of integers as the first parameter and functional interface as the second parameter,
                that functional interface works with integers and defines a condition.
                Method count() return count of elements in array that satisfy the condition defined by the second argument.
                """);

        //PRACTICAL TASK 1
        System.out.println(LocalDate.now().getDayOfWeek());

        //PRACTICAL TASK 2
        LocalDate localDate = LocalDate.now();
        TemporalAdjuster firstMondayInMonth = TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY);
        System.out.println("Date of first monday in " + localDate.getMonth()+ " : " + localDate.with(firstMondayInMonth));

        //PRACTICAL TASK 3
        List<String> string = Arrays.asList("Victoria", "Oleksandr", "Oleg", "Natalia");
        string.sort((str1,str2)->str1.compareTo(str2));
        System.out.println("Sorted:" + string);

        //PRACTICAL TASK 4
        int [] numbers = {-4,0,2,3,24,121,-54,21,3,10};
        System.out.println(count(numbers,x->x%2==0));

    }
}

