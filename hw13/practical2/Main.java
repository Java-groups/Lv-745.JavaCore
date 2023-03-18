package practical2;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(
                """
                 PRACTICAL TASK
                 For given collection List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
                 calculate count, min, max, sum, for numbers and print all results""");

        List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);

        System.out.println("count of elements: " + primes.stream().count());

        IntSummaryStatistics stats = primes.stream().mapToInt((x) -> x).summaryStatistics();
        System.out.println("maximal value: " + stats.getMax()
                + "minimal value " + stats.getMin()
                + "sum of numbers: " + stats.getSum());

    }
}

