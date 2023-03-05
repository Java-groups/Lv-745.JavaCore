package pt2;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);

        // Calculate and print count, min, max, and sum
        long count = primes.stream().count();
        int min = primes.stream().mapToInt(Integer::intValue).min().orElse(0);
        int max = primes.stream().mapToInt(Integer::intValue).max().orElse(0);
        int sum = primes.stream().mapToInt(Integer::intValue).sum();

        System.out.println("Original list: " + primes);
        System.out.println("Count: " + count);
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
        System.out.println("Sum: " + sum);
    }
}
