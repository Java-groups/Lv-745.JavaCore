package Homework4_Loops;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        int sum = 0;
        int product = 1;
        boolean fistFiveNumbersArePositive = true;
        int[] array = new int[10];
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 10 integer number: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        for (int i = 0; i < 5; i++) {
            if (array[i] < 0) {
                fistFiveNumbersArePositive = false;
                break;
            }
        }
        System.out.println("\nAre 5 first numbers positive? " + fistFiveNumbersArePositive);
        for (int i = 0; i < 5; i++) {
            sum += array[i];
        }
        for (int i = 9; i > 4; i--) {
            product *= array[i];
        }
        if (fistFiveNumbersArePositive == true) {
            System.out.println("Sum of first 5 numbers is " + sum);
        } else
            System.out.println("Product of last 5 numbers is " + product);
    }
}