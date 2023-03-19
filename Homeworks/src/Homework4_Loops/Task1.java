package Homework4_Loops;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number of month: ");
        int monthNumber = input.nextInt();
        int[] monthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        System.out.println("This month has " + monthDays[monthNumber - 1] + " days");
    }
}