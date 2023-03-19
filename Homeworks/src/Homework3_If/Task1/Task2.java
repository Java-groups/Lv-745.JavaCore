package Homework3_If.Task1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first int number: ");
        int number1 = input.nextInt();
        System.out.print("Enter second int number: ");
        int number2 = input.nextInt();
        System.out.print("Enter third int number: ");
        int number3 = input.nextInt();
        if ((number1 > number2) && (number1 > number3)) {
            System.out.println(number1 + " is max");
        } else if ((number2 > number1) && (number2 > number3)) {
            System.out.println(number2 + " is max");
        } else System.out.println(number3 + " is max");
        if ((number1 < number2) && (number1 < number3)) {
            System.out.println(number1 + " is min");
        } else if ((number2 < number1) && (number2 < number3)) {
            System.out.println(number2 + " is min");
        } else System.out.println(number3 + " is min");
    }
}