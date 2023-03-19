package Homework3_If.Task3_Version1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of HTTP error: ");
        int errorNumber = input.nextInt();
        if (errorNumber == Errors.BAD_REQUEST.getCode()) {
            System.out.println(Errors.BAD_REQUEST.getTitle());
        }
        if (errorNumber == Errors.UNAUTHORIZED.getCode()) {
            System.out.println(Errors.UNAUTHORIZED.getTitle());
        }
        if (errorNumber == Errors.PAYMENT_REQUIRED.getCode()) {
            System.out.println(Errors.PAYMENT_REQUIRED.getTitle());
        }
    }
}