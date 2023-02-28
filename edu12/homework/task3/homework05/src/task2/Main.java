package task2;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] array = new int[10];
        System.out.println("Please enter array elements");

        for(int i = 0; i < array.length; i++){
            try {
                array[i] = input.nextInt();
            }catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter an integer.");
                input.next();
                i--;
            }
        };
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        };

        Task2.getProductLast5(array);
        Task2.getSumFirst5(array);
        Task2.printResult(array);
    }
}
