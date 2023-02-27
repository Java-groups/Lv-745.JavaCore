import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println(div(2, 0));
        } catch (MyException e){
            System.out.println(e.getMessage());
        }

        int[] numbers = new int[10];
        int start = 1;
        int end = 100;

        for (int i = 0; i < 10; i++) {
            System.out.printf("Enter number %d: ", i + 1);
            try {
                int number = readNumber(start, end);
                if (i > 0 && number <= numbers[i - 1]) {
                    throw new IllegalArgumentException("Number must be greater than previous number.");
                }
                numbers[i] = number;
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter an integer between 1 and 100.");
                i--;
            }
        }

        System.out.println("Numbers entered: ");
        for (int number : numbers) {
            System.out.println(number);
        }

    }

    static int div (int a, int b) throws MyException{

        if (b == 0) {
            throw new MyException("You can't divide by 0");
        }

        return a / b;
    }

    public static int readNumber(int start, int end) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number < start || number > end) {
            throw new IllegalArgumentException("Number must be between " + start + " and " + end + ".");
        }

        return number;
    }

}