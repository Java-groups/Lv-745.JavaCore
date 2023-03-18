import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    private static double div(double numerator, double denominator) throws Exception {
        if (denominator == 0) {
            throw new ArithmeticException();
        }
        return numerator / denominator;
    }

    public static int readNumber(int start, int end) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num;

        System.out.print("Enter int-number in range [" + start + " , " + end + "]: ");

        try {
            num = Integer.parseInt(br.readLine());
        } catch (NumberFormatException e) {
            throw new Exception("Oops! Enter int-number! Repeat input: ");
        } catch (IOException e) {
            throw new Exception("Error br.readLine()!");
        }

        if (num < start || num > end) {
            throw new OutOfRangeException( num + " is out of range. Repeat input: ");
        }
        return num;
    }

    public static void main(String[] args) throws OutOfRangeException {
        System.out.println(
                """
                HW TASKS
                1)Create method div(), which calculates the dividing of two double numbers.
                In main method input 2 double numbers and call this method.
                Catch all exceptions.
                2)Write a method readNumber(int start, int end), that read from console integer number and return it, if it is in the range [start...end].
                If an invalid number or non-number text is read, the method should throw an exception.
                Using this method write a method main(), that has to enter 10 numbers:
                a1, a2, ..., a10, such that 1 < a1 < ... < a10 < 100
                3)Refactor your previous homework (1-7) and try to handle all possible exceptions in your code.
                """);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //HW TASK 1
        try {
            System.out.println("\nEnter numerator and denominator, each from new line: ");
            double numerator = Double.parseDouble(br.readLine());
            double denominator = Double.parseDouble(br.readLine());
            double resultDivide = div(numerator, denominator);
            System.out.println("Result of dividing: " + resultDivide);
        } catch (ArithmeticException e) {
            System.err.println("Divide by zero!");
        } catch (Exception e) {
            System.err.println("Invalid input!");
        }


        //HW TASK 2
        System.out.println("\n");
        int[] numbers = new int[10];
        int currentNumber = 1;
        int end = 100;
        for (int step = 0; step < numbers.length; step++) {
            try {
                numbers[step] = readNumber(currentNumber, end);
                currentNumber = ++ numbers[step];
            } catch (Exception e) {
                System.err.print(e.getMessage());
                step--;
            }
            if(currentNumber > end - step ){
                throw new OutOfRangeException( currentNumber + " is out of range for both sides!. Restart program! ");
            }
        }
        System.out.println("\nnumbers: " + Arrays.toString(numbers));


        /*HW TASK 3
        check out hw11/homework/hw2.homework/Main.java
        There are exceptions based on HW2 homework
        */

    }
}

