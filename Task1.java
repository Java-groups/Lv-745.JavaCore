
import java.util.Scanner;

public class Task1 {
    static Scanner sc = new Scanner(System.in);

    public static void getFibonacci() {
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int prev = 0, curr = 1;
        System.out.print("Fibonacci sequence: ");
        for (int i = 0; i < n; i++) {
            System.out.print(curr + " ");
            int next = prev + curr;
            prev = curr;
            curr = next;
        }
    }
}
