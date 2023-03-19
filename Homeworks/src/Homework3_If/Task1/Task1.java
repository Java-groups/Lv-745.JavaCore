package Homework3_If.Task1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first float number: ");
        float number1 = input.nextFloat();
        System.out.println("-5 > " + number1 + " > 5 " + ((number1 > -5) && (number1 < 5)));
        System.out.print("Enter second float number: ");
        float number2 = input.nextFloat();
        System.out.println("-5 > " + number2 + " > 5 " + ((number2 > -5) && (number2 < 5)));
        System.out.print("Enter third float number: ");
        float number3 = input.nextFloat();
        System.out.println("-5 > " + number3 + " > 5 " + ((number3 > -5) && (number3 < 5)));
    }
}