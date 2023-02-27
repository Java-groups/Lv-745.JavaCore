package hw2;

import java.util.Scanner;

public class Main {


        public static int readNumber(int start, int end) throws Exception {
            Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt();
            if (number < start || number > end) {
                throw new Exception("Number is not in the range [" + start + "..." + end + "]");
            }
            return number;
        }

        public static void main(String[] args){
            int[] numbers = new int[10];
            try {
                System.out.println("Please enter 10 numbers such that 1 < a1 < ... < a10 < 100:");
                int start = 1;
                int end = 100;
                for (int i = 0; i < 10; i++) {
                    numbers[i] = readNumber(start, end);
                    start = numbers[i] + 1;
                }
                System.out.println("The entered numbers are:");
                for (int number : numbers) {
                    System.out.print(number + " ");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

    }

