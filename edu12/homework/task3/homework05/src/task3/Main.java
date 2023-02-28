package task3;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        int[] arr = new int[5];
        System.out.println("Please enter array elements");

        for(int x = 0; x < arr.length; x++){
            try {
                arr[x] = input.nextInt();
            }catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter an integer.");
                input.next();
                x--;
            }
        };
        for(int x = 0; x < arr.length; x++){
            System.out.println(arr[x]);
        };
        Task3.positionOfSecond(arr);
        Task3.positionOfMin(arr);
        Task3.productOfAll(arr);
        Task3.printResult();

    }
}
