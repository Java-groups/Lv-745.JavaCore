import java.util.Scanner;

public class TaskNine {
    public void execute() {

        int count = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        for (int i = 0; i < num; i++) {
            int random = (int) Math.floor(Math.random() * (1 - 0 + 1) + 0);
            System.out.print(random + " ");
            if (random == 1) {
                count++;
            }
        }
        System.out.println();
        System.out.println("Total number of 1: " + count);
    }
}