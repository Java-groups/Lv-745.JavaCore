package homeWork11.Exceptions.homeWork;

import java.util.Scanner;

public class Main {


        public static int readNumber(int start, int end) throws Exception {
            Scanner scanner = new Scanner(System.in);
            int num = scanner.nextInt();
            if (num < start || num > end) {
                throw new Exception("Number is not within range " + start + ", " + end + "");
            }
            return num;
        }

        public static void main(String[] args) {
            int[] numbers = new int[10];
            int prev = 1;
            for (int i = 0; i < 10; i++) {
                try {
                    System.out.print("Enter number a" + (i+1) + " (must be > " + prev + " and < 300): ");
                    int num = readNumber(prev + 1, 300);
                    numbers[i] = num;
                    prev = num;
                } catch  (ArithmeticException m) {
                    System.out.println("Enter number " + m.getMessage());
                    i--; // retry input
                }
                catch (Exception e){
                    System.out.println("Invalid input: " + e.getMessage());
                    i--; // retry input
                }
            }
            System.out.println("Entered numbers: ");
            for (int num : numbers) {
                System.out.print(num + " ");
            }
        }
    }



