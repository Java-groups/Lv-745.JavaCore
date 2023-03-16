package com.softserve.edu11.hwtask2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

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
                HW TASK 2
                Write a method readNumber(int start, int end), that read from console integer number and return it, if it is in the range [start...end].
                If an invalid number or non-number text is read, the method should throw an exception.
                Using this method write a method main(), that has to enter 10 numbers:
                a1, a2, ..., a10, such that 1 < a1 < ... < a10 < 100""");

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

    }
}

