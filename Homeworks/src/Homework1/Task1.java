package Homework1;

import java.util.Scanner;

import static java.lang.Math.pow;

public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a radius: ");
        int radius = input.nextInt();
        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * pow(radius, 2);
        System.out.println("Area = " + area);
        System.out.println("Perimeter = " + perimeter);
    }
}