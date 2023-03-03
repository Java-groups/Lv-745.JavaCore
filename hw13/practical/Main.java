import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println("--------FIRST TASK. ----------");
        List<String> list = Arrays.asList("bla", "", "simp","", "second", "third", "third", "sec", "blablabla");
        System.out.println("Count of empty: "+list.stream().filter(String::isEmpty).count());
        List<String> notEmpty;
        notEmpty = list.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
        System.out.println("Not empty elements: "+notEmpty);
        System.out.println("Uppercase string: "+ notEmpty.stream().map(String::toUpperCase).collect(Collectors.joining(",")));
        System.out.println("--------SECOND TASK. ----------");
        List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
        System.out.println("Elements count: "+primes.stream().count());
        IntSummaryStatistics stats = primes.stream().mapToInt((x) -> x).summaryStatistics();
        System.out.println("Max value: "+stats.getMax());
        System.out.println("Min value " + stats.getMin());
        System.out.println("Sum: "+stats.getSum());
    }

}
