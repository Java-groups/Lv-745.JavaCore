import java.util.function.Predicate;

public class Main {
    public static int count(int[] array, Predicate<Integer> predicate){
        int count = 0;
        for (Integer n: array) {
            if (predicate.test(n)) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] numbers = {10, 25, 50, 84, 102, 541};
        int count = count(numbers, n -> n % 2 == 0);
        System.out.println("The count of even numbers in the array is " + count);
    }
}