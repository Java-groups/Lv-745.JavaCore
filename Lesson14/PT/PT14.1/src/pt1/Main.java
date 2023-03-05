package pt1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("bla", "", "simp", "", "second", "third", "third", "sec", "blablabla");
        // рахуємо порожні рядки
        long emptyCount = list.stream().filter(String::isEmpty).count();
        System.out.println("Empty count: " + emptyCount);

        //Видаляємо порожні рядки
        List<String> filteredList = list.stream().filter(s -> !s.isEmpty()).collect(Collectors.toList());
        System.out.println("Filtered list: " + filteredList);

        //Перетворюємо текст у великі букви і розділяємо комою
        String joinedUppercase = filteredList.stream().map(String::toUpperCase).collect(Collectors.joining(", "));
        System.out.println("Joined uppercase: " + joinedUppercase);
    }
}
