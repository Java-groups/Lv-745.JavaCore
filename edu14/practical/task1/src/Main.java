import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;



public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("bla", "", "simp", "", "second", "third", "third", "sec", "blablabla");
        long count = list.stream()
                .filter(string -> !string.isEmpty())
                .count();
        System.out.println("There are " + count + " empty strings in this list");
        List<String> filtered = list.stream()
                .filter(string -> !string.isEmpty())
                .collect(Collectors.toList());
        System.out.println(filtered);
        List<String> uppercase = Collections.singletonList(filtered.stream()
                .map(String::toUpperCase)
                .collect(Collectors.joining(",")));
        System.out.println("Uppercase string: " + uppercase);

    }
}