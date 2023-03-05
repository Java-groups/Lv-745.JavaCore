package pt1;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Отримаємо сьогоднішню дату
        LocalDate today = LocalDate.now();

        // Отримаємо день тижня для сьогоднішньої дати
        DayOfWeek dayOfWeek = today.getDayOfWeek();

        // Роздруковуємо день тижня
        System.out.println("Today is " + dayOfWeek);
    }
}
