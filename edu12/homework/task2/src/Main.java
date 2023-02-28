import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static int readNumber(int start, int end) throws Exception {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a number between " + start + " and " + end + ": ");
    int num;
    try {
        num = scanner.nextInt();
    } catch (InputMismatchException e) {
        throw new Exception("Invalid number entered");
    }
    if (num < start || num > end) {
        throw new Exception("Number is not in the range [" + start + ", " + end + "]");
    }
    return num;
}

    public static void main(String[] args) {
        int start = 1;
        int end = 100;
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            try {
                if (i == 0) {
                    numbers[i] = readNumber(start, end);
                } else {
                    numbers[i] = readNumber(numbers[i-1], end);
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage() + ", please try again.");
                i--;
            }
        }

        System.out.println("The numbers you entered are:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}