package practical_task;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        run();
    }

    private static void run() {
        List<String> list = Arrays.asList("bla", "", "simp", "", "second", "third", "third", "sec", "blablabla");
        operateList(list);

        List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
        calculateCollections(primes);
    }

    private static void operateList(List<String> list) {
        long count = list.stream().filter(string -> string.isEmpty()).count();
        System.out.println("count of empty strings: " + count);
        List<String> filtered = list.stream().filter(string -> !string.isEmpty()).toList();
        System.out.println("Filtered: " + filtered);
        String converted = filtered.stream().map(String::toUpperCase).collect(Collectors.joining(","));
        System.out.println("Converted: " + converted);
    }

    private static void calculateCollections(List<Integer> primes) {
        IntSummaryStatistics stats = primes.stream().mapToInt(x -> x).summaryStatistics();
        System.out.println("count -- " + stats.getCount());
        System.out.println("min -- " + stats.getMin());
        System.out.println("max -- " + stats.getMax());
        System.out.println("sum -- " + stats.getSum());
    }
}
