package Homework4_Loops;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        int[] array = new int[5];
        int count = 0;
        int j = 0;
        int k = 0;
        int min;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 5 integer number: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }
        min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                k = i;
                System.out.print(array[i] + " ");
            }
        }
        System.out.print("\nPosition of minimum number is " + k + "\nMin = " + min);
        for (int i = 0; i < 5; i++) {
            if ((array[i] > 0) && (count < 2)) {
                count++;
                j = i;
            }
        }
        if (count == 2) {
            System.out.print("\nPosition of second positive number is " + j);
        } else {
            System.out.print("\nThere is no second positive number in this array");
        }
    }
}