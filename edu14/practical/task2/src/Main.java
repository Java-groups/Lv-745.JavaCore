import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
        System.out.println("Elements count: " + primes.stream().count());
        IntSummaryStatistics numbers = primes.stream().mapToInt((x) -> x).summaryStatistics();
        System.out.println("Min value: " + numbers.getMin());
        System.out.println("Max value " + numbers.getMax());
        System.out.println("Sum of numbers: " + numbers.getSum());
    }
}