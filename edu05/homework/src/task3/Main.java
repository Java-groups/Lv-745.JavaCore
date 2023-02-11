package task3;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        int[] arr = new int[5];
        System.out.println("Please enter array elements");

        for(int e = 0; e < arr.length; e++){
            arr[e] = input.nextInt();
        };
        for(int e = 0; e < arr.length; e++){
            System.out.println(arr[e]);
        };
        Task3.positionOfSecond(arr);
        Task3.positionOfMin(arr);
        Task3.productOfAll(arr);
        Task3.printResult();

    }
}
