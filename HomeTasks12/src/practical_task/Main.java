package practical_task;

import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        run();
    }

    private static void run() {
        dateOperations();
        System.out.println("Sorted list: " + sortList());
        System.out.println("Count: " + count(createAList(), x -> x > 5));


    }

    private static void dateOperations() {
        System.out.println("Today is: " + LocalDateTime.now().getDayOfWeek());

        LocalDateTime currentTime = LocalDateTime.now();
        LocalDateTime firstMonInMonth = currentTime.with(TemporalAdjusters.firstDayOfMonth());
        System.out.println("First Monday in out month: " + firstMonInMonth);
    }

    private static String sortList() {
        List<String> list = Arrays.asList("Alex", "Mira", "Bombs", "Linda");
        list.sort((s1, s2) -> s1.compareTo(s2));
        return list.toString();
    }

    private static ArrayList<Integer> createAList() {
        System.out.print("Enter the size of the massive: ");
        int size = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>(size);
        System.out.print("Enter 10 integers: ");
        for (int i = 0; i < size; i++) {
            list.add(sc.nextInt());
        }
        return list;
    }

    private static int count(ArrayList<Integer> list, Predicate<Integer> condition) {
        int count = 0;
        for (Integer num : list) {
            if (condition.test(num)) {
                count++;
            }
        }
        return count;
    }
}
