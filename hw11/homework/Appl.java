import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Appl {
    public static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) {
        System.out.println("--------FIRST TASK. Create method div(), which calculates the dividing of two double numbers. ----------");
        taskOne();
        System.out.println("--------SECOND TASK. Write a method readNumber(int start, int end), that read from console integer.----------");
        taskTwo();
    }

    private static void taskOne(){
        try {
            System.out.print("Enter the first number: ");
            double num1 = Double.parseDouble(reader.readLine());
            System.out.print("Enter the second number: ");
            double num2 = Double.parseDouble(reader.readLine());
            double result = div(num1, num2);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        } catch (Exception e) {
            System.out.println("Invalid input");
        }
    }

    private static double div(double num1, double num2) throws Exception {
        if (num2 == 0) {
            throw new ArithmeticException();
        }
        return num1 / num2;
    }

    private static void taskTwo(){
        int start = 1;
        int end = 100;
        int[] numbers = new int[10];
        int prev = start - 1;
        for (int i = 0; i < numbers.length; i++) {
            try {
                numbers[i] = readNumber(prev+1, end);
                prev = numbers[i];
            } catch (Exception e) {
                System.out.println(e.getMessage());
                i--;
            }
        }
        System.out.println("Entered numbers: " + Arrays.toString(numbers));
    }

    public static int readNumber(int start, int end) throws Exception {
        System.out.print("Enter a number between " + start + " and " + end + ": ");
        int num = 0;
        try {
            num = Integer.parseInt(reader.readLine());
        } catch (NumberFormatException e) {
            throw new Exception("Invalid input. Please enter a valid number.");
        } catch (IOException e) {
            throw new Exception("An error occurred while reading input.");
        }

        if (num < start || num > end) {
            throw new Exception("Number is out of range.");
        }
        return num;
    }
}
