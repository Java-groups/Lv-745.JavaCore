package homeWork14StreamApi.practicalTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {

        //      =======default=======
        System.out.println("==========default=======");
        List<String> list23 = Arrays.asList("bla", "", "simp",
                "", "second", "third", "third", "sec", "blablabla");
        System.out.println(list23);
        // ======== task 1 =========
        List<String> list = Arrays.asList("bla", "", "simp", "", "second", "third", "third", "sec", "blablabla");
        long count = list.stream().filter(i -> i.isEmpty()).count();
        System.out.println("======= task 1 ======");
        System.out.println(count);

        // ========== task 2 ===========
        System.out.println("task 2 =======");
        List<String> list1 = new ArrayList<>(Arrays.asList("bla", "", "simp", "", "second", "third", "third", "sec", "blablabla"));
        list1.removeIf(String::isEmpty);
        System.out.println(list1);
        // ========== task 3 ===========
        System.out.println("========== task 3 ========");
        List<String> list3 = Arrays.asList("bla", "", "simp", "", "second", "third", "third", "sec", "blablabla");
        String chengeList = list3.stream()
                .filter(x ->!x.isEmpty())
                .map(String::toUpperCase)
                .collect(Collectors.joining(","));
        System.out.println(chengeList);


        // =========== Task 4 ==========
        System.out.println("========= TAsk 5 ==========");
        List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);

        long count1 = primes.stream().count();
         Optional<Integer> min = primes.stream().reduce(Integer::min);
         Optional<Integer> max = primes.stream().reduce(Integer::max);
         int result4 = primes.stream().reduce(0,Integer::sum);


        System.out.println(count1);
        System.out.println(min);
        System.out.println(max);
        System.out.println(result4);

    }
}