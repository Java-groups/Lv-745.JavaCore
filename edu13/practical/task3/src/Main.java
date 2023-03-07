import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Anna", "Arina", "Inna", "Olga", "Karina", "Eva");
        strings.sort((s1,s2) -> s1.compareTo(s2));
        System.out.println(strings);
    }
}