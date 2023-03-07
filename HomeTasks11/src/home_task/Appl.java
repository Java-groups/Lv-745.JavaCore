package home_task;

import practical_task.MyException;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Appl {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        run();
    }

    private static void run() {

        System.out.println("Enter number 1: ");
        double a = sc.nextDouble();
        System.out.println("Enter number 2: ");
        double b = sc.nextDouble();

        try {
            System.out.println("Result " + div(a, b));
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException works");
        } catch (InputMismatchException e) {
            System.out.println("InputMismatchException works");
        }

        int start = 1;
        int end = 100;
        try {
            System.out.println(Arrays.toString(readNumber(start, end)));
        } catch (MyException | InputMismatchException e) {
            System.err.println(e.getMessage());
        }

    }

    private static double div(double a, double b) throws ArithmeticException, InputMismatchException {
        if (b != 0) {
            return a / b;
        } else {
            throw new ArithmeticException();
        }
    }

    private static int[] readNumber(int start, int end) throws InputMismatchException, MyException {
        int size = 10;
        int previous = start;
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            try {
                System.out.print("Enter the " + (i + 1) + " number: ");
                numbers[i] = sc.nextInt();
            } catch (InputMismatchException e) {
                throw new InputMismatchException("-- you must enter the integer number --");
            }

            if (numbers[i] < start || numbers[i] > end) {
                throw new MyException("Number is out of range");
            }

            if (numbers[i] < previous || numbers[i] > end) {
                throw new MyException("Number is out of range or [ a" + i + " < a" + (i - 1) + " ]");
            }

            previous = numbers[i];
        }
        return numbers;
    }

}
