package Homework3_If.Task3_Version2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter code of HTTP error: ");
        int errorNumber = input.nextInt();
        switch (errorNumber) {
            case 400:
                System.out.println(Errors.BAD_REQUEST.getTitle());
                break;
            case 402:
                System.out.println(Errors.UNAUTHORIZED.getTitle());
                break;
            case 403:
                System.out.println(Errors.PAYMENT_REQUIRED.getTitle());
                break;
            default:
                System.out.println("Wrong error code");
        }
    }
}