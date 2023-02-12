package array1;

import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        int[] monthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < monthDays.length; i++){
            System.out.println("Введіть число: ");
            int value = scanner.nextInt();
            System.out.println("Кількість днів у місяці - " + monthDays[value]);
        }

    }
}
