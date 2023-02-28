import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        System.out.println("--------FIRST TASK. Show which today is a day of a week. ----------");
        System.out.println(LocalDate.now().getDayOfWeek());
        System.out.println("--------SECOND TASK.Show a date of first Monday for current month. ----------");
        LocalDate localDate = LocalDate.of(2023, 2, 1);
        TemporalAdjuster firstMonInMonth = TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY);
        System.out.println(localDate.with(firstMonInMonth));
        System.out.println("--------THIRD TASK.Write a method for sorting list of Strings using Java 8. ----------");
        List<String> string = Arrays.asList("Victoria", "Oleksandr", "Oleg", "Natalia");
        string.sort((s1,s2)->s1.compareTo(s2));
        System.out.println(string);
        System.out.println("--------FORTH TASK.Create array Integers which has 10 elements, create method. ----------");
        int [] numbers = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(count(numbers,x->x>6));
    }
    public static int count (int[] arr, Predicate<Integer> condition){
        int count = 0;
        for (Integer num : arr){
            if (condition.test(num)){count++;}
        }
        return count;
    }
}
