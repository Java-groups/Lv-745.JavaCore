package homeWork12.FuncInterdacesDataApi.practicalTask;

import java.util.function.IntPredicate;

public class ArrayCounter {
    public static int count(Integer[] array, IntPredicate condition) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (condition.test(array[i])) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        // Create an array of 10 integers
        Integer[] integers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Define a condition using a lambda expression
        IntPredicate condition = x -> x % 2 == 0; // even numbers

        // Call the count() method with the array and condition
        int count = count(integers, condition);

        // Print the count
        System.out.println("Count of even numbers in the array: " + count);
    }
}