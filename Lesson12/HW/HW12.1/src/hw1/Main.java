package hw1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a, b;

        try {
            System.out.print("Enter the first number: ");
            a = Double.parseDouble(scanner.nextLine());

            System.out.print("Enter the second number: ");
            b = Double.parseDouble(scanner.nextLine());

            double result = div(a, b);
            System.out.println("Result : " + result);
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid input format");
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static double div(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }

        return a / b;
    }
}
