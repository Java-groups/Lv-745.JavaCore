package src;

import java.util.Scanner;

public class TaskTwo {

    public void execute() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        for (int i = 2; i <= num; i++) {
            int count = 0;
            while (num % i == 0) {
                num /= i;
                count++;
            }
            if (count > 0) {
                System.out.print(i);
                if (count > 1) {
                    System.out.print("^" + count);
                }
                if (num > 1) {
                    System.out.print(" * ");
                }
            }
        }
    }
}
