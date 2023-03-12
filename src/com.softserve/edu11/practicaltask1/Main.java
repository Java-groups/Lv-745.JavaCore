package com.softserve.edu11.practicaltask1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    private static int squareRectangle(int a, int b) throws NegativeValueException {
        if ((a * b) <= 0) {
            throw new NegativeValueException("Oops! Input must be positive `+value` !");
        }
        return a * b;
    }
    public static void main(String[] args)  {
        System.out.println(
                """
                PRACTICAL TASK 1
                Create a method for calculating the area of a rectangle
                int squareRectangle (int a, int b),
                which should throw an exception if the user enters negative value. Input values a and b from console. Check the squareRectangle method in the method main. Check to input nonnumeric value.""");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int length = 0;
        int width = 0;
        int area;
        System.out.println("Enter length and width of rectangle, each from new line: ");

        try {
            length = Integer.parseInt(br.readLine());
            width = Integer.parseInt(br.readLine());
        } catch (NumberFormatException | IOException e) {
            System.err.println("Oops! Enter integer value!");
        }

        try {
            area = squareRectangle(length, width);
            System.out.println("Area of rectangle: " + area);
        } catch (NegativeValueException e){
            System.err.println(e.getMessage() + "\n" + Arrays.toString(e.getStackTrace()));
        }

    }
}

