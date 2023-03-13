package src;

import java.util.Scanner;

public class Task7 {
    static Scanner sc = new Scanner(System.in);

    public static void getFactorial() {
        System.out.print("Enter the number: ");
        int number = sc.nextInt();
        int factorial = 1;
        for (int i = 0; i < number; i++) {
            factorial = factorial * number;
        }
        System.out.println("Factorial: " +factorial);
    }
}
