package pt3;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        // Create a list of strings
        ArrayList<String> strings = new ArrayList<>();
        strings.add("banana");
        strings.add("apple");
        strings.add("pear");
        strings.add("orange");

        // Sort the list using Java 8
        // Це покаже нам список рядків, відсортованих в алфавітному порядку.
        // Лямбда-вираз (s1, s2) -> s1.compareTo(s2) використовується як компаратор для порівняння двох рядків
        // і повернення від’ємного числа, якщо перший рядок менший за другий, і позитивного числа,
        // якщо перший рядок більший. ніж другий рядок, або нуль, якщо рядки рівні.
        // Метод Collections.sort() використовує цей компаратор для сортування списку рядків.
        Collections.sort(strings, (s1, s2) -> s1.compareTo(s2));


        System.out.println(strings);
    }
}
